import { useState } from "react";

function App() {
    const [ inputValue, setInputValue ] = useState("");

    const handleInputChange = (e) => {
        setInputValue(e.target.value);
    } // App이 호출 될때 마다 재정의
    const handleResetClick = () => {
        setInputValue("");
    } // setInputValue 에 초기화 버튼을 정의
    return <>
    <h3>값 : {inputValue}</h3>
    <button onClick={handleResetClick}>초기화</button>
    <input type="text" onChange={handleInputChange} value={inputValue}/>
    </>
}
export default App;