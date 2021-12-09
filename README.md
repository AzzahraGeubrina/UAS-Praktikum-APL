# UAS-Praktikum-APL
Dibuat untuk emmenuhi tugas ujian akhir semester praktikum Arsitektur Perangkat Lunak

Kasus yang digunakan : Aplikasi Zoom Meeting
Pattern yang diimplementasikan :
1. Observer Pattern
   Subjeknya adalah zoom meeting, observernya : participant dan host.
   Zoom meeting bisa memberikan notifikasi kepada semua participant dan juga host ketika sesuatu terjadi,
   misalnya seperti notifikasi meeting sedang direkam.
2. Decorator Pattern
   Tampilan meeting bisa di-decorate sesuai dengan keinginan penyelenggara meeting. 
   Salah satu decoration nya adalah menampilkan connected time meeting pada tampuln meeting. 
