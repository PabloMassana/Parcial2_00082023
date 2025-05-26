package com.falconteam.parcial2.viewmodel

import com.falconteam.parcial2.model.Product

data class ProductUIState(
    val searchQuery: String = "",
    val products: List<Product> = listOf(
        Product(1, "Camisa", "Ropa", 19.99, "Camisa de algodón muy cómoda.", "https://ae01.alicdn.com/kf/S508dc29e08bf455881adb52e9928a5ebo/2021-Nueva-Camisa-para-hombre-de-pana-de-un-solo-algod%C3%B3n-2021-Business-Casual-Fashion-Solid-Color-Corduroy-Men.jpg"),
        Product(2, "Laptop", "Electrónica", 899.99, "Laptop potente para programar.", "https://m.media-amazon.com/images/I/71wUVEPolXL.jpg"),
        Product(3, "Zapatos deportivos", "Calzado", 49.99, "Ideales para correr.", "https://galaxiadeportes.com/wp-content/uploads/2024/02/15962-1317-2.png"),
        Product(4, "Auriculares", "Electrónica", 25.50, "Sonido envolvente y buena batería.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS63fx8Idbw4kC28P-K5elYifaIwQvg-4R75A&s"),
        Product(5, "Lavadora", "Electrodomesticos", 1050.00, "Excelente para lavar la ropa y dejarla bien limpia.", "https://www.lacuracaonline.com/media/catalog/product/d/i/dise_o_sin_t_tulo_-_2024-04-03t112942.076.jpg?optimize=medium&bg-color=255,255,255&fit=bounds&height=700&width=700&canvas=700:700" ),
        Product(6, "Secador de cabello Remington", "Electrodomesticos", 30.00, "Deja el pelo seco y sedoso", "https://walmartsv.vtexassets.com/arquivos/ids/591690/42726_01.jpg?v=638665088775700000"),
        Product(7, "Pantalón formal negro para hombre", "Ropa", 44.91, "Comodo y perfecto para salidas", "https://siman.vtexassets.com/arquivos/ids/3804081/101202619_1.jpg?v=638080167712400000"),
        Product(8, "Teléfono Galaxy A35 5G", "Electrónica", 339.00, "Excelente telefono, aunque agotado XD", "https://buketomnisportpweb.s3.us-east-2.amazonaws.com/seo/VEFchww97J5yAVA4QZMXGrh7caBhLLG8qr5euzoF.jpeg"),
        Product(9, "Cocina LRGL5841S", "Electrodomesticos", 779.00, "Perfecta para cocinarse unos huevitos", "https://buketomnisportpweb.s3.us-east-2.amazonaws.com/products-images/uk4AhB51fCLlok9p3n85anADx7AhAlXJeIRXU78p.jpeg"),
        Product(10, "Suéter Para Mujer Haily Negro", "Ropa", 34.76, "Calentito y comodo para los días de frío", "https://tottoelsalvador.vtexassets.com/arquivos/ids/231355-600-600?v=638653927734930000&width=600&height=600&aspect=true"),
        )
)