function Box({name, chuldren}) {
    return <div>
        <h1>{name}</h1>
        {chuldren}
    </div>
}
// 값만 넣고 싶을때 {chuldren} 를 사용
// {name} -> {props.name} 안에 props가 숨어있다
export default Box;

function Box({props}) {
    return <div>
        <h1>{props.name}</h1>
        {props.chuldren}
    </div>
}
{/* 
    true && true = true
    false && true = false 
    false && false = false
*/}
function Box({name, isShow, chuldren}) {
    const result = true && "정상훈";

    return <div>
        <h1>{name}</h1>
        {chuldren}
        {1 + 1}
        {ture && "정상훈"}
        {isShow && <h3>안녕하세요</h3>}
        {isShow ? <h3>안녕하세요</h3> : <h4>안녕하세요</h4>}
    </div>
}

{/* 
// {true ? <h3>true</h3> : false} true 면 <h3>true</h3> 
// JSX 안에 true, false, null 를 넣으면 문자로 안보고 랜더링 되지 않는다
// 표현식 안에서 {1 + 1}(연산) {ture && "정상훈"}(조건연산) 둘다 사용이 가능하다
// {isShow && <h3>안녕하세요</h3>} -> false 일때 아무것도 출력이 안되길 원하면 사용
// {isShow ? <h3>안녕하세요</h3> : <h4>안녕하세요<h4>} -> false 일때 대신 출력이 원할때 사용 
*/}


// useState -> 변수