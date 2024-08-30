import { useRef, useState } from "react";
import "./App.css";

function App() {
    const [ name, setname ] = useState("");
    const [ inputData, setInputData ] = useState({...emptyUser});
    const emptyUser = {
        id : "",
        username : "",
        email : ""
    };
    const inputRef = {
        id : useRef(),
        username : useRef(),
        email : useRef()
    };
    

    const handleInputKeyDown = (e) => {
        if(e.keyCode === 13) {
            if(e.target.name === "username") {
                inputRef.email.current.focus();
            }
            if(e.target.name === "email") {
                handleSaveClick();
                inputRef.username.current.focus();
            }
        }
    }
    const handleSaveClick = (e) => {
        setInputData(inputData => ({
            ...inputData,
            [e.target.name] : e.target.value
        }));
    }
    return (
        <div className="container">
            <div className="box" placeholder="프로필">
                <div className="socer">
                    <h1>이름</h1>
                    <input 
                    type="text" 
                    name="username" 
                    placeholder="이름" 
                    onKeyDown={handleInputKeyDown} 
                    value={inputData.username} 
                    ref={inputRef.username}/>
                    <h2>이메일</h2>
                    <input 
                    type="text" 
                    name="email" 
                    placeholder="이메일" 
                    onKeyDown={handleInputKeyDown} 
                    value={inputData.email} 
                    ref={inputRef.email}/>
                    <button onClick={handleSaveClick} >저장</button>
                </div>
            </div>
        </div>
    );
}
export default App;