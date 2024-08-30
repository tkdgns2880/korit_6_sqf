import { useInput } from '../../hooks/useInput';

function CustomHookPage(props) {
    // const { value, setValue, onChange } = useInput("text", 20); 한가지만 검색이 가능하다
    const usernameInput = useInput("text", 20);
    const passwordInput = useInput("", 10);


    return (
        <div>
            <input type="text" onChange={usernameInput.onChange} value={usernameInput.value} />
            <input type="password" onChange={passwordInput.onChange} value={passwordInput.value} />
        </div>
    );
}
export default CustomHookPage;