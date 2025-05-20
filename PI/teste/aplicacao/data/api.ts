// Seção de integração com o frontend da aplicação

import AsyncStorage from '@react-native-async-storage/async-storage';
const API_URL = 'http://localhost:3000';
export const USER_STORAGE_KEY = 'userid';

//
// INTERFACES
//
export interface User {
  email: string;
  nome: string;
  senha: string;
  xata_createdat: Date;
  xata_id: string;
  xata_updatedat: Date;
  xata_version: number;
}

export const loginUser = async (set: Partial<User>) => {
  try {
    const response = await fetch(`${API_URL}/login_usuario`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({
        email: set.email,
        senha: set.senha
      }),
    });
    const data = await response.json();
    console.log(data); // Resposta do backend (sucesso/erro)

    if (response.ok) { // Verifique se a resposta foi bem-sucedida (status 2xx)
      // Persista os dados do usuário e o token no AsyncStorage
      const user = {
        email: data.user.email,
        nome: data.user.nome,
        xata_id: data.user.xata_id,
        // Adicione outros dados que você precisa persistir
      };
      // const userData = {
      //   user: user,
      //   token: data.token
      // }
      await AsyncStorage.setItem(USER_STORAGE_KEY, JSON.stringify(user));
      return user; // Retorne os dados para quem chamou a função
    } else {
      // Trate o erro de login (por exemplo, exibindo uma mensagem para o usuário)
      console.error("Erro no login:", data);
      throw new Error(data.error || "Erro ao fazer login"); // Lança o erro para ser capturado no catch
    }
  } catch (error) {
    console.error("Erro na requisição:", error);
  }
};