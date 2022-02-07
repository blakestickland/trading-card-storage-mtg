import axios from "axios";

class CardDataService {
  retrieveAllCards() {
    // console.log("executed service");
    return axios.get(`http://127.0.0.1:8080/cards`);
  }

//   retrieveTodo(name, id) {
//     // console.log("executed service");
//     return axios.get(`${JPA_API_URL}/users/${name}/todos/${id}`);
//   }

//   deleteTodo(name, id) {
//     // console.log("executed service");
//     return axios.delete(`${JPA_API_URL}/users/${name}/todos/${id}`);
//   }

//   updateTodo(name, id, todo) {
//     // console.log("executed service");
//     return axios.put(`${JPA_API_URL}/users/${name}/todos/${id}`, todo);
//   }

//   createTodo(name, todo) {
//     // console.log("executed service");
//     return axios.post(`${JPA_API_URL}/users/${name}/todos`, todo);
//   }
}

export default new CardDataService(); // exports an instance of the class.
