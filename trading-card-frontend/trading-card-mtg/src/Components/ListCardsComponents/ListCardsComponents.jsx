import React, { useState, useEffect } from "react";
// import CardDataService from "../../services/CardDataService";
import axios from "axios";


const ListCardsComponent = () => {
  const [cards, setCards] = useState([]);
  //   const [message, setMessage] = useState(null);
  //   const navigate = useNavigate();

  useEffect(() => {
    refreshCards();
  }, []);

  const refreshCards = () => {
    // CardDataService.retrieveAllCards
    //   .then((response) => {
    //   // setCards(response.data);
    //   console.log(response);
    // });
    axios.get(`http://127.0.0.1:8080/cards`)
      .then((response) => {
        console.log(response);
        setCards(response.data);
    });
  };
  return (
    <div>
      <h1>List Cards</h1>
      {/* {message && <div className="alert alert-success">{message}</div>} */}
      <div className="container">
        <table className="table">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Mana Cost</th>
              <th>Basic Type</th>
              <th>Detailed Type</th>
              <th>In Storage?</th>
            </tr>
          </thead>
          <tbody>
            {cards.map((card) => (
              <tr key={card.id}>
                <td>{card.id}</td>
                <td>{card.name}</td>
                <td>{card.manaCost}</td>
                <td>{card.basicType}</td>
                <td>{card.detailedType}</td>
                <td>{card.inStorage && card.inStorage.toString()}</td>
                <td>
                  <button
                    className="btn btn-success"
                    // onClick={() => updateTodoClicked(todo.id)}
                  >
                    Update
                  </button>
                </td>
                <td>
                  <button
                    className="btn btn-warning"
                    // onClick={() => deleteTodoClicked(todo.id)}
                  >
                    Delete
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <div>
          <button
            className="btn btn-success"
            // onClick={addTodoClicked}
          >
            Add
          </button>
        </div>
      </div>
    </div>
  );
};

export default ListCardsComponent;