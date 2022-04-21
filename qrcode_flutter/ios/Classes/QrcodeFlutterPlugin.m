#import "QrcodeFlutterPlugin.h"
#import "QRCaptureViewFactory.h"

@implementation QrcodeFlutterPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  QRCaptureViewFactory *factory = [[QRCaptureViewFactory alloc] initWithRegistrar:registrar];
  [registrar registerViewFactory:factory withId:@"plugins/qrcode_flutter_view"];
}
@end
