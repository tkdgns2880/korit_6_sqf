import "./App.css";
import CustomInput from "./components/CustomInput";
import Hello from "./components/Hello";

// 컴포넌트 -> 함수(html 태그를 리턴하는 함수)

/*
  JSX -> 문법(값)
   1. 태그를 열었으면 닫아야한다 <a></a>, <a />
   2. 여러 태그를 리턴해야하는 경우에는 하나로 묶어야 한다
   3. JSX 안에 값 / 변수를 사용하려면 {}표현식을 사용해야한다
*/

function App() {
  return <div>
    <Hello></Hello>
    <Hello />
  </div>
}
// <Hello /> -> Hello.js 에서 지정한 함수명
// function 뒤에 대문자도 가능 태그를 사용 할 수 있다
// App.js에서 Hello.js에 있는 function을 인폴트(import) 해줘야 사용 할 수 있다

function App() {
  return <Fragment>
    <div>
      <Hello></Hello>
    </div>
    <div>
      <Hello></Hello>
    </div>
    </Fragment>
}
// JSX 는 하나의 태그(묶음)만 사용이 가능하다.
// Fragment -> <></> 안에 안쓰고 태그를 열고 닫아도 사용이

function App() {
  const name = "정상훈";
  const fontColorRad = {
    color : "red"
  };
  const age = <h2>{31}</h2>
  return <>
    <div>
      <Hello></Hello>
    </div>
    {/*<div>
      <Hello></Hello>
    </div>*/}
    <h1 style={fontColorRad} className={"fs=20 itelic"}>{name}</h1>
    <CustomInput ph={"이름"} disabled={true} value={"정상훈"} />
    <CustomInput ph={"나이"} disabled={false} />
    <CustomInput ph={"연락처"} disabled={true} />
    <Box name={"정상훈"} isShow={false}>
    <h2>{31}</h2>
    <h2>{31}</h2>
    <h2>{31}</h2>
    </Box>
    </>
} 
{/* {isShow ? <h3>안녕하세요</h3> : null} 
  <Box name={"정상훈"} isShow={true}> true를 넣으면 출력된 값이 보인다
  <Box name={"정상훈"} isShow={false}> false를 넣으면 출력된 값이 보이지 않는다
     <Box name={"정상훈"} isShow> -----> true, false를 사용하지 않으면 true로 간주하고 출력된 값이 보인다
  */}
export default App;
// style={} 안에 객체를 넣는다
// <h1 style={{color : "red"}}>{name}</h1> 객체안에 스타일
// JSX 영역 안에서는 {/* */} 를 사용해서 주석처리가 가능하다 ageJsx={age}

{/*  
  <CustomInput ph={"이름"} disabled={true} value={"정상훈"} /> // input 을 이용해서 한줄로 태그한것
  <CustomInput ph={"나이"} disabled={false} />
  <CustomInput ph={"연락처"} disabled={true} />
  <Box name={"정상훈"}> // h1 을 이용해서 열고 닫아준 태그
  <h2>{31}</h2>
  <h2>{31}</h2>
  <h2>{31}</h2>
  </Box> 
*/} // components -> props 를 이용해서 만든 객체들