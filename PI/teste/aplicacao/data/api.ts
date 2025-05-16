// Seção de integração com o frontend da aplicação

import AsyncStorage from '@react-native-async-storage/async-storage';
const API_URL = process.env.EXPO_PUBLIC_API_URL;
export const USER_STORAGE_KEY = 'userid';


const handleLogin = async () => {
  try {
    const response = await fetch(`${API_URL}`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({
        email: "usuario@teste.com",
        senha: "senha_nao_criptografada"
      }),
    });
    const data = await response.json();
    console.log(data); // Resposta do backend (sucesso/erro)
  } catch (error) {
    console.error("Erro na requisição:", error);
  }
};