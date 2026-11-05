package com.retrivedmods.wclient.game.command.impl

import com.retrivedmods.wclient.game.command.Command
import com.retrivedmods.wclient.game.command.manager.CommandManager

object HelpCommand : Command {

    override val name = "toolbox-version"
    override val description = "Show toolbox for mcpe version"
    override val usage = ".toolbox-version"

    override fun execute(args: List<String>) {
        send("Toolbox For MCPE Version: 1.0.0 Pre-release")
    }

    private fun send(msg: String) {
        println("Thank You For using Toolbox for mcpe!")
    }
}
