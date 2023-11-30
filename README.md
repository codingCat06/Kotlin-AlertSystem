# Kotlin-AlertSystem
## 1. 기본 AlertDialog
        binding.button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("주의!")
                .setMessage("메시지")
                .setPositiveButton("확인",DialogInterface.OnClickListener { dialogInterface, i ->  Positive_Button()})
                .setNegativeButton("취소", DialogInterface.OnClickListener { dialogInterface, i -> Negative_Button() })
            builder.show()
        }

## 2. List AlertDialog

        binding.button2.setOnClickListener {
            val Items : Array<String> = arrayOf("사과","포도","복숭아","키위","바나나")
            val builder = AlertDialog.Builder(this)
                .setTitle("과일 선택")
                .setItems(Items, DialogInterface.OnClickListener { dialogInterface, i ->
                    Choice(Items[i])
                })
            builder.show()
        }
