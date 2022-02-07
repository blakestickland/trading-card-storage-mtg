import React from "react";
import styles from "./Home.module.scss";
import ListCardsComponent from "../../Components/ListCardsComponents";

const Home = () => {
    // // GET API
    // const [testEntity, setTestEntity] = useState("");

    // useEffect(() => {
    //   const getTestEntity = async () => {
    //       const response = await fetch (
    //           `https://127.0.0.1:8080/cards/test`
    //       )
    //   };
    //   getTestEntity();
    // }, []);


    
    
    return (
        <div className={styles}>
            TEST
            <ListCardsComponent />
        </div>
    );
}

export default Home;

