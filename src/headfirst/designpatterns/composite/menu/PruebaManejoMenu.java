package headfirst.designpatterns.composite.menu; 

public class PruebaManejoMenu {

    public static void main(String args[]) {
        Menu menuDesayunos = 
            new Menu("MENU CASA DEL PANQUEQUE", "Desayunos");
        Menu menuAlmuerzos = 
            new Menu("MENU DEL COMEDOR", "Almuerzos");
        Menu menuCenas = 
            new Menu("MENU PARA LA TARDE", "Cenas");
        Menu menuDePostres = 
            new Menu("MENU DE POSTRES", "¡Postres por supuesto!");
        Menu menuDeCafeteria = 
            new Menu("MENU DE CAFETERIA", "Algo para acompañar su cafe por la tarde");
        Menu todosLosMenus = 
            new Menu("TODOS LOS MENUS", "Todos los menus combinados");

        todosLosMenus.agregar(menuDesayunos);
        todosLosMenus.agregar(menuAlmuerzos);
        todosLosMenus.agregar(menuCenas);

        menuDesayunos.agregar(new ItemMenu(
            "K&B's Desayuno de panqueques", 
            "Panqueques con huevos revueltos, y tostadas", 
            true,
            2.99
        ));

        menuDesayunos.agregar(new ItemMenu(
            "Desayuno del panqueque regular", 
            "Panqueques con huevos fritos, salchichas", 
            false,
            2.99
        ));

        menuDesayunos.agregar(new ItemMenu(
            "Panqueques de arandano",
            "Panqueques hechos con arandanos frescos, y jarabe de arandano",
            true,
            3.49
        ));

        menuDesayunos.agregar(new ItemMenu(
            "Gofres",
            "Gofres, con su eleccion de arandanos o fresas",
            true,
            3.59
        ));

        menuAlmuerzos.agregar(new ItemMenu(
            "TLT vegetariano",
            "(Falso) Tocino con lechuga y tomate en trigo integral",
            true, 
            2.99
        ));

        menuAlmuerzos.agregar(new ItemMenu(
            "TLT",
            "Tocino con lechuga y tomate en trigo integral",
            false, 
            2.99
        ));

        menuAlmuerzos.agregar(new ItemMenu(
            "Sopa del dia",
            "Un plato de sopa del dia, con una guarnición de ensalada de papas", 
            false, 
            3.29
        ));

        menuAlmuerzos.agregar(new ItemMenu(
            "Perro caliente",
            "Un perro caliente, con chucrut, condimento, cebollas, cubierto con queso",
            false, 
            3.05
        ));

        menuAlmuerzos.agregar(new ItemMenu(
            "Verduras al vapor y arroz integral",
            "Verduras al vapor sobre arroz integral", 
            true, 
            3.99
        ));

        menuAlmuerzos.agregar(new ItemMenu(
            "Pasta",
            "Spaghetti con salsa marinada, y una rebanada de pan de masa madre",
            true, 
            3.89
        ));

        menuAlmuerzos.agregar(menuDePostres);

        menuDePostres.agregar(new ItemMenu(
            "Tarta de manzana",
            "Tarta de manzana con una corteza escamosa, cubierta con helado de vainilla",
            true,
            1.59
        ));

        menuDePostres.agregar(new ItemMenu(
            "Tarta de queso",
            "Tarta de queso cremosa de New York, con una corteza de galletas graham",
            true,
            1.99
        ));

        menuDePostres.agregar(new ItemMenu(
            "Sorbete",
            "Una cucharada de frambuesa y una cucharada de lima",
            true,
            1.89
        ));

        menuCenas.agregar(new ItemMenu(
            "Hamburguesa vegetariana y papas fritas al aire",
            "Hamburguesa vegetariana en pan integral, lechuga, tomate y papas fritas",
            true, 
            3.99
        ));

        menuCenas.agregar(new ItemMenu(
            "Sopa del dia",
            "Una taza de la sopa del día, con una ensalada",
            false, 
            3.69
        ));

        menuCenas.agregar(new ItemMenu(
            "Burrito",
            "Un burrito largo, con frijoles pintos enteros, salsa, aguacate",
            true, 
            4.29
        ));

        menuCenas.agregar(menuDeCafeteria);

        menuDeCafeteria.agregar(new ItemMenu(
            "Pastel de cafe",
            "Pastel desmenuzable cubierto con canela y nueces",
            true,
            1.59
        ));

        menuDeCafeteria.agregar(new ItemMenu(
            "Rosquilla",
            "Los sabores incluyen sésamo, semillas de amapola, pasas de canela, calabaza",
            false,
            0.69
        ));

        menuDeCafeteria.agregar(new ItemMenu(
            "Biscotti",
            "Tres galletas de biscotti de almendras o avellanas",
            true,
            0.89
        ));

        Mesero mesero = new Mesero(todosLosMenus);
        mesero.imprimirMenu();
    }
}