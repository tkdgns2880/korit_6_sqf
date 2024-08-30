import { useState } from "react";
import Button from "./Button";

function App() {
    const [ a, setA ] = useState(0);
    const b = 0;

    setA(100);
    b(200);

    return <>
    </>
}
export default App;

// 비교할 대상이 없으면 renber 못한다

