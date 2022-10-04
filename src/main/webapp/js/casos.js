$(document).ready(function () {

$("#form-crearCaso").submit(function (event) {

event.preventDefault();
        autenticarCaso();
});
        $("#form-crearCaso").submit(function (event) {

event.preventDefault();
        registrarCaso();
});
        });
        function autenticarCaso() {

        let caso = $("#input-clave").val();
                let descripcion = $("#input-descripcion").val();
                let prioridad = $("#input-prioridad").val();
                let fecha = $("#input-fecha").val();
                let estado = $("#input-estado").val();
                let detective = $("#input-detect").val;
                $.ajax({
                type: "GET",
                        dataType: "html",
                        url: "/ServletCasoCrear",
                        data: $.param({
                        caso: caso,
                                descripcion: descripcion,
                                prioridad: prioridad,
                                fecha: fecha,
                                estado: estado,
                                detective: detective
                        }),
                        success: function (result) {
                        let parsedResult = JSON.parse(result);
                                if (parsedResult != false) {
                        $("#error").addClass("d-none");
                                let caso = parsedResult['caso'];
                                document.location.href = "home.html?caso=" + caso;
                        } else {
                        $("#error").removeClass("d-none");
                                $("#error").html("Error en el registro de casos");
                        }
                    }
                });
        }else {
$("#error").removeClass("d-none");
        $("#error").html("\n\
");
}
}

   