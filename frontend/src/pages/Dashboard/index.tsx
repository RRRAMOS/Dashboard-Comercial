import NavBar from "components/NavBar";
import Barchart from "components/BarChart";
import DonutChart from "components/DonutChart";
import DataTable from "components/DataTable";
import Footer from "components/Footer";



const Dashboard = () => {
    return (
        <>
            <NavBar/>
            <div className="container">
                <h1 className="text-primary py-3">Desempenho de Vendas</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
                        <Barchart/>
                    </div>
                </div>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Vendas Totais</h5>
                        <DonutChart/>
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Vendas Totais</h2>

                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;
