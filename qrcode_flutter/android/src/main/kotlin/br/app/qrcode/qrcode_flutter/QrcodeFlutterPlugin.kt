package br.app.qrcode.qrcode_flutter

import io.flutter.plugin.common.PluginRegistry.Registrar

/** QrcodeFlutterPlugin */
class QrcodeFlutterPlugin {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      registrar.platformViewRegistry().registerViewFactory("plugins/qrcode_flutter", QRCaptureViewFactory(registrar))
    }
  }
}
