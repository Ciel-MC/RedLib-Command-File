package com.github.shuaiouke.redlibcommandfile.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class RedLibCommandColorSettingsPage: ColorSettingsPage {
    override fun getIcon(): Icon = RedLibCommandIcon.FILE

    override fun getHighlighter(): SyntaxHighlighter = RedLibCommandSyntaxHighlighter()

    override fun getDemoText(): String {
        return """
            
            structure,struct {
            	help The structure base command
            	permission redlib.dev
            	tool,wand {
            		user player
            		help Get a structure dev tool
            		hook wand
            	}
            	create string:name* {
            		help Register a structure from the selected points for testing
            		hook create
            		user player
            	}
            	build int:rotation?(0) boolean:mirrored?(true) {
            		help Build the created structure at your location
            		hook build
            		user player
            	}
            	export string:filename*?(structure) {
            		help Exports the structure data for the selected points to a file
            		hook export
            		user player
            	}
            	skip material:type? {
            		help Sets a block type to skip when scanning, in case you want to use it for the corners
            		hook skip
            		user player
            	}
            }
            profiler,rprofiler {
            	permission redlib.dev
            	monitor {
            		start {
            			help Starts the tick monitor profiler
            			hook startmonitor
            		}
            		setminimum int:minimum {
            			help Sets the minimum milliseconds for a tick to take to be reported
            			hook setminimum
            		}
            		clear {
            			help Clears the tick monitor profiler reports
            			hook clear
            		}
            		reports {
            			help Shows reports for the longest ticks since the tick monitor profiler started
            			hook reports
            			user player
            		}
            		select int:num {
            			notab
            			hook selectreport
            		}
            	}
            	start {
            		help Starts or resets the RedLib passive profiler
            		hook start
            	}
            	stop {
            		help Stops the RedLib passive profiler
            		hook stop
            	}
            	summary {
            		help Creates and selects a summary from the manual RedLib profiler
            		hook summary
            		user player
            	}
            	verbose {
            		help Toggle verbose mode
            		hook verbose
            		user player
            	}
            	timeformat {
            		help Toggle time between percentages and milliseconds
            		hook timeformat
            		user player
            	}
            	root {
            		help Shows the root method from the selected summary
            		hook root
            		user player
            	}
            	select string:selector {
            		hook select
            		user player
            		notab
            	}
            	up int:count?(1) {
            		help Selects the parent method of the currently selected method
            		hook up
            		user player
            	}
            	collapse {
            		help Collapses all methods
            		hook collapse
            		user player
            	}
            	toggleexpand string:selector {
            		hook toggleexpand
            		user player
            		notab
            	}
            	search int:--depth(0) double:--over-percent(0) int:--over-milliseconds(0) string:term {
            		help Searches the profiler with the given conditions
            		hook search
            		user player
            	}
            	limit int:amount {
            		help Limits the number of children that can be shown under a single method
            		hook limit
            		user player
            	}
            }
            commandchain,cchain commandchain...:commandchain {
            	help Runs several commands in a row separated by ;
            	hook commandchain
            	permission redlib.commandchain
            }
        """.trimIndent()
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "RedLib Command File"

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("TAG", RedLibCommandSyntaxHighlighter.TAG),
            AttributesDescriptor("COMMAND_NAME", RedLibCommandSyntaxHighlighter.COMMAND_NAME),
            AttributesDescriptor("ARG_NAME", RedLibCommandSyntaxHighlighter.ARG_NAME),
            AttributesDescriptor("ARG_TYPE", RedLibCommandSyntaxHighlighter.ARG_TYPE)
        )
    }
}
