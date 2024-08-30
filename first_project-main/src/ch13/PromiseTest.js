function PromiseTest() {
    /**
     * Promise -> 비동기 객체
     * Promise 의 3가지 상태
     * 1. 대기(Promise) -> 이행되지도 거부되지도 않은 상태
     * 2. 이행(resolve) -> 연산이 성공했을 때의 상태 
     * 3. 거부(reject) -> 연산을 실패했을 때의 상태 
     */

    // const p1 = new Promise((resolve, reject) => { // 생성된 Promise 라는 객체가 p1으로 들어감
    //     console.log("프로미스 생성");
    // });

    function p1(name) {
        return new Promise((resolve, reject) => { // 대기 상태
            // 위에 코드는 대기(동기)상태 이다
            console.log(name + "프로미스 생성");
            if(!name) {
                reject("오류!!!"); // name이 빈값이면 오류라는 데이터가 나온다
            }
            resolve(name); 
            // 이행 단계 .then 을 사용하기 위해서는 resolve 이행 단계를 거처야한다
        });
    }
    async function p2() { // 함수앞에 async function 달면 -> Promise 로 입력된다
        let a = null;
        try {
        // p4().then(r => a = r); // p4를 return 받는 코드
        // await 를 달게되면 p4의 리턴 값을 a 에 가져온다 
        a = await p4(); // await -> 이행 할 때까지 기다려
        // await은 async안에서만 사용할 수 있고, Promise객체에만 사용할 수 있다
        await p5();
        } catch(error) {
            console.log(error);
            a = "p5"; // a 안에 p5를 넣고 싶으면 try를 사용해야 한다
        }
        return a;
    }
    async function p3() {
        return new Promise((resolve, reject) => {
            resolve("p3");
        });
    }
    async function p4() {
        return "p4";
    }
    async function p5() {
        throw new Error("오류!!!!!");
    }
    const handleClick = () => {
        p1("p1").then(result => { // then 이 실행되기 위해서는 p1("p1") 빈값이 아니여야 한다
            // .then은 또다른 하나의 프로미스 이다 .then으로 또 다른 프로미스를 생성할수 있다
            console.log("이행");
            console.log(result); // resolve(name); 를 result 가 전달 받는다
            if(true) {
                throw new Error("거부!!"); // new Error(); error를 생성
                // .then 안에서 -> 거부(reject)
            }
            return "두번째 then";
            // .then 안에서 -> return = 이행(resolve)
        }).then(result => {
            console.log(result);
        }).catch(error => {
            // console.log(error);
        });
        console.log("출력1");
        p1("p2");
        console.log("출력2");
        p1("p3");
    }
    const handleClick2 = () => { 
        // 2초뒤에 실행시키고 싶으면 실행코드 최상위에 setTimeout 코드를 작성해야한다
        // setTimeout 실행문 앞에는 await 를 사용할수 없다
        setTimeout(() => {
            p2().then(r => {
                console.log(r);
            });
        }, 2000);
    //         return "p2."
    //     }).then(r => {
    //         console.log(r);
    //     });
    //     p3().then(r => {console.log(r)});
    // }
    }
    return (
        <>
        <button onClick={handleClick}>promise</button>
        <button onClick={handleClick2}>async</button>
        </>
    );
}
export default PromiseTest;


// async function p2() {
//     return "p2";
// }
/////////////////////////////////////////////////////////////////
// async function p3() {
//     return new Promise((resolve, reject) => {
//         resolve("p3");
//     });
// }
// 함수만 다르고 똑같은 코드