import React from 'react';
import { useSearchParams } from 'react-router-dom';

function SearchParamsStudy(props) {
    const [ searchParams, setSearchParams ] = useSearchParams();
    // console.log(searchParams.values().next);
    // SearchParams에 값을 next으로 다음 값을 들고 올수 있다

    console.log(searchParams.getAll("a"));
    console.log(searchParams.getAll("b"));
    // SearchParams에 값을 get으로 들고 올수 있다
    // SearchParams에 a, b 값을 get으로 들고 올때 a&b 로 값을 들고 온다

    const handleClick = () => {
        const keys = searchParams.keys();
        let newParams = {};
        for(let i = 0; i < searchParams.size; i++) {
            const key = keys.next().value;
            const value = searchParams.get(key);
            newParams = {
                ...newParams,
                [key]: value
            }
        }
        setSearchParams({...newParams, c:30});
    } // a,b 가 있는 상황에서 클릭을 하면 값을 변경 받을수 있다

    // setSearchParams({...searchParams, c:30});
    // 주소창에 searchParams?c:30 라고 찍힌다
    return (
        <div>
            <h1>SearchParams</h1>
            <button onClick={handleClick}>c=30 추가</button>
        </div>
    );
}

export default SearchParamsStudy;

// SearchParams(객체) 는 주소창에서 뒤에 ? 로 시작한다 SearchParams?
// SearchParams 는 배열형태로 꺼내 쓸수 있다