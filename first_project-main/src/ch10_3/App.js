import { useRef, useState } from "react";
import "./App.css";

function App() {
    const test = {
        a : "aaa",
        b : "bbb"
    }
    console.log(test["a"]);
    // 객채에는 (test["a"]); 숫자에는 (test[0]);
    const emptyUser = {
        username : "",
        password : "",
        name : ""
    }
    const [ userList, setUserList ] = useState([]);
    const [ inputData, setInputData ] = useState({...emptyUser});

    const inputRef = {
        username : useRef(),
        password : useRef(),
        name : useRef()
    }
    const handleInputKeyDown = (e) => {
        if(e.keyCode === 13) {
            const { username, password, name } = inputRef;
            switch(e.target.name) {
                case "username" :
                    password.current.focus();
                    break;
                case "password" :
                    name.current.focus();
                    break;
                case "name" :
                    username.current.focus();
                    setUserList(userList => [ ...userList, inputData ]);
                    setInputData({ ...emptyUser });
                    break;
                default:
            }
        }
    }
    const handleInputChange = (e) => {
        setInputData(inputData => {
            return {
                ...inputData,
                [e.target.name] : e.target.value
            }
        });
    }
    const handleDeleteClick = (e) => {
        setUserList(userList => [ ...userList.filter((user, index) => index !== parseInt(e.target.value)) ]);
    }
    // const handleonRemove = name => {
    //     setUserList(userList.filter(userList.setUserList !== userList));
    // }
    return<>
    {/* 
       1. 입력 후에 엔터를 입력하면 다음 input 으로 포커스 이동
       2. name 필드에서 엔터를 입력하면 배열에 user객체 추가
             그리고 input value들 초기화
       3. tbody -> tr 묶음을 userList 에서 map 통해 렌더링
       4. table 디자인 -> border : 1px solid #dbdbdb;
    */}
    <input name="username" placeholder="사용자명" 
    onKeyDown={handleInputKeyDown}
    onChange={handleInputChange}
    value={inputData.username}
    ref={inputRef.username}/>

    <input name="password" placeholder="비밀번호" 
    onKeyDown={handleInputKeyDown}
    onChange={handleInputChange}
    value={inputData.password}
    ref={inputRef.password}/>

    <input name="name" placeholder="이름" 
    onKeyDown={handleInputKeyDown}
    onChange={handleInputChange}
    value={inputData.name}
    ref={inputRef.name}/>
    <table>
        <thead>
            <tr>
                <th>index</th>
                <th>username</th>
                <th>password</th>
                <th>name</th>
                <th>삭제</th>
            </tr>
        </thead>
        <tbody>
            {
                userList.map(({username, password, name}, index) => {
                return (
                <tr key={index}>
                <td>{index + 1}</td>
                <td>{username}</td>
                <td>{password}</td>
                <td>{name}</td>
                <button onRemove={handleDeleteClick} value={index}>삭제</button>
                </tr>
                );
            })
            }
        </tbody>
    </table>
    </>
}
export default App;
// 클릭시 삭제 버튼 만들기
// map(() => {}); map 함수 정의 
// map 기존의 배열에서 새로운 배열로 변경시켜주는것