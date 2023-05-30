package com.example.mymusiclist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.mymusiclist.SongAdapter
import com.example.mymusiclist.SongModel
import com.example.mymusiclist.R
import com.example.mymusiclist.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    private val adapter = SongAdapter{
        showMore(it)
    }

    private val songsList = listOf(
        SongModel("Божевiлля Двох","Mistmorn" ,R.drawable.bozhevillia_dvoh, "Блукаємо посеред бляклих вогнів\n" +
                "Нічних привокзальних станцій\n" +
                "Ти так прагнеш мене врятувати від тих\n" +
                "Всеосяжних хвилювань і фрустрацій\n" +
                "Та після своєї останньої смерті я зрозумів\n" +
                "Задихатися досить приємно, приємніше, ніж цілуватись\n" +
                "Нам не сховатися, насувається темрява\n" +
                "Після суєтних днів юності даремної\n" +
                "Так складно бути відвертими\n" +
                "Але я тебе кохаю, напевно, і\n" +
                "Не зважай на мій нетверезий стан\n" +
                "Обіцяю, що це востаннє\n" +
                "Просто хотів сказати хоч раз\n" +
                "Те, чого ти не знаєш\n" +
                "Кинути кілька лагідних фраз\n" +
                "А не, як завжди, зневажливих\n" +
                "У всіх вітринах бачу тепер\n" +
                "Тільки твоє відображення\n" +
                "Для нарікань чимало причин\n" +
                "Та знай, що ти не одна з них\n" +
                "І якщо б тебе не було\n" +
                "Я би давно зник\n" +
                "Я би давно зник\n" +
                "Я би давно зник\n" +
                "Я би давно зник\n" +
                "Я би давно зник\n" +
                "Блукаємо посеред бляклих вогнів\n" +
                "Нічних привокзальних станцій\n" +
                "Ти так прагнеш мене врятувати від тих\n" +
                "Всеосяжних хвилювань і фрустрацій\n" +
                "Та після своєї останньої смерті я зрозумів\n" +
                "Задихатися досить приємно, приємніше, ніж цілуватись\n" +
                "Я би давно зник\n" +
                "Я би давно зник\n" +
                "Я би давно зник\n" +
                "Я би давно зник"),
        SongModel("Три Хвилини", "Друга Ріка", R.drawable.tri_hvilini, "За три хвилини загубився і влюбився та пропав\n" +
                "За три хвилини закохався і набрався твоїх чар\n" +
                "О, скільки тепла в твоїх очах, а віє холод, він не дах\n" +
                "Скільки, скажи, я маю, о, скільки, скажи, тримаю я\n" +
                "Це все що маю я\n" +
                "Це все що маю я\n" +
                "Це все що маю я\n" +
                "Тебе тримаю-маю я\n" +
                "Тебе тримаю-маю я\n" +
                "Приходиш сядеш і мовчиш, мене заводиш та біжиш\n" +
                "Приносиш сльози, сир і яд, мені це треба\n" +
                "О, скільки тепла в твоїх руках, а віє холод, він не дах\n" +
                "Скільки, скажи, я маю, о, скільки, скажи, тримаю я\n" +
                "Я не хотів, просто не встиг\n" +
                "Я не хотів, просто не зміг\n" +
                "Тепер це все що маю я\n" +
                "Все що маю я\n" +
                "Це все що маю я\n" +
                "Це все що маю я\n" +
                "Тебе тримаю-маю я\n" +
                "Тебе тримаю-маю я\n" +
                "Тебе тримаю"),
        SongModel("Так гріє", "Валентин Стрикало", R.drawable.tak_grie, "Так гріє. Кохана, я вже не хворію\n" +
                "Тож завтра я зможу піти\n" +
                "Подалі. Зустрінемося на вокзалі\n" +
                "І поїдем туди\n" +
                "Де ти намалюєш квіти навколо слідів від куль на стіні\n" +
                "Послухай, я хочу ділити з тобою кожну хвилину в житті\n" +
                "Про те, що я завжди чув твій голос\n" +
                "Ти не дізнаєшся ніколи\n" +
                "Гаразд, тікай\n" +
                "А я шукатиму нову!\n" +
                "Весь час нехай не гріє\n" +
                "Я переживу!\n" +
                "Так темно. Послухай, хіба я даремно\n" +
                "Підпилював грати весь рік?\n" +
                "Крізь вікна я піду непомітно\n" +
                "Не відчуваючи ніг\n" +
                "Та ти не пробачиш Богові жорстокість його дітей\n" +
                "І поїзд поїде без нас, тож я не маю інших ідей\n" +
                "Окрім як чекати, і я сам не свій від болю\n" +
                "Ти не дізнаєшся ніколи\n" +
                "Гаразд, тікай\n" +
                "А я шукатиму нову!\n" +
                "Весь час нехай не гріє\n" +
                "Я переживу!\n" +
                "Гаразд, тікай\n" +
                "А я шукатиму нову!\n" +
                "Весь час нехай не гріє\n" +
                "Я переживу!"),
        SongModel("Касета", "Sadsvit", R.drawable.kaseta, "Вікно - холодне повітря\n" +
                "Щодня я відчуваю втрату мого світла\n" +
                "Мотори, звуки автівок\n" +
                "Замивають співи платівок\n" +
                "Як же все по-справжньому набридло!\n" +
                "Хочу знову я вернути спокій\n" +
                "Правда, шкода, що вже все промерзло\n" +
                "Та пішло нарешті на покій\n" +
                "Під звуки касет ми з тобою вдвох\n" +
                "Заснемо навіки, без турбот та зла\n" +
                "Та знову чаруєм ці часи епох\n" +
                "Щоб доля знову назавжди звела\n" +
                "Під звуки касет ми з тобою вдвох\n" +
                "Заснемо навіки, без турбот та зла\n" +
                "Та знову чаруєм ці часи епох\n" +
                "Щоб доля знову назавжди звела\n" +
                "Вікно - холодне повітря\n" +
                "Щодня я відчуваю втрату мого світла\n" +
                "Мотори, звуки автівок\n" +
                "Замивають співи платівок\n" +
                "Як же все по-справжньому набридло!\n" +
                "Хочу знову я вернути спокій\n" +
                "Правда, шкода, що вже все промерзло\n" +
                "Та пішло нарешті на покій\n" +
                "Під звуки касет ми з тобою вдвох\n" +
                "Заснемо навіки, без турбот та зла\n" +
                "Та знову чаруєм ці часи епох\n" +
                "Щоб доля знову назавжди звела\n" +
                "Під звуки касет ми з тобою вдвох\n" +
                "Заснемо навіки, без турбот та зла\n" +
                "Та знову чаруєм ці часи епох\n" +
                "Щоб доля знову назавжди звела"),
        SongModel("Не Відпускай", "77PIDYIZD", R.drawable.ne_vidpuskai, "Сіріє сон, темніє кров\n" +
                "І день починається знов\n" +
                "Це місто вже не чує промов\n" +
                "Він мрію тут не знайшов\n" +
                "Серед цих лукавих церков\n" +
                "Та теплих любовних оков\n" +
                "Робити човен, тікати знов\n" +
                "Надія що вистачить дров\n" +
                "\n" +
                "Але\n" +
                "\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "\n" +
                "І виплив в п‘ятницю страсну\n" +
                "На острів мрій, відчути весну\n" +
                "З собою взяв любов свою\n" +
                "Відчув головою хвилю дурну\n" +
                "Чи це вже сон на яву\n" +
                "Чи в хвилях і справді тону\n" +
                "Побачить він ,мрії труну\n" +
                "Тримай за руку міцніше\n" +
                "\n" +
                "Прошу\n" +
                "\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "Ти не відпускай мене\n" +
                "Не відпускай\n" +
                "\n" +
                "Ти не відпускай мене\n" +
                "За руки все ще тримаємось\n" +
                "Ні сніг, ні дощ тепер не страшні\n" +
                "Бо ми вже точно мерці"),
        SongModel("Не стій під вікном", "Руся ", R.drawable.ne_stiy, "Вечір тихо на землю упав\n" +
                "Засвітив зірницями\n" +
                "Ти забув, як мені обіцяв\n" +
                "Бути вірним і ніжним лицарем\n" +
                "Ти згадай, що мені говорив\n" +
                "Звав ти \"наймилішою\"\n" +
                "Ой, навіщо ти серце дурив?\n" +
                "Ти ж, мій милий, ходив до іншої!\n" +
                "Не стій під вікном\n" +
                "Не дивись засмучено\n" +
                "Не стій під вікном\n" +
                "Я вже заручена\n" +
                "Не жди, не ходи\n" +
                "Разом не стояти нам\n" +
                "Не жди, не ходи\n" +
                "Я вже засватана\n" +
                "Не стій під вікном\n" +
                "Не дивись засмучено\n" +
                "Не стій під вікном\n" +
                "Я вже заручена\n" +
                "Не жди, не ходи\n" +
                "Разом не стояти нам\n" +
                "Не жди, не ходи\n" +
                "Я вже засватана\n" +
                "Я в минуле зруйную місток\n" +
                "Злине сум сполохано\n" +
                "І розтане, як перший сніжок\n" +
                "Ця любов моя непрохана\n" +
                "Не стій під вікном\n" +
                "Не дивись засмучено\n" +
                "Не стій під вікном\n" +
                "Я вже заручена\n" +
                "Не жди, не ходи\n" +
                "Разом не стояти нам\n" +
                "Не жди, не ходи\n" +
                "Я вже засватана"),
        SongModel("Гімн України Phonk", "Dreamstorm", R.drawable.himn, "Ще не вмерла України ні слава, ні воля.\n" +
                "Ще нам, браття молодії, усміхнеться доля.\n" +
                "Згинуть наші вороженьки, як роса на сонці,\n" +
                "Запануєм і ми, браття, у своїй сторонці.\n" +
                "\n" +
                "Душу й тіло ми положим за нашу свободу,\n" +
                "І покажем, що ми, браття, козацького роду.\n" +
                "\n" +
                "Станем, браття, в бій кривавий від Сяну до Дону,\n" +
                "В ріднім краю панувати не дамо нікому;\n" +
                "Чорне море ще всміхнеться, дід Дніпро зрадіє,\n" +
                "Ще у нашій Україні доленька наспіє.\n" +
                "\n" +
                "Душу й тіло ми положим за нашу свободу,\n" +
                "І покажем, що ми, браття, козацького роду.\n" +
                "\n" +
                "А завзяття, праця щира свого ще докаже,\n" +
                "Ще ся волі в Україні піснь гучна розляже,\n" +
                "За Карпати відоб'ється, згомонить степами,\n" +
                "України слава стане поміж народами.\n" +
                "\n" +
                "Душу й тіло ми положим за нашу свободу,\n" +
                "І покажем, що ми, браття, козацького роду."),
        SongModel("Скінхед Вася", "Toster", R.drawable.skinhead, "Він першим хлопцем на колгоспі,\n" +
                "Все через те, що Вася був скінхед.\n" +
                "Він недолюблював колгоспників і Тостер,\n" +
                "Зате у Васі був крутий мопед.\n" +
                "На фарі – свастика, на рамі – Харі Крішна,\n" +
                "І Вася валить як дивізія СС.\n" +
                "Його машина працює ледве чути,\n" +
                "Ні один нігер не піде наперекіс.\n" +
                "\n" +
                "Приспів:\n" +
                "Скінхед Вася на мопеді,\n" +
                "На плечі значок СС,\n" +
                "Скінхед Вася на мопеді,\n" +
                "Наш невизнаний боєць.\n" +
                "Скінхед Вася нам поможе,\n" +
                "Білої раси ліпший друг,\n" +
                "Скінхед Вася нас заложе,\n" +
                "Якщо негри будуть тут!\n" +
                "\n" +
                "Скінхеду бабця зв’язала модний бомбер,\n" +
                "Такого ти ніде вже не знайдеш.\n" +
                "І гади є, гумові трохи правда –\n" +
                "Умілець Вася змайстрував їх із калош.\n" +
                "І кожен день він просинався рано-вранці\n" +
                "І діставав він із-під ліжка свій наган\n" +
                "І розставляв на підвіконнику стакани\n" +
                "І починалась Третя світова!"),
        SongModel("ЛЮБО, БРАТЦІ", "Закрите суспільство", R.drawable.lubo_bratsi, "Як батько заграє, ворог враз ридає\n" +
                "То є іти до кого молодому козаку\n" +
                "Червоні ліворуч, а білі праворуч\n" +
                "А я піду до Батька на гражданськую войну\n" +
                "\n" +
                "Любо, братці, любо, любо, братці, жить\n" +
                "З нашим атаманом не приходиться тужить\n" +
                "\n" +
                "Любо, братці, любо, любо, братці, жить\n" +
                "З нашим атаманом не приходиться тужить\n" +
                "\n" +
                "\n" +
                "Жінка погорює, вийде за другого\n" +
                "За мого товарища, забуде про мене\n" +
                "Жалко тілько волю во широком полі\n" +
                "Сонечка гарячого та вірного коня\n" +
                "\n" +
                "Любо, братці, любо, любо, братці, жить\n" +
                "З нашим атаманом не приходиться тужить\n" +
                "\n" +
                "Любо, братці, любо, любо, братці, жить\n" +
                "За царя, за віру буйну голову зложить\n" +
                "\n" +
                "\n" +
                "А третяя куля, а третяя куля\n" +
                "Цілила в мене, - мого коня мине\n" +
                "Як терпець урвався, то не налякать\n" +
                "Тільки дотягнуться, а на смерть начхать\n" +
                "You might also like\n" +
                "СУМНА ПІСНЯ ПРО АВАКОВА[A SAD SONG ABOUT AVAKOV]\n" +
                "Закрите Суспільство та його друзі / Zakryte\n" +
                "ЗВИЧАЙ І ПРАВА[WONT AND RIGHT]\n" +
                "Закрите Суспільство та його друзі / Zakryte\n" +
                "14 лютого[February 14th]\n" +
                "Закрите Суспільство та його друзі / Zakryte\n" +
                "\n" +
                "Буде дощ холодний, буде дощ холодний\n" +
                "Дощ холодний буде кістки мої обмивать\n" +
                "Буде ворон чорний, буде ворон чорний\n" +
                "Буде чорний ворон волосся моє клювать\n" +
                "\n" +
                "Любо, братці, любо, любо, братці, жить\n" +
                "З нашим атаманом не приходиться тужить\n" +
                "Любо, братці, любо, любо, братці, жить\n" +
                "За царя, за віру буйну голову зложить"),
        SongModel("Ванька Встанька", "Маша Кондратенко", R.drawable.vanka, "Ви казали, що не знали\n" +
                "Ой, як вийшло? Як же так?\n" +
                "У дібровах ви блукали\n" +
                "Куди бігти? Як же так?\n" +
                "Ой ми бачим ваші сльозки\n" +
                "Страшно вам, аж гай шумить\n" +
                "Скаже навіть баба з возу\n" +
                "Що вас всіх треба спалить!\n" +
                "Ванька-встанька, що таке?\n" +
                "Приготуй собі пакет\n" +
                "Ванька-встанька, не біжи\n" +
                "Вже немає куди йти\n" +
                "Ванька-встанька, що таке?\n" +
                "Приготуй собі пакет\n" +
                "Ванька-встанька, не біжи\n" +
                "Вже немає куди йти\n" +
                "Не сховатися нікому\n" +
                "То хіба що по приколу\n" +
                "Морем-полем йде козак\n" +
                "То для вас недобрий знак\n" +
                "Раз, два, три, чотири, п'ять\n" +
                "Вам нема куди тікать\n" +
                "Раз, два, три, чотири, п'ять\n" +
                "Наш козак іде шукать!\n" +
                "Ванька-встанька, що таке?\n" +
                "Приготуй собі пакет\n" +
                "Ванька-встанька, не біжи\n" +
                "Вже немає куди йти\n" +
                "Ванька-встанька, що таке?\n" +
                "Приготуй собі пакет\n" +
                "Ванька-встанька, не біжи\n" +
                "Вже немає куди йти\n" +
                "Ванька-встанька, що таке?\n" +
                "Приготуй собі пакет\n" +
                "Ванька-встанька, не біжи\n" +
                "Вже немає куди йти\n" +
                "Ванька-встанька, що таке?\n" +
                "Приготуй собі пакет\n" +
                "Ванька-встанька, не біжи\n" +
                "Вже немає куди йти"),
        SongModel("Bones", "Imagine Dragons", R.drawable.bones, "Gimme, gimme, gimme some time to think\n" +
                "I'm in the bathroom, looking at me\n" +
                "Face in the mirror is all I need (ooh)\n" +
                "Wait until the reaper takes my life\n" +
                "Never gonna get me out alive\n" +
                "I will live a thousand million lives (ooh)\n" +
                "My patience is waning\n" +
                "Is this entertaining?\n" +
                "Our patience is waning\n" +
                "Is this entertaining?\n" +
                "I-I-I got this feeling, yeah, you know\n" +
                "Where I'm losing all control\n" +
                "'Cause there's magic in my bones\n" +
                "I-I-I got this feeling in my soul\n" +
                "Go ahead and throw your stones\n" +
                "'Cause there's magic in my bones\n" +
                "Playing with a stick of dynamite\n" +
                "There was never gray in black and white\n" +
                "There was never wrong 'til there was right (ooh, oh)\n" +
                "Feeling like a boulder hurtling\n" +
                "Seeing all the vultures circling\n" +
                "Burning in the flames I'm working in\n" +
                "Turning in a bed that's darkening\n" +
                "My patience is waning\n" +
                "Is this entertaining?\n" +
                "Our patience is waning\n" +
                "Is this entertaining?\n" +
                "I-I-I got this feeling, yeah, you know\n" +
                "Where I'm losing all control\n" +
                "'Cause there's magic in my bones (in my bones)\n" +
                "I-I-I got this feeling in my soul\n" +
                "Go ahead and throw your stones\n" +
                "'Cause there's magic in my bones\n" +
                "'Cause there's magic in my bones\n" +
                "Look in the mirror of my mind\n" +
                "Turning the pages of my life\n" +
                "Walking the path so many paced a million times\n" +
                "Drown out the voices in the air\n" +
                "Leaving the ones that never cared\n" +
                "Picking the pieces up and building to the sky\n" +
                "My patience is waning\n" +
                "Is this entertaining?\n" +
                "My patience is waning\n" +
                "Is this entertaining?\n" +
                "I-I-I got this feeling, yeah, you know\n" +
                "Where I'm losing all control\n" +
                "'Cause there's magic in my bones (magic in my bones)\n" +
                "I-I-I got this feeling in my soul (soul)\n" +
                "Go ahead and throw your stones\n" +
                "'Cause there's magic in\n" +
                "There goes my mind (I-I-I)\n" +
                "Don't mind\n" +
                "There goes my mind (there it goes, there it goes)\n" +
                "There goes my mind (I-I-I)\n" +
                "Don't mind (there it goes)\n" +
                "There goes my mind\n" +
                "'Cause there's magic in my bones"),



        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter.addSong(songsList)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentListBinding.bind(view)
        binding.apply{
        rvSong.adapter=adapter
        }
    }

    private fun showMore(song: SongModel)
    {
        findNavController().navigate(ListFragmentDirections.actionListFragmentToAboutFragment(song))
    }
}