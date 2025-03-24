// O nome do arquivo principal deve ser sempre "index" ao utilizar o template de react-native com expo

import { Text, View , StyleSheet} from "react-native"; 

export default function Index() {
  return (
    <View style={styles.container}>
      <Text>Memória de Elefante</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F3F3FF',
    justifyContent: 'center',
    alignItems: 'center'
  }
})