import { useRef, useState } from "react";

function App() {
    const [ username, setUsername ] = useState("");
    const [ password, setPassword ] = useState("");
    const [ name, setName ] = useState("");

    const [ user, setUser ] = useState({...inputRef});
    const handleInputKeyDown = (e) => {
        if(e.keyCode === 13) {
            switch(e.target.name) {
                case "username":
                    inputRef.b.current.focus();
                    break;
                case "password":
                    inputRef.c.current.focus();
                    break;
                case "name":
                    inputRef.a.current.focus();
                    break;
                default:
            }
        }
    }
    return<>
    {/* 
       1. 입력 후에 엔터를 입력하면 다음 input 으로 포커스 이동
       2. name 필드에서 엔터를 입력하면 배열에 user객체 추가
             그리고 input value들 초기화
       3. tbody -> tr 묶음을 userList 에서 map 통해 렌더링
       4. table 디자인 -> border : 1px solid #dbdbdb;
    */}
    <input name="username" placeholder="사용자명" 
    onChange={handleInputChange} 
    onKeyDown={handleInputKeyDown}
    ref={inputRef.username}/>

    <input name="password" placeholder="비밀번호" 
    onChange={handleInputChange} 
    onKeyDown={handleInputKeyDown}
    ref={inputRef.password}/>

    <input name="name" placeholder="이름" 
    onChange={handleInputChange} 
    onKeyDown={handleInputKeyDown}
    ref={inputRef.name}/>
    <table>
        <thead>
            <tr>
                <th>index</th>
                <th>username</th>
                <th>password</th>
                <th>name</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>사용자: {inputData}</td>
                <td>사용자이름: {inputData.username}</td>
                <td>비밀번호: {inputData.password}</td>
                <td>이름: {inputData.name}</td>
            </tr>
        </tbody>
    </table>
    </>
}
export default App;