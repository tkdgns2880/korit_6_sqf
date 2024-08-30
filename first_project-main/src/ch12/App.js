import { useEffect, useState } from "react";

function App() {
    const [ number, setNumber ] = useState(0);
    const [ number2, setNumber2 ] = useState(0);
    const [ number3, setNumber3 ] = useState(0);

    
    useEffect(() => { // useEffect 무조건 한번은 실행되고 렌더링 될시 다시 한번 실행한다
        // 마운트 지점 -> 체결하는 지점
        console.log(number2);
        setNumber3(number * 10);
        return () => {
            // 언마운트 지점 -> 체결한걸 버리는 지점
        }
    }, [number]); // useEffect(); 2개의 매개변수를 받을수 있다 . 함수 , [배열]
    // [number] -> 대괄호의 number 가 변했을때 실행되는 함수
    const handleButtonClick = (e) => {
        setNumber(a => a + 1);
    }
    const handleButtonClick2 = (e) => {
        setNumber2(b => b + 10);
    }
    return (
        <>
        <h1>{number}</h1>
        <h1>{number2}</h1>
        <h1>{number3}</h1>
        <button onClick={handleButtonClick}>num1 증가</button>
        <button onClick={handleButtonClick2}>num2 증가</button>
        </>
    );
}

export default App;