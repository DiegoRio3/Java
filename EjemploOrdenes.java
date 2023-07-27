public class EjemploOrdenes {

    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Orden N° 1");
        orden1.setCliente(new Cliente("Diego","Villafañe"));
        orden1.addProducto(new Producto("Arcor", "Turron", 100));
        orden1.addProducto(new Producto("Bagley", "Alfajor Blanco", 400));
        orden1.addProducto(new Producto("Rexona", "Desodorante", 700));
        orden1.addProducto(new Producto("Sedal", "Acondicionador", 1200));

        OrdenCompra orden2 = new OrdenCompra("Orden N° 2");
        orden2.setCliente(new Cliente("Roberto", "Pratto"));
        orden2.addProducto(new Producto("Terrabusi", "Barrita Cereañ", 200));
        orden2.addProducto(new Producto("Guaymallen", "Alfajor Dulce de Leche", 350));
        orden2.addProducto(new Producto("Fel-Fort", "Dos Corazones", 400));
        orden2.addProducto(new Producto("Colgate", "Pasta Dental", 900));

        OrdenCompra orden3 = new OrdenCompra("Orden N° 3");
        orden3.setCliente(new Cliente("Titi", "Chabatoni"));
        orden3.addProducto(new Producto("Epson", "impresora", 30000));
        orden3.addProducto(new Producto("Samsung", "Celular", 70000));
        orden3.addProducto(new Producto("América", "Cuaderno", 550));
        orden3.addProducto(new Producto("Bic", "Lapicera Negra", 300));

        System.out.println("*----------------------------------------------------------------+");
        orden1.imprimir();
        orden2.imprimir();
        orden3.imprimir();
    }
}
