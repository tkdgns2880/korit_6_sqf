import { useRef } from "react";

function App() {
    const inputRef = { // inputRef -> input에서 사용하는 Ref 를 간단하게 정의
        a : useRef(),
        b : useRef(),
        c : useRef()
    } // Ref 를 사용할때에는 name 을 넣어도 되고 안넣어도 된다
    // 위에 코드를 풀어 놓은것
    // const aRef = useRef();
    // const bRef = useRef();
    // const cRef = useRef();
    // use(훅 함수) 는 해당 function 의 최상단에 있어야 한다

    const handleKeyDown = (e) => {
        if(e.keyCode === 13) {
            switch(e.target.name) {
                case "a":
                    inputRef.b.current.focus();
                    break;
                case "b":
                    inputRef.c.current.focus();
                    break;
                case "c":
                    inputRef.a.current.focus();
                    break;
                default:
            } // Ref 를 쓸때에는 current 를 사용해야지 해당 객체가 된다
        }
    }
    return <>
    <input name="a" onKeyDown={handleKeyDown} ref={inputRef.a}/>
    <input name="b" onKeyDown={handleKeyDown} ref={inputRef.b}/>
    <input name="c" onKeyDown={handleKeyDown} ref={inputRef.c}/>
    </>
}
export default App;