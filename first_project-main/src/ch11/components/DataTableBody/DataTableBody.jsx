import { useEffect, useState } from "react";
import "./style.css";

function DataTableBody({mode, setMode, products,setProducts, isDeleting, setDeleting, setEditProductId}) {
    const [ viewProducts, setViewProducts ] = useState([]);
    const [ checkedAll, setCheckedAll] = useState(false);

    useEffect(() => {
        if(mode === 0) {
            resetViewProducts();
            setCheckedAll(false);
        }
    }, [products, mode]); 
    // resetViewProducts -> 무조건 한번 동작을 하고 products, mode 값이 바뀌면 동작
    
    useEffect(() => {
        const checkStates = viewProducts.map(product => product.isChecked);
        if(checkStates.includes(false)) { 
            setCheckedAll(false); 
        } else {
            setCheckedAll(true);
        } // checkStates.includes(false) -> 거짓이 하나라도 존재하면? else 문으로 setCheckedAll(true) 변경이 된다
    }, [viewProducts]);

    useEffect(() => {
        if(isDeleting) {
            setProducts([ ...viewProducts
                .fliter(viewProduct => viewProduct.isChecked === false)
                .map(viewProduct => {
                    const { isChecked, ...product } = viewProduct;
                    return product;
                }) // 
            ]);
            setMode(0);
            setDeleting(false);
        }
    }, [isDeleting]);

    useEffect(() => {
        if(mode === 2) {
        const [ selectedProduct ] = viewProducts.filter(product => product.isChecked);

        setEditProductId(!selectedProduct ? 0 : selectedProduct.id);
        }
    }, [viewProducts]);

    const resetViewProducts = () => {
        setViewProducts([ ...products.map(product => ({ ...product, isChecked : false }))]);
    } // setViewProducts 안에 외부에서 받아온 products 를 반복을 돌려서 새로운 product 개열을 만든다
    // 기존의 product 배열에서 새로운 product 배열을 넣는다
    const handleCheckedAllChange = (e) => {
        setCheckedAll(checked => {
            if(!checked) {
            setViewProducts([ ...products.map(product => ({ ...product, isChecked : true }))]);
        } else {
            resetViewProducts();
        }
            return !checked;
        });
    }
    const handleCheckedChange = (e) => {
        if(mode === 2) {
            setViewProducts(viewProducts => {
                return [ ...viewProducts.map(product => {
                    if(product.id === parseInt(e.target.value)) {
                        return {
                            ...product,
                            isChecked : !product.isChecked
                        } // !product.isChecked -> 앞에 ! false 를 안걸어주면 체크가 풀리지 않는다
                    }
                    return {
                        ...product,
                        isChecked : false
                    } // isChecked 에 false 를 걸어줘서 전체 체크가 다 풀린다
                })]
            });
        }
        if(mode === 3) {
            setViewProducts(viewProducts => {
                return [ ...viewProducts.map(product => {
                    if(product.id === parseInt(e.target.value)) {
                        return {
                            ...product,
                            isChecked : !product.isChecked
                        }
                    }
                    return product;
                })]
            });
        }
    }
    
    return (
        <div className="table-body">
            <table>
                <thead>
                    <tr>
                        <th>
                            <input 
                            type="checkbox" 
                            disabled={mode !== 3}
                            onChange={handleCheckedAllChange}
                            checked={checkedAll}
                            />
                        </th>
                        <th>상품코드</th>
                        <th>상품명</th>
                        <th>사이즈</th>
                        <th>색상</th>
                        <th>가격</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        viewProducts.map(product => ( 
                            <tr key={product.id}>
                                <th>
                                    <input 
                                    type="checkbox" 
                                    disabled={mode === 0 || mode === 1} 
                                    checked={product.isChecked}
                                    onChange={handleCheckedChange}
                                    value={product.id}
                                    />
                                </th>
                                <td>{product.id}</td>
                                <td>{product.productName}</td>
                                <td>{product.size}</td>
                                <td>{product.color}</td>
                                <td>{product.price}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
}
export default DataTableBody;