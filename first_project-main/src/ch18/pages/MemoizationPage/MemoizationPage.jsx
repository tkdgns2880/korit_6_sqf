import React, { useCallback, useEffect, useMemo, useState } from 'react';

function MemoizationPage(props) {
    const [ value, setValue ] = useState(0);
    const [ value2, setValue2 ] = useState(0);
    const [ num, setNum ] = useState(0);
    
    const a = useMemo(() => { 
        // useMemo -> 작동하는 시간은 느리지만 불필요한 코드를 줄여준다
        console.log(num);
        return num + 10;
    }, [num]); // [num] 의 값이 바꼈을때만 다시 작용한다

    const b = num + 20;

    const handleChange = useCallback((e) => {
        setValue(e.target.value);
    }, []); // [] 대괄호 안에 함수를 지정하지 않은 경우 렌더링 할때마다 다시 재정의

    const handleChange2 = (e) => {
        setValue2(e.target.value);
    }
    const handleClick = useCallback(() => {
        setNum(parseInt(value));
    }, [value]); // [value] 의 값이 바꼈을때만 다시 재정의 하라고 명령
    
    return (
        <div>
            <h1>{a}</h1>
            <input type="text" onChange={handleChange} />
            <input type="text" onChange={handleChange2} />
            <button onClick={handleClick} >확인</button>
        </div>
    );
}
export default MemoizationPage;


// useEffect -> 함수를 저장
// useMemo -> 값을 저장 
