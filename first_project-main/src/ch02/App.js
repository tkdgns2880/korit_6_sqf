import { useState } from "react";

// 렌더링 되는 시점 중요
function App() {
    const [ number, setNumber] = useState(100); // numberState -> 배열
    const [ name, setName ] = useState(null);

    const [ test, testPrint ] = [ 100, function (){console.log("test함수 호출")}];

    testPrint();

    console.log(number);
    if(number === 100) {
        setTimeout(() => setNumber(200), 2000); // 비동기처리
        // setNumber(200); // 밑에서 200으로 넣으면 출력이 200으로 나온다
        // setNumber -> 상태 변화 > 상태 변화 때 함수 재호출(재렌더링)
        //   (상태 변화가 되면 가지고 있는 const [ number, setNumber] = useState(100); 을 다시 호출한다)
        // 재렌더링 시점에는 상태 초기화는 일어나지 않는다
    }
    if(number === 200) {
        setNumber(300); // useState의 setter는 비동기
        console.log(number);
    }
    if(name === null) {
        setName("정상훈");
    }
    console.log(name);

    return <>
    <h1>number 상태 확인</h1>
    <h2>{number}</h2>
    </>
}
export default App;
// useState