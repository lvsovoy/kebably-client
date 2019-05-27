var qrcode = new QRCode(document.getElementById("qrcode"), "");

(function ($) {
  $.fn.serializeFormJSON = function () {
    var items = $("this").serializeArray();
    $.each(items, function () {
      items[this].push($("this.name"))
    });
    return items;
  };
})(jQuery);

function updateQR() {
  if ($('#qrcode>img').length > 1) {
    console.log("deleted qr");
    qrcode.clear();
  }
  qrcode.makeCode($("form").serialize());
  $("#qrcode>img").css("margin", "auto");
}

$('form').submit(function (e) {
  e.preventDefault();
  updateQR();
});

function generateUuid() {
    document.getElementById("uuid").value = Math.floor(Math.random() * Math.floor(9999)+1001)
}

