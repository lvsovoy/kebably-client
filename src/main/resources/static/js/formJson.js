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
}

$('form').submit(function (e) {
  e.preventDefault();
  updateQR();
});