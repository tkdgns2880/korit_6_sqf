/** @jsxImportSource @emotion/react */
import * as s from "./style";

function MainContainer({children}) { // {children} 쓴다는건 사이에 또 하나의 태그가 들어올때
    return (
        <div css={s.container}>
            {children}
        </div>
    );
}
export default MainContainer;