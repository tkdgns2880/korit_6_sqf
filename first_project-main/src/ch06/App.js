import { useState } from "react";

function App() {
    const [ grade, setGrade ] = useState(0);
    const [ group, setGroup ] = useState(0);
    const [ number, setNumber ] = useState(0);
    const [ name, setName ] = useState("");

    const emptyStudent = {
        grade : "",
        group : "",
        number : "",
        name : ""
    }
    const [ student, setStudent ] = useState({...emptyStudent});
{/*
    useState({...emptyStudent});
    안에 호출하여 정의한거
        grade : "",
        group : "",
        number : "",
        name : ""
*/}
    const handleInputonChange = (e) => { 
        switch(e.target.name) {
            case "grade":
                setGrade(e.target.value);
                break;
            case "group":
                setGroup(e.target.value);
                break;
            case "number":
                setNumber(e.target.value);
                break;
            case "name":
                setName(e.target.value);
                break;
            default:
        } // 스위치를 이용하여 함수를 하나로 줄 일수 있다
    }
    const handleInputChange2 = (e) => {
        // const name = e.target.name;
        // const value = e.target.value;
        const { name, value } = e.target;
        const newStudent = {
            ...student,
            [name] : value
        }
        setStudent(newStudent);
        // setStudent(student => {
        //     return {
        //         ...student,
        //         [e.target.name] : e.target.value
        //     }
        // });
    }
    // const handleInputGradeonChange = (e) => {
    //     setGrade(e.target.value);
    // }
    // const handleInputGrouponChange = (e) => {
    //     setGroup(e.target.value);
    // }
    // const handleInputNumberonChange = (e) => {
    //     setNumber(e.target.value);
    // }
    // const handleInputNameonChange = (e) => {
    //     setName(e.target.value);
    // } // 함수 4개를 사용하여 짠코드
    return <>
    <input name="grade" placeholder="학년" onChange={handleInputonChange} value={grade}/>
    <input name="group" placeholder="반" onChange={handleInputonChange} value={group}/>
    <input name="number" placeholder="번호" onChange={handleInputonChange} value={number}/>
    <input name="name" placeholder="이름" onChange={handleInputonChange} value={name}/>

    <ul>
        <li>학년:{grade}</li>
        <li>반:{group}</li>
        <li>번호:{number}</li>
        <li>이름:{name}</li>
    </ul>

    <input name="grade" placeholder="학년" onChange={handleInputChange2} value={student.grade}/>
    <input name="group" placeholder="반" onChange={handleInputChange2} value={student.group}/>
    <input name="number" placeholder="번호" onChange={handleInputChange2} value={student.number}/>
    <input name="name" placeholder="이름" onChange={handleInputChange2} value={student.name}/>

    <ul>
        <li>학년:{student.grade}</li>
        <li>반:{student.group}</li>
        <li>번호:{student.number}</li>
        <li>이름:{student.name}</li>
    </ul>
    </>
}
export default App;