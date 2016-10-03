var main = {

    handle_user: function () {
        alert('start handle_user function')
        var name = document.getElementById("name").value;
        var ID = document.getElementById("id").value;
        $.ajax({
            type: "POST",
            url: "/lol",
            dataType: "json",
            data: {requestType: "handle_user", name: name, id: ID},
            success: function (data) {
                $('#users_summary').text(data.resp);
            }
        });

    },
};

