import { useState } from "react";

function App() {
    const [ inputValue, setInputValue ] = useState("");
    const [ names, setNames ] = useState([]);
    const liList = [
        <li>{"test1"}</li>,
        <li>{"test2"}</li>,
        <li>{"test3"}</li>,
        <li>{"test4"}</li>,
    ] // 배열을 통째로 넣어도 랜더링을 해준다
    const handleInputChange = (e) => {
        setInputValue(e.target.value);
    }
    const handleInputKeyDown = (e) => {
        if(e.keyCode === 13) {
            setNames(names => [ ...names, inputValue ]); // 매개변수를 리턴
            setInputValue(""); // value 에 inputValue 를 넣어줘서 setInputValue(""); 를 사용해도 된다
        }
    }
    return <>
    <input onChange={handleInputChange} onKeyDown={handleInputKeyDown} value={inputValue}/>
    <ul>
        {liList}
        {names.map((name, index) => <li key={index}>{name}</li>)} 
        {/* 
           map 으로 새로운 name 을 출력 시켜준다 
             map 을 사용 하려면 key 값을 잡아 줘야한다
        */}
    </ul>
    </>
}
export default App;