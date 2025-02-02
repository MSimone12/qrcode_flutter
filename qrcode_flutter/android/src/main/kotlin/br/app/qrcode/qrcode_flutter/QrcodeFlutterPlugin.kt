package br.app.qrcode.qrcode_flutter

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.PluginRegistry.Registrar

/** QrcodeFlutterPlugin */
class QrcodeFlutterPlugin : FlutterPlugin {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      registrar.platformViewRegistry().registerViewFactory("plugins/qrcode_flutter", QRCaptureViewFactory(registrar))
    }
  }
}
