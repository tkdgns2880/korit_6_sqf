function CustomInput({props}) { // component 는 props 객체를 써야한다
    return <input type="text" placeholder={props.ph} disabled={props.disabled} />
}
// JSX -> 한줄 짜리 태그는 <input /> 처럼 사용한다

function CustomInput({ph, disabled, value}) { // ({ph, disabled, value}) -> 비구조 활당 명의로 정의 한것
    return <input type="text" placeholder={ph} disabled={disabled} value={value} />
}
CustomInput.defaultProps = {
    ph : "test",
    disabled : false,
    value : "빈값"
}
export default CustomInput;