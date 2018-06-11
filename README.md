# Notes


Get all of a user's notes

curl -X POST \
  http://localhost:8080/notes/getall \
  -H 'Cache-Control: no-cache' \
  -H 'Postman-Token: b2aba5da-345c-4601-b2b6-41a9079f4e1a' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F email=kalvin@kalvin.com \
  -F password=password


Create note for user

curl -X POST \
  http://localhost:8080/notes/create \
  -H 'Cache-Control: no-cache' \
  -H 'Postman-Token: ed42e39e-bc40-416c-9557-0c31e43ee7d0' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F email=kalvin@kalvin.com \
  -F password=password \
  -F 'title=title 2' \
  -F 'text=this is the note text'

Delete user's note by note id

curl -X POST \
  http://localhost:8080/notes/delete \
  -H 'Cache-Control: no-cache' \
  -H 'Postman-Token: e826992e-3f38-48f2-9e35-7823c1c75111' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F email=kalvin@kalvin.com \
  -F password=password \
  -F id=2


Update user's note by note id

