import { CapacitorConfig } from "@capacitor/cli";

const config: CapacitorConfig = {
  appId: "com.twof.ride_capital",
  appName: "Ride Shop",
  webDir: "www",
  server: {
    // url: "https://app.rideshop.et/testRetrieve",
    // url: "http://192.168.0.122:3000",
    url: "https://app.rideshop.et",
    // url: "https://ndbl6bwq-3000.uks1.devts",unnels.m
    cleartext: true,
    errorPath: "offline.html",
  },
  plugins: {
    PushNotifications: {
      presentationOptions: ["badge", "sound", "alert"],
    },
  },
};

export default config;
