# lost-in-translation
Use AWS Translate to translate a sentence in English to another set of language sequentially, and eventually translate back to English, will it lost in translation?

Here is an example run:

From: en (English), text: Do. Or do not. There is no try., to: fa-AF (Dari), انجام بده. يا نه. هيچ تلاشي نيست.<br/>
From: fa-AF (Dari), text: انجام بده. يا نه. هيچ تلاشي نيست., to: af (Afrikaans), doen dit. Of nie. Daar is geen poging nie.<br/>
From: af (Afrikaans), text: doen dit. Of nie. Daar is geen poging nie., to: pl (Polish), Zrób to. Albo nie. Nie ma wysiłku.<br/>
From: pl (Polish), text: Zrób to. Albo nie. Nie ma wysiłku., to: fr-CA (French (Canada)), Faites-le. Ou pas. Il n'y a pas d'effort.<br/>
From: fr-CA (French (Canada)), text: Faites-le. Ou pas. Il n'y a pas d'effort., to: sk (Slovak), Urob to. Alebo nie. Nie je žiadna snaha.<br/>
From: sk (Slovak), text: Urob to. Alebo nie. Nie je žiadna snaha., to: et (Estonian), Tehke seda. Või mitte. Ei ole jõupingutusi.<br/>
From: et (Estonian), text: Tehke seda. Või mitte. Ei ole jõupingutusi., to: de (German), Tun Sie es. Oder nicht. Es gibt keine Mühe.<br/>
From: de (German), text: Tun Sie es. Oder nicht. Es gibt keine Mühe., to: ta (Tamil), அதைச் செய்யுங்கள். அல்லது இல்லை. எந்த பிரச்சனையும் இல்லை.<br/>
From: ta (Tamil), text: அதைச் செய்யுங்கள். அல்லது இல்லை. எந்த பிரச்சனையும் இல்லை., to: zh-TW (Chinese (Traditional)), 就這樣做吧或者沒有。沒有問題。<br/>
From: zh-TW (Chinese (Traditional)), text: 就這樣做吧或者沒有。沒有問題。, to: es (Spanish), Hazlo o no. No hay problema.<br/>
From: es (Spanish), text: Hazlo o no. No hay problema., to: hi (Hindi), यह करो या नहीं। कोई समस्या नहीं। कोई समस्या नहीं।<br/>
From: hi (Hindi), text: यह करो या नहीं। कोई समस्या नहीं। कोई समस्या नहीं।, to: id (Indonesian), Lakukan atau tidak. Tidak masalah<br/>. Tidak masalah.
From: id (Indonesian), text: Lakukan atau tidak. Tidak masalah. Tidak masalah., to: bn (Bengali), করো বা করো না। কোন ব্যাপার না। কোন ব্যাপার না।<br/>
From: bn (Bengali), text: করো বা করো না। কোন ব্যাপার না। কোন ব্যাপার না।, to: sv (Swedish), Gör det eller inte. Det spelar ingen roll. Det spelar ingen roll.<br/>
From: sv (Swedish), text: Gör det eller inte. Det spelar ingen roll. Det spelar ingen roll., to: en (English), Do it or don't. It doesn't matter. It doesn't matter.<br/>
From: en (English), text: Do it or don't. It doesn't matter. It doesn't matter., to: ur (Urdu), ایسا کریں یا نہ کریں۔ اس سے کوئی فرق نہیں پڑتا. اس سے کوئی فرق نہیں پڑتا.<br/>
From: ur (Urdu), text: ایسا کریں یا نہ کریں۔ اس سے کوئی فرق نہیں پڑتا. اس سے کوئی فرق نہیں پڑتا., to: es-MX (Spanish (Mexico)), Hazlo o no. No importa. No importa.<br/>
From: es-MX (Spanish (Mexico)), text: Hazlo o no. No importa. No importa., to: ps (Pashto), دا وکړئ یا نه. دا مهمه نده. دا مهمه نده.<br/>
From: ps (Pashto), text: دا وکړئ یا نه. دا مهمه نده. دا مهمه نده., to: fr (French), Fais-le ou pas. Ça n'a pas d'importance. Ça n'a pas d'importance.<br/>
From: fr (French), text: Fais-le ou pas. Ça n'a pas d'importance. Ça n'a pas d'importance., to: da (Danish), Gør det eller ej. Det er ligegyldigt. Det er ligegyldigt.<br/>
From: da (Danish), text: Gør det eller ej. Det er ligegyldigt. Det er ligegyldigt., to: en (English), Do it or not. It doesn't matter. It doesn't matter.<br/>
