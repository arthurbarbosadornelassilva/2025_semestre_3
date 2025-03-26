// O nome do arquivo principal deve ser sempre "index" ao utilizar o template de react-native com expo
import { useState } from 'react'
import { Text, View , StyleSheet, Image, TouchableOpacity, Modal} from "react-native"; 
import Slider from '@react-native-community/slider'
import { ModalPassword } from "../assets/components/modal"

let charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" //variavel com caracteres

export default function Index() {
  const [size, setSize] = useState(20)
  const [passwordValue, setPasswordValue] = useState("")
  const [modalVisible, setModalVisible] = useState(false);
  
  function generatePassword(){
    // return (console.log("CLICK!"))

    let password = "";
    for(let i = 0, n = charset.length; i < size; i++){
      password += charset.charAt(Math.floor(Math.random() * n))
    }

    // console.log(password)
    setPasswordValue(password)
    setModalVisible(true);
  }

  return (
    <View style={styles.container}>
      <Image
        source={require("../assets/images/CADEADO.png")}
        style={styles.logo}
      />
      <Text style={styles.title}>{size} caracteres</Text>

      <View style={styles.area}>
        <Slider
        style={{ height: 50}}
        minimumValue={4}
        maximumValue={20}
        value={size} //define que o valor de value equivale a size
        onValueChange={(value)=>setSize(parseInt(value.toFixed(0)))} //define o valor de size como sendo um dentro do range de valores 'value'
        maximumTrackTintColor="#FF0000"
        minimumTrackTintColor="#000"
        thumbTintColor="#392de9"
        />
      </View>

    <TouchableOpacity style={styles.button} onPress={generatePassword}>
      <Text style={styles.buttonText}>Gerar Senha</Text>
    </TouchableOpacity>

    <Modal visible={modalVisible} animationType='fade'>
      <ModalPassword/>
    </Modal>

    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F3F3FF',
    justifyContent: 'center',
    alignItems: 'center'
  },
  logo: {
    marginBottom: 30,
    width: 200,
    height: 200
  },
  area: {
    marginTop: 20,
    marginBottom: 20,
    width: "80%",
    backgroundColor: "#FFF",
    borderRadius: 8,
    padding: 20
  },
  button: {
    backgroundColor: "#392de2",
    width: "80%",
    height: 50,
    alignItems: "center",
    justifyContent: "center",
    borderRadius: 8,
    marginBottom: 20
  },
  buttonText: {
    color: "FFF",
    fontSize: 20,
  },
  title: {
    fontSize: 30,
    fontWeight: "bold",
  }
})