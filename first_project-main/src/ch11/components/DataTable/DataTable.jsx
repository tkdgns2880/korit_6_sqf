import { useEffect, useState } from "react";
import DataTableBody from "../DataTableBody/DataTableBody";
import DataTableHeader from "../DataTableHeader/DataTableHeader";
import "./style.css"; // ./(같은 폴더 지정)
import { SAMPLE_PRODUCTS } from "../../constants/sampleProducts";

function DataTable() {
    const [ isLoad, setLoad ] = useState(false); // 0 = 조회, 1 = 추가, 2 = 수정, 3 = 삭제
    const [ mode, setMode ] = useState(0); // 0 = 조회, 1 = 추가, 2 = 수정, 3 = 삭제
    const [ products, setProducts ] = useState([ ...SAMPLE_PRODUCTS ]);
    const [ isDeleting, setDeleting] = useState(false);
    const [ editProductId, setEditProductId ] = useState(0);

    useEffect(() => {
        localStorage.setItem("products", JSON.stringify(products));
    }, [products]);
    useEffect(() => {
        const lsProducts = localStorage.getItem("products");
        setProducts(!lsProducts ? [] : JSON.parse(lsProducts)); // []의 값이 비어 있으면 lsProducts 값을 가져올거다
        setLoad(true);
    }, []);
    return (
        <div className="table-main-container">
            <DataTableHeader 
            mode={mode} 
            setMode={setMode} 
            products={products}
            setProducts={setProducts} 
            setDeleting={setDeleting}
            editProductId={editProductId}
            />
            <DataTableBody 
            mode={mode}
            setMode={setMode}
            products={products}
            setProducts={setProducts} 
            isDeleting={isDeleting} 
            setDeleting={setDeleting}
            setEditProductId={setEditProductId}/>
        </div>
    );
}
export default DataTable;