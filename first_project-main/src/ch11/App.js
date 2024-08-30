import "./App.css"; // <div className="container"> 여기에 입력 받을수 있다
import DataTable from "./components/DataTable/DataTable";

function App() {
    return (
    <div className="container">
        <h1>상품 관리 페이지</h1>
        <DataTable />
    </div>
    )
}
export default App;