import { useState } from "react";

function App() {
    const [ imgSrc, setImgSrc ] = useState("");
    const handleLoadImgClick = () => {
        const fileElement = document.createElement("input");
        fileElement.setAttribute("type", "file");
        fileElement.setAttribute("multiple", true);
        // multiple 에 true, false 를 사용하여 여러개의 파일을 선택 할수도 있고 못하게 할수도 있다
        fileElement.click();
        // input 태그와 태그안에 type, file, click 을 만든 코드
        // console.log({fileElement}); -> {} 객체로 묶어주지 않으면 출력되지 않는다
        fileElement.onchange = (e) => {
            const file = e.target.file[0];
            const fileReader = new FileReader();
            fileReader.onload = (e) => {
                setImgSrc(e.target.result);
            }
            fileReader.readAsDataURL(file);
        }
    }
    return (
        <>
        <button onClick={handleLoadImgClick}>이미지 불러오기</button>
        <input type="file" multiple={false} />
        <div>
            <img src={imgSrc} alt="" />
        </div>
        </>
    );
}
export default App;