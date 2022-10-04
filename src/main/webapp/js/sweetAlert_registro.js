function registrarUsuario() {
    let nombre = $("#nombre").val();
    let apellido = $("#apellido").val();
    let edad = $("#edad").val();
    let identificacion = $("#identificacion").val();
    let usuario = $("#usuario").val;
    let email = $("#exampleInputEmail1").val;
    let contrasena = $("#exampleInputPassword").val();
    let contrasenaConfirmacion = $("#exampleInputPasswordl").val();
   

    if (contrasena == contrasenaConfirmacion) {
        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioRegistro",
            data: $.param({
                Nombre : nombre,
                Apellido : apellido,
                edad : edad,
                Usuario : usuario,
                email: email,
                Contrasena : contrasena,
                Identificaion : identificacion
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username = parsedResult['username'];
                    document.location.href = "home.html?username=" + username;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}