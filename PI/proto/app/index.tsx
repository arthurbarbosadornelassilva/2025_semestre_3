// O nome do arquivo principal deve ser sempre "index" ao utilizar o template de react-native com expo

import { Text, View , StyleSheet, Image} from "react-native"; 
import Slider from '@react-native-community/slider'

export default function Index() {
  return (
    <View style={styles.container}>
      <Image
        source={require("../assets/images/CADEADO.png")}
        style={styles.logo}
      />
      <Text>Caracteres</Text>

      <View style={styles.area}>
        <Slider
        />
      </View>
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
    marginBottom: 30
  },
  area: {
    marginTop: 20,
    marginBottom: 20,
    width: "80%",
    backgroundColor: "#FFF",
    borderRadius: 8,
    padding: 20
  }
})