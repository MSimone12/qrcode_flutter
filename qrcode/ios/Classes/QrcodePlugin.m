#import "QrcodePlugin.h"
#import "QRCaptureViewFactory.h"

@implementation QrcodePlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
    QRCaptureViewFactory *factory = [[QRCaptureViewFactory alloc] initWithRegistrar:registrar];
    [registrar registerViewFactory:factory withId:@"plugins/qrcode_flutter_view"];
}

@end
