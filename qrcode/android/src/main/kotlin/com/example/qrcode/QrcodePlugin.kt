package com.example.qrcode
import io.flutter.plugin.common.PluginRegistry.Registrar

class QrcodePlugin {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      registrar.platformViewRegistry().registerViewFactory("plugins/qrcode_flutter_view", QRCaptureViewFactory(registrar))
    }
  }
}
