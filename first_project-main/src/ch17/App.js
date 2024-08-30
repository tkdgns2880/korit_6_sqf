/** @jsxImportSource @emotion/react */
// 위에 주석만 있으면 css를 끌어다 쓸수 있다
import * as s from "./style"; 
// ./style 파일에 있는 * as s 모든 css 코드를 다들고와라는 코드

function App() {
    return (
        <div css={s.container} >
            <div css={s.container2} >
                <div css={s.container3} >
                    <div css={s.container4} >
                        <div css={s.container5} >

                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}
export default App;