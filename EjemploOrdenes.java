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

        System.out.println("Recibo: " + orden1.getDescripcion());
        System.out.println("Cliente: " + orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido());
        for (Producto p: orden1.getProductos()) {
            System.out.println("Fabricante: " + p.getFabricante() +
                    ", Nombre: " + p.getNombre() +
                    " $" + p.getPrecio());
        }
        System.out.println(orden1.granTotal());

        System.out.println();
        System.out.println("Recibo: " + orden2.getDescripcion());
        System.out.println("Cliente: " + orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido());
        for (Producto p: orden2.getProductos()) {
            System.out.println("Fabricante: " + p.getFabricante() +
                    ", Nombre: " + p.getNombre() +
                    " $" + p.getPrecio());
        }
        System.out.println(orden2.granTotal());

        System.out.println();
        System.out.println("Recibo: " + orden3.getDescripcion());
        System.out.println("Cliente: " + orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido());
        for (Producto p: orden3.getProductos()) {
            System.out.println("Fabricante: " + p.getFabricante() +
                    ", Nombre: " + p.getNombre() +
                    " $" + p.getPrecio());
        }
        System.out.println(orden3.granTotal());
    }
}
