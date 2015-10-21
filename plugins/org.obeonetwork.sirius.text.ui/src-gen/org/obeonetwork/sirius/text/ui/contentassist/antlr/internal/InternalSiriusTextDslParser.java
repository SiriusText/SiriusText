package org.obeonetwork.sirius.text.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCUMENTATION", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_WS", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'{'", "'}'", "'as'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "']'", "','", "'icon'", "'representations'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'container'", "'style'", "'semanticCandidatesExpression'", "'if'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'height'", "'width'", "'palette'", "'color'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'list'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DOCUMENTATION=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSiriusTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSiriusTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSiriusTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }


     
     	private SiriusTextDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SiriusTextDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSiriusFile"
    // InternalSiriusTextDsl.g:60:1: entryRuleSiriusFile : ruleSiriusFile EOF ;
    public final void entryRuleSiriusFile() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:61:1: ( ruleSiriusFile EOF )
            // InternalSiriusTextDsl.g:62:1: ruleSiriusFile EOF
            {
             before(grammarAccess.getSiriusFileRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusFile();

            state._fsp--;

             after(grammarAccess.getSiriusFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusFile"


    // $ANTLR start "ruleSiriusFile"
    // InternalSiriusTextDsl.g:69:1: ruleSiriusFile : ( ( rule__SiriusFile__Group__0 ) ) ;
    public final void ruleSiriusFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:73:2: ( ( ( rule__SiriusFile__Group__0 ) ) )
            // InternalSiriusTextDsl.g:74:1: ( ( rule__SiriusFile__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:74:1: ( ( rule__SiriusFile__Group__0 ) )
            // InternalSiriusTextDsl.g:75:1: ( rule__SiriusFile__Group__0 )
            {
             before(grammarAccess.getSiriusFileAccess().getGroup()); 
            // InternalSiriusTextDsl.g:76:1: ( rule__SiriusFile__Group__0 )
            // InternalSiriusTextDsl.g:76:2: rule__SiriusFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusFile"


    // $ANTLR start "entryRuleSiriusFileBody"
    // InternalSiriusTextDsl.g:88:1: entryRuleSiriusFileBody : ruleSiriusFileBody EOF ;
    public final void entryRuleSiriusFileBody() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:89:1: ( ruleSiriusFileBody EOF )
            // InternalSiriusTextDsl.g:90:1: ruleSiriusFileBody EOF
            {
             before(grammarAccess.getSiriusFileBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusFileBody();

            state._fsp--;

             after(grammarAccess.getSiriusFileBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusFileBody"


    // $ANTLR start "ruleSiriusFileBody"
    // InternalSiriusTextDsl.g:97:1: ruleSiriusFileBody : ( ( rule__SiriusFileBody__Alternatives ) ) ;
    public final void ruleSiriusFileBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:101:2: ( ( ( rule__SiriusFileBody__Alternatives ) ) )
            // InternalSiriusTextDsl.g:102:1: ( ( rule__SiriusFileBody__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:102:1: ( ( rule__SiriusFileBody__Alternatives ) )
            // InternalSiriusTextDsl.g:103:1: ( rule__SiriusFileBody__Alternatives )
            {
             before(grammarAccess.getSiriusFileBodyAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:104:1: ( rule__SiriusFileBody__Alternatives )
            // InternalSiriusTextDsl.g:104:2: rule__SiriusFileBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFileBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileBodyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusFileBody"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSiriusTextDsl.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:117:1: ( ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSiriusTextDsl.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSiriusTextDsl.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSiriusTextDsl.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSiriusTextDsl.g:132:1: ( rule__QualifiedName__Group__0 )
            // InternalSiriusTextDsl.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:144:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:145:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:146:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:153:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:157:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSiriusTextDsl.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalSiriusTextDsl.g:159:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSiriusTextDsl.g:160:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalSiriusTextDsl.g:160:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalSiriusTextDsl.g:172:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:173:1: ( ruleImport EOF )
            // InternalSiriusTextDsl.g:174:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSiriusTextDsl.g:181:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:185:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalSiriusTextDsl.g:186:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:186:1: ( ( rule__Import__Group__0 ) )
            // InternalSiriusTextDsl.g:187:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalSiriusTextDsl.g:188:1: ( rule__Import__Group__0 )
            // InternalSiriusTextDsl.g:188:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDesigner"
    // InternalSiriusTextDsl.g:200:1: entryRuleDesigner : ruleDesigner EOF ;
    public final void entryRuleDesigner() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:201:1: ( ruleDesigner EOF )
            // InternalSiriusTextDsl.g:202:1: ruleDesigner EOF
            {
             before(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            ruleDesigner();

            state._fsp--;

             after(grammarAccess.getDesignerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalSiriusTextDsl.g:209:1: ruleDesigner : ( ( rule__Designer__Group__0 ) ) ;
    public final void ruleDesigner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:213:2: ( ( ( rule__Designer__Group__0 ) ) )
            // InternalSiriusTextDsl.g:214:1: ( ( rule__Designer__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:214:1: ( ( rule__Designer__Group__0 ) )
            // InternalSiriusTextDsl.g:215:1: ( rule__Designer__Group__0 )
            {
             before(grammarAccess.getDesignerAccess().getGroup()); 
            // InternalSiriusTextDsl.g:216:1: ( rule__Designer__Group__0 )
            // InternalSiriusTextDsl.g:216:2: rule__Designer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Designer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleViewpoint"
    // InternalSiriusTextDsl.g:228:1: entryRuleViewpoint : ruleViewpoint EOF ;
    public final void entryRuleViewpoint() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:229:1: ( ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:230:1: ruleViewpoint EOF
            {
             before(grammarAccess.getViewpointRule()); 
            pushFollow(FOLLOW_1);
            ruleViewpoint();

            state._fsp--;

             after(grammarAccess.getViewpointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // InternalSiriusTextDsl.g:237:1: ruleViewpoint : ( ( rule__Viewpoint__Group__0 ) ) ;
    public final void ruleViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:241:2: ( ( ( rule__Viewpoint__Group__0 ) ) )
            // InternalSiriusTextDsl.g:242:1: ( ( rule__Viewpoint__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:242:1: ( ( rule__Viewpoint__Group__0 ) )
            // InternalSiriusTextDsl.g:243:1: ( rule__Viewpoint__Group__0 )
            {
             before(grammarAccess.getViewpointAccess().getGroup()); 
            // InternalSiriusTextDsl.g:244:1: ( rule__Viewpoint__Group__0 )
            // InternalSiriusTextDsl.g:244:2: rule__Viewpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleRepresentation"
    // InternalSiriusTextDsl.g:256:1: entryRuleRepresentation : ruleRepresentation EOF ;
    public final void entryRuleRepresentation() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:257:1: ( ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:258:1: ruleRepresentation EOF
            {
             before(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_1);
            ruleRepresentation();

            state._fsp--;

             after(grammarAccess.getRepresentationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // InternalSiriusTextDsl.g:265:1: ruleRepresentation : ( ruleDiagram ) ;
    public final void ruleRepresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:269:2: ( ( ruleDiagram ) )
            // InternalSiriusTextDsl.g:270:1: ( ruleDiagram )
            {
            // InternalSiriusTextDsl.g:270:1: ( ruleDiagram )
            // InternalSiriusTextDsl.g:271:1: ruleDiagram
            {
             before(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDiagram"
    // InternalSiriusTextDsl.g:284:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:285:1: ( ruleDiagram EOF )
            // InternalSiriusTextDsl.g:286:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSiriusTextDsl.g:293:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:297:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // InternalSiriusTextDsl.g:298:1: ( ( rule__Diagram__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:298:1: ( ( rule__Diagram__Group__0 ) )
            // InternalSiriusTextDsl.g:299:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // InternalSiriusTextDsl.g:300:1: ( rule__Diagram__Group__0 )
            // InternalSiriusTextDsl.g:300:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleLayer"
    // InternalSiriusTextDsl.g:312:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:313:1: ( ruleLayer EOF )
            // InternalSiriusTextDsl.g:314:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSiriusTextDsl.g:321:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:325:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalSiriusTextDsl.g:326:1: ( ( rule__Layer__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:326:1: ( ( rule__Layer__Group__0 ) )
            // InternalSiriusTextDsl.g:327:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalSiriusTextDsl.g:328:1: ( rule__Layer__Group__0 )
            // InternalSiriusTextDsl.g:328:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:340:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:341:1: ( ruleMapping EOF )
            // InternalSiriusTextDsl.g:342:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSiriusTextDsl.g:349:1: ruleMapping : ( ruleContainer ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:353:2: ( ( ruleContainer ) )
            // InternalSiriusTextDsl.g:354:1: ( ruleContainer )
            {
            // InternalSiriusTextDsl.g:354:1: ( ruleContainer )
            // InternalSiriusTextDsl.g:355:1: ruleContainer
            {
             before(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleContainer"
    // InternalSiriusTextDsl.g:368:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:369:1: ( ruleContainer EOF )
            // InternalSiriusTextDsl.g:370:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSiriusTextDsl.g:377:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:381:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalSiriusTextDsl.g:382:1: ( ( rule__Container__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:382:1: ( ( rule__Container__Group__0 ) )
            // InternalSiriusTextDsl.g:383:1: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalSiriusTextDsl.g:384:1: ( rule__Container__Group__0 )
            // InternalSiriusTextDsl.g:384:2: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:396:1: entryRuleConditionalContainerStyleDeclaration : ruleConditionalContainerStyleDeclaration EOF ;
    public final void entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:397:1: ( ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:398:1: ruleConditionalContainerStyleDeclaration EOF
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             after(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalContainerStyleDeclaration"


    // $ANTLR start "ruleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:405:1: ruleConditionalContainerStyleDeclaration : ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) ) ;
    public final void ruleConditionalContainerStyleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:409:2: ( ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) ) )
            // InternalSiriusTextDsl.g:410:1: ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:410:1: ( ( rule__ConditionalContainerStyleDeclaration__Group__0 ) )
            // InternalSiriusTextDsl.g:411:1: ( rule__ConditionalContainerStyleDeclaration__Group__0 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getGroup()); 
            // InternalSiriusTextDsl.g:412:1: ( rule__ConditionalContainerStyleDeclaration__Group__0 )
            // InternalSiriusTextDsl.g:412:2: rule__ConditionalContainerStyleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalContainerStyleDeclaration"


    // $ANTLR start "entryRuleStyle"
    // InternalSiriusTextDsl.g:424:1: entryRuleStyle : ruleStyle EOF ;
    public final void entryRuleStyle() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:425:1: ( ruleStyle EOF )
            // InternalSiriusTextDsl.g:426:1: ruleStyle EOF
            {
             before(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleStyle();

            state._fsp--;

             after(grammarAccess.getStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalSiriusTextDsl.g:433:1: ruleStyle : ( ruleContainerStyle ) ;
    public final void ruleStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:437:2: ( ( ruleContainerStyle ) )
            // InternalSiriusTextDsl.g:438:1: ( ruleContainerStyle )
            {
            // InternalSiriusTextDsl.g:438:1: ( ruleContainerStyle )
            // InternalSiriusTextDsl.g:439:1: ruleContainerStyle
            {
             before(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleContainerStyle();

            state._fsp--;

             after(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContainerStyle"
    // InternalSiriusTextDsl.g:452:1: entryRuleContainerStyle : ruleContainerStyle EOF ;
    public final void entryRuleContainerStyle() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:453:1: ( ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:454:1: ruleContainerStyle EOF
            {
             before(grammarAccess.getContainerStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerStyle();

            state._fsp--;

             after(grammarAccess.getContainerStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainerStyle"


    // $ANTLR start "ruleContainerStyle"
    // InternalSiriusTextDsl.g:461:1: ruleContainerStyle : ( ruleGradient ) ;
    public final void ruleContainerStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:465:2: ( ( ruleGradient ) )
            // InternalSiriusTextDsl.g:466:1: ( ruleGradient )
            {
            // InternalSiriusTextDsl.g:466:1: ( ruleGradient )
            // InternalSiriusTextDsl.g:467:1: ruleGradient
            {
             before(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleGradient();

            state._fsp--;

             after(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerStyle"


    // $ANTLR start "entryRuleGradient"
    // InternalSiriusTextDsl.g:480:1: entryRuleGradient : ruleGradient EOF ;
    public final void entryRuleGradient() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:481:1: ( ruleGradient EOF )
            // InternalSiriusTextDsl.g:482:1: ruleGradient EOF
            {
             before(grammarAccess.getGradientRule()); 
            pushFollow(FOLLOW_1);
            ruleGradient();

            state._fsp--;

             after(grammarAccess.getGradientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGradient"


    // $ANTLR start "ruleGradient"
    // InternalSiriusTextDsl.g:489:1: ruleGradient : ( ( rule__Gradient__Group__0 ) ) ;
    public final void ruleGradient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:493:2: ( ( ( rule__Gradient__Group__0 ) ) )
            // InternalSiriusTextDsl.g:494:1: ( ( rule__Gradient__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:494:1: ( ( rule__Gradient__Group__0 ) )
            // InternalSiriusTextDsl.g:495:1: ( rule__Gradient__Group__0 )
            {
             before(grammarAccess.getGradientAccess().getGroup()); 
            // InternalSiriusTextDsl.g:496:1: ( rule__Gradient__Group__0 )
            // InternalSiriusTextDsl.g:496:2: rule__Gradient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradient"


    // $ANTLR start "entryRulePalette"
    // InternalSiriusTextDsl.g:508:1: entryRulePalette : rulePalette EOF ;
    public final void entryRulePalette() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:509:1: ( rulePalette EOF )
            // InternalSiriusTextDsl.g:510:1: rulePalette EOF
            {
             before(grammarAccess.getPaletteRule()); 
            pushFollow(FOLLOW_1);
            rulePalette();

            state._fsp--;

             after(grammarAccess.getPaletteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePalette"


    // $ANTLR start "rulePalette"
    // InternalSiriusTextDsl.g:517:1: rulePalette : ( ( rule__Palette__Group__0 ) ) ;
    public final void rulePalette() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:521:2: ( ( ( rule__Palette__Group__0 ) ) )
            // InternalSiriusTextDsl.g:522:1: ( ( rule__Palette__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:522:1: ( ( rule__Palette__Group__0 ) )
            // InternalSiriusTextDsl.g:523:1: ( rule__Palette__Group__0 )
            {
             before(grammarAccess.getPaletteAccess().getGroup()); 
            // InternalSiriusTextDsl.g:524:1: ( rule__Palette__Group__0 )
            // InternalSiriusTextDsl.g:524:2: rule__Palette__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Palette__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaletteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePalette"


    // $ANTLR start "entryRuleColor"
    // InternalSiriusTextDsl.g:536:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:537:1: ( ruleColor EOF )
            // InternalSiriusTextDsl.g:538:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSiriusTextDsl.g:545:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:549:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalSiriusTextDsl.g:550:1: ( ( rule__Color__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:550:1: ( ( rule__Color__Group__0 ) )
            // InternalSiriusTextDsl.g:551:1: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalSiriusTextDsl.g:552:1: ( rule__Color__Group__0 )
            // InternalSiriusTextDsl.g:552:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleLabelPosition"
    // InternalSiriusTextDsl.g:565:1: ruleLabelPosition : ( ( rule__LabelPosition__Alternatives ) ) ;
    public final void ruleLabelPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:569:1: ( ( ( rule__LabelPosition__Alternatives ) ) )
            // InternalSiriusTextDsl.g:570:1: ( ( rule__LabelPosition__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:570:1: ( ( rule__LabelPosition__Alternatives ) )
            // InternalSiriusTextDsl.g:571:1: ( rule__LabelPosition__Alternatives )
            {
             before(grammarAccess.getLabelPositionAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:572:1: ( rule__LabelPosition__Alternatives )
            // InternalSiriusTextDsl.g:572:2: rule__LabelPosition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LabelPosition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelPosition"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:584:1: ruleGradientDirection : ( ( rule__GradientDirection__Alternatives ) ) ;
    public final void ruleGradientDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:588:1: ( ( ( rule__GradientDirection__Alternatives ) ) )
            // InternalSiriusTextDsl.g:589:1: ( ( rule__GradientDirection__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:589:1: ( ( rule__GradientDirection__Alternatives ) )
            // InternalSiriusTextDsl.g:590:1: ( rule__GradientDirection__Alternatives )
            {
             before(grammarAccess.getGradientDirectionAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:591:1: ( rule__GradientDirection__Alternatives )
            // InternalSiriusTextDsl.g:591:2: rule__GradientDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GradientDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGradientDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradientDirection"


    // $ANTLR start "rule__SiriusFileBody__Alternatives"
    // InternalSiriusTextDsl.g:602:1: rule__SiriusFileBody__Alternatives : ( ( ruleDesigner ) | ( ruleRepresentation ) | ( ruleLayer ) | ( ruleMapping ) | ( ruleStyle ) | ( rulePalette ) );
    public final void rule__SiriusFileBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:606:1: ( ( ruleDesigner ) | ( ruleRepresentation ) | ( ruleLayer ) | ( ruleMapping ) | ( ruleStyle ) | ( rulePalette ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt1=3;
                    }
                    break;
                case 50:
                    {
                    alt1=5;
                    }
                    break;
                case 59:
                    {
                    alt1=6;
                    }
                    break;
                case 32:
                case 61:
                case 62:
                case 63:
                    {
                    alt1=2;
                    }
                    break;
                case 46:
                case 64:
                    {
                    alt1=4;
                    }
                    break;
                case 20:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt1=1;
                }
                break;
            case 32:
            case 61:
            case 62:
            case 63:
                {
                alt1=2;
                }
                break;
            case 43:
                {
                alt1=3;
                }
                break;
            case 46:
            case 64:
                {
                alt1=4;
                }
                break;
            case 50:
                {
                alt1=5;
                }
                break;
            case 59:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSiriusTextDsl.g:607:1: ( ruleDesigner )
                    {
                    // InternalSiriusTextDsl.g:607:1: ( ruleDesigner )
                    // InternalSiriusTextDsl.g:608:1: ruleDesigner
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDesigner();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:613:6: ( ruleRepresentation )
                    {
                    // InternalSiriusTextDsl.g:613:6: ( ruleRepresentation )
                    // InternalSiriusTextDsl.g:614:1: ruleRepresentation
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRepresentation();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:619:6: ( ruleLayer )
                    {
                    // InternalSiriusTextDsl.g:619:6: ( ruleLayer )
                    // InternalSiriusTextDsl.g:620:1: ruleLayer
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLayer();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:625:6: ( ruleMapping )
                    {
                    // InternalSiriusTextDsl.g:625:6: ( ruleMapping )
                    // InternalSiriusTextDsl.g:626:1: ruleMapping
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMapping();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:631:6: ( ruleStyle )
                    {
                    // InternalSiriusTextDsl.g:631:6: ( ruleStyle )
                    // InternalSiriusTextDsl.g:632:1: ruleStyle
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStyle();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:637:6: ( rulePalette )
                    {
                    // InternalSiriusTextDsl.g:637:6: ( rulePalette )
                    // InternalSiriusTextDsl.g:638:1: rulePalette
                    {
                     before(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePalette();

                    state._fsp--;

                     after(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFileBody__Alternatives"


    // $ANTLR start "rule__LabelPosition__Alternatives"
    // InternalSiriusTextDsl.g:648:1: rule__LabelPosition__Alternatives : ( ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'right' ) ) );
    public final void rule__LabelPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:652:1: ( ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'right' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSiriusTextDsl.g:653:1: ( ( 'left' ) )
                    {
                    // InternalSiriusTextDsl.g:653:1: ( ( 'left' ) )
                    // InternalSiriusTextDsl.g:654:1: ( 'left' )
                    {
                     before(grammarAccess.getLabelPositionAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:655:1: ( 'left' )
                    // InternalSiriusTextDsl.g:655:3: 'left'
                    {
                    match(input,10,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelPositionAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:660:6: ( ( 'center' ) )
                    {
                    // InternalSiriusTextDsl.g:660:6: ( ( 'center' ) )
                    // InternalSiriusTextDsl.g:661:1: ( 'center' )
                    {
                     before(grammarAccess.getLabelPositionAccess().getCenterEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:662:1: ( 'center' )
                    // InternalSiriusTextDsl.g:662:3: 'center'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelPositionAccess().getCenterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:667:6: ( ( 'right' ) )
                    {
                    // InternalSiriusTextDsl.g:667:6: ( ( 'right' ) )
                    // InternalSiriusTextDsl.g:668:1: ( 'right' )
                    {
                     before(grammarAccess.getLabelPositionAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:669:1: ( 'right' )
                    // InternalSiriusTextDsl.g:669:3: 'right'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelPositionAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabelPosition__Alternatives"


    // $ANTLR start "rule__GradientDirection__Alternatives"
    // InternalSiriusTextDsl.g:679:1: rule__GradientDirection__Alternatives : ( ( ( 'oblique' ) ) | ( ( 'lefttoright' ) ) | ( ( 'toptobottom' ) ) );
    public final void rule__GradientDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:683:1: ( ( ( 'oblique' ) ) | ( ( 'lefttoright' ) ) | ( ( 'toptobottom' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSiriusTextDsl.g:684:1: ( ( 'oblique' ) )
                    {
                    // InternalSiriusTextDsl.g:684:1: ( ( 'oblique' ) )
                    // InternalSiriusTextDsl.g:685:1: ( 'oblique' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:686:1: ( 'oblique' )
                    // InternalSiriusTextDsl.g:686:3: 'oblique'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:691:6: ( ( 'lefttoright' ) )
                    {
                    // InternalSiriusTextDsl.g:691:6: ( ( 'lefttoright' ) )
                    // InternalSiriusTextDsl.g:692:1: ( 'lefttoright' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:693:1: ( 'lefttoright' )
                    // InternalSiriusTextDsl.g:693:3: 'lefttoright'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:698:6: ( ( 'toptobottom' ) )
                    {
                    // InternalSiriusTextDsl.g:698:6: ( ( 'toptobottom' ) )
                    // InternalSiriusTextDsl.g:699:1: ( 'toptobottom' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:700:1: ( 'toptobottom' )
                    // InternalSiriusTextDsl.g:700:3: 'toptobottom'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradientDirection__Alternatives"


    // $ANTLR start "rule__SiriusFile__Group__0"
    // InternalSiriusTextDsl.g:712:1: rule__SiriusFile__Group__0 : rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1 ;
    public final void rule__SiriusFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:716:1: ( rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1 )
            // InternalSiriusTextDsl.g:717:2: rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SiriusFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__0"


    // $ANTLR start "rule__SiriusFile__Group__0__Impl"
    // InternalSiriusTextDsl.g:724:1: rule__SiriusFile__Group__0__Impl : ( ( rule__SiriusFile__DocumentationAssignment_0 )? ) ;
    public final void rule__SiriusFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:728:1: ( ( ( rule__SiriusFile__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:729:1: ( ( rule__SiriusFile__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:729:1: ( ( rule__SiriusFile__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:730:1: ( rule__SiriusFile__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getSiriusFileAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:731:1: ( rule__SiriusFile__DocumentationAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOCUMENTATION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSiriusTextDsl.g:731:2: rule__SiriusFile__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiriusFile__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiriusFileAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__0__Impl"


    // $ANTLR start "rule__SiriusFile__Group__1"
    // InternalSiriusTextDsl.g:741:1: rule__SiriusFile__Group__1 : rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2 ;
    public final void rule__SiriusFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:745:1: ( rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2 )
            // InternalSiriusTextDsl.g:746:2: rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SiriusFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__1"


    // $ANTLR start "rule__SiriusFile__Group__1__Impl"
    // InternalSiriusTextDsl.g:753:1: rule__SiriusFile__Group__1__Impl : ( 'package' ) ;
    public final void rule__SiriusFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:757:1: ( ( 'package' ) )
            // InternalSiriusTextDsl.g:758:1: ( 'package' )
            {
            // InternalSiriusTextDsl.g:758:1: ( 'package' )
            // InternalSiriusTextDsl.g:759:1: 'package'
            {
             before(grammarAccess.getSiriusFileAccess().getPackageKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSiriusFileAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__1__Impl"


    // $ANTLR start "rule__SiriusFile__Group__2"
    // InternalSiriusTextDsl.g:772:1: rule__SiriusFile__Group__2 : rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3 ;
    public final void rule__SiriusFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:776:1: ( rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3 )
            // InternalSiriusTextDsl.g:777:2: rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SiriusFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__2"


    // $ANTLR start "rule__SiriusFile__Group__2__Impl"
    // InternalSiriusTextDsl.g:784:1: rule__SiriusFile__Group__2__Impl : ( ( rule__SiriusFile__NameAssignment_2 ) ) ;
    public final void rule__SiriusFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:788:1: ( ( ( rule__SiriusFile__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:789:1: ( ( rule__SiriusFile__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:789:1: ( ( rule__SiriusFile__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:790:1: ( rule__SiriusFile__NameAssignment_2 )
            {
             before(grammarAccess.getSiriusFileAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:791:1: ( rule__SiriusFile__NameAssignment_2 )
            // InternalSiriusTextDsl.g:791:2: rule__SiriusFile__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__2__Impl"


    // $ANTLR start "rule__SiriusFile__Group__3"
    // InternalSiriusTextDsl.g:801:1: rule__SiriusFile__Group__3 : rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4 ;
    public final void rule__SiriusFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:805:1: ( rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4 )
            // InternalSiriusTextDsl.g:806:2: rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SiriusFile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__3"


    // $ANTLR start "rule__SiriusFile__Group__3__Impl"
    // InternalSiriusTextDsl.g:813:1: rule__SiriusFile__Group__3__Impl : ( ( rule__SiriusFile__ImportsAssignment_3 )* ) ;
    public final void rule__SiriusFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:817:1: ( ( ( rule__SiriusFile__ImportsAssignment_3 )* ) )
            // InternalSiriusTextDsl.g:818:1: ( ( rule__SiriusFile__ImportsAssignment_3 )* )
            {
            // InternalSiriusTextDsl.g:818:1: ( ( rule__SiriusFile__ImportsAssignment_3 )* )
            // InternalSiriusTextDsl.g:819:1: ( rule__SiriusFile__ImportsAssignment_3 )*
            {
             before(grammarAccess.getSiriusFileAccess().getImportsAssignment_3()); 
            // InternalSiriusTextDsl.g:820:1: ( rule__SiriusFile__ImportsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:820:2: rule__SiriusFile__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SiriusFile__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSiriusFileAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__3__Impl"


    // $ANTLR start "rule__SiriusFile__Group__4"
    // InternalSiriusTextDsl.g:830:1: rule__SiriusFile__Group__4 : rule__SiriusFile__Group__4__Impl ;
    public final void rule__SiriusFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:834:1: ( rule__SiriusFile__Group__4__Impl )
            // InternalSiriusTextDsl.g:835:2: rule__SiriusFile__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__4"


    // $ANTLR start "rule__SiriusFile__Group__4__Impl"
    // InternalSiriusTextDsl.g:841:1: rule__SiriusFile__Group__4__Impl : ( ( rule__SiriusFile__BodyAssignment_4 ) ) ;
    public final void rule__SiriusFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:845:1: ( ( ( rule__SiriusFile__BodyAssignment_4 ) ) )
            // InternalSiriusTextDsl.g:846:1: ( ( rule__SiriusFile__BodyAssignment_4 ) )
            {
            // InternalSiriusTextDsl.g:846:1: ( ( rule__SiriusFile__BodyAssignment_4 ) )
            // InternalSiriusTextDsl.g:847:1: ( rule__SiriusFile__BodyAssignment_4 )
            {
             before(grammarAccess.getSiriusFileAccess().getBodyAssignment_4()); 
            // InternalSiriusTextDsl.g:848:1: ( rule__SiriusFile__BodyAssignment_4 )
            // InternalSiriusTextDsl.g:848:2: rule__SiriusFile__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SiriusFile__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSiriusFileAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSiriusTextDsl.g:868:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:872:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSiriusTextDsl.g:873:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSiriusTextDsl.g:880:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:884:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:885:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:885:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:886:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSiriusTextDsl.g:897:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:901:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSiriusTextDsl.g:902:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSiriusTextDsl.g:908:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:912:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSiriusTextDsl.g:913:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSiriusTextDsl.g:913:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSiriusTextDsl.g:914:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSiriusTextDsl.g:915:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:915:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSiriusTextDsl.g:929:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:933:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSiriusTextDsl.g:934:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSiriusTextDsl.g:941:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:945:1: ( ( '.' ) )
            // InternalSiriusTextDsl.g:946:1: ( '.' )
            {
            // InternalSiriusTextDsl.g:946:1: ( '.' )
            // InternalSiriusTextDsl.g:947:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSiriusTextDsl.g:960:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:964:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSiriusTextDsl.g:965:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSiriusTextDsl.g:971:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:975:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:976:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:976:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:977:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalSiriusTextDsl.g:992:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:996:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalSiriusTextDsl.g:997:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalSiriusTextDsl.g:1004:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1008:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1009:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1009:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1010:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalSiriusTextDsl.g:1021:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1025:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalSiriusTextDsl.g:1026:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalSiriusTextDsl.g:1032:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1036:1: ( ( ( '.*' )? ) )
            // InternalSiriusTextDsl.g:1037:1: ( ( '.*' )? )
            {
            // InternalSiriusTextDsl.g:1037:1: ( ( '.*' )? )
            // InternalSiriusTextDsl.g:1038:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSiriusTextDsl.g:1039:1: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:1040:2: '.*'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalSiriusTextDsl.g:1055:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1059:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSiriusTextDsl.g:1060:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalSiriusTextDsl.g:1067:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1071:1: ( ( 'import' ) )
            // InternalSiriusTextDsl.g:1072:1: ( 'import' )
            {
            // InternalSiriusTextDsl.g:1072:1: ( 'import' )
            // InternalSiriusTextDsl.g:1073:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalSiriusTextDsl.g:1086:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1090:1: ( rule__Import__Group__1__Impl )
            // InternalSiriusTextDsl.g:1091:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalSiriusTextDsl.g:1097:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1101:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:1102:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:1102:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalSiriusTextDsl.g:1103:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSiriusTextDsl.g:1104:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalSiriusTextDsl.g:1104:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Designer__Group__0"
    // InternalSiriusTextDsl.g:1118:1: rule__Designer__Group__0 : rule__Designer__Group__0__Impl rule__Designer__Group__1 ;
    public final void rule__Designer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1122:1: ( rule__Designer__Group__0__Impl rule__Designer__Group__1 )
            // InternalSiriusTextDsl.g:1123:2: rule__Designer__Group__0__Impl rule__Designer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Designer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__0"


    // $ANTLR start "rule__Designer__Group__0__Impl"
    // InternalSiriusTextDsl.g:1130:1: rule__Designer__Group__0__Impl : ( ( rule__Designer__DocumentationAssignment_0 )? ) ;
    public final void rule__Designer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1134:1: ( ( ( rule__Designer__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1135:1: ( ( rule__Designer__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1135:1: ( ( rule__Designer__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1136:1: ( rule__Designer__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getDesignerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1137:1: ( rule__Designer__DocumentationAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOCUMENTATION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSiriusTextDsl.g:1137:2: rule__Designer__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designer__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignerAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__0__Impl"


    // $ANTLR start "rule__Designer__Group__1"
    // InternalSiriusTextDsl.g:1147:1: rule__Designer__Group__1 : rule__Designer__Group__1__Impl rule__Designer__Group__2 ;
    public final void rule__Designer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1151:1: ( rule__Designer__Group__1__Impl rule__Designer__Group__2 )
            // InternalSiriusTextDsl.g:1152:2: rule__Designer__Group__1__Impl rule__Designer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Designer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__1"


    // $ANTLR start "rule__Designer__Group__1__Impl"
    // InternalSiriusTextDsl.g:1159:1: rule__Designer__Group__1__Impl : ( 'designer' ) ;
    public final void rule__Designer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1163:1: ( ( 'designer' ) )
            // InternalSiriusTextDsl.g:1164:1: ( 'designer' )
            {
            // InternalSiriusTextDsl.g:1164:1: ( 'designer' )
            // InternalSiriusTextDsl.g:1165:1: 'designer'
            {
             before(grammarAccess.getDesignerAccess().getDesignerKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getDesignerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__1__Impl"


    // $ANTLR start "rule__Designer__Group__2"
    // InternalSiriusTextDsl.g:1178:1: rule__Designer__Group__2 : rule__Designer__Group__2__Impl rule__Designer__Group__3 ;
    public final void rule__Designer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1182:1: ( rule__Designer__Group__2__Impl rule__Designer__Group__3 )
            // InternalSiriusTextDsl.g:1183:2: rule__Designer__Group__2__Impl rule__Designer__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Designer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__2"


    // $ANTLR start "rule__Designer__Group__2__Impl"
    // InternalSiriusTextDsl.g:1190:1: rule__Designer__Group__2__Impl : ( ( rule__Designer__NameAssignment_2 ) ) ;
    public final void rule__Designer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1194:1: ( ( ( rule__Designer__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1195:1: ( ( rule__Designer__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1195:1: ( ( rule__Designer__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1196:1: ( rule__Designer__NameAssignment_2 )
            {
             before(grammarAccess.getDesignerAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1197:1: ( rule__Designer__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1197:2: rule__Designer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Designer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDesignerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__2__Impl"


    // $ANTLR start "rule__Designer__Group__3"
    // InternalSiriusTextDsl.g:1207:1: rule__Designer__Group__3 : rule__Designer__Group__3__Impl rule__Designer__Group__4 ;
    public final void rule__Designer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1211:1: ( rule__Designer__Group__3__Impl rule__Designer__Group__4 )
            // InternalSiriusTextDsl.g:1212:2: rule__Designer__Group__3__Impl rule__Designer__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Designer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__3"


    // $ANTLR start "rule__Designer__Group__3__Impl"
    // InternalSiriusTextDsl.g:1219:1: rule__Designer__Group__3__Impl : ( ( rule__Designer__Group_3__0 )? ) ;
    public final void rule__Designer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1223:1: ( ( ( rule__Designer__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:1224:1: ( ( rule__Designer__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:1224:1: ( ( rule__Designer__Group_3__0 )? )
            // InternalSiriusTextDsl.g:1225:1: ( rule__Designer__Group_3__0 )?
            {
             before(grammarAccess.getDesignerAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:1226:1: ( rule__Designer__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:1226:2: rule__Designer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDesignerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__3__Impl"


    // $ANTLR start "rule__Designer__Group__4"
    // InternalSiriusTextDsl.g:1236:1: rule__Designer__Group__4 : rule__Designer__Group__4__Impl rule__Designer__Group__5 ;
    public final void rule__Designer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1240:1: ( rule__Designer__Group__4__Impl rule__Designer__Group__5 )
            // InternalSiriusTextDsl.g:1241:2: rule__Designer__Group__4__Impl rule__Designer__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Designer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__4"


    // $ANTLR start "rule__Designer__Group__4__Impl"
    // InternalSiriusTextDsl.g:1248:1: rule__Designer__Group__4__Impl : ( '{' ) ;
    public final void rule__Designer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1252:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:1253:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:1253:1: ( '{' )
            // InternalSiriusTextDsl.g:1254:1: '{'
            {
             before(grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__4__Impl"


    // $ANTLR start "rule__Designer__Group__5"
    // InternalSiriusTextDsl.g:1267:1: rule__Designer__Group__5 : rule__Designer__Group__5__Impl rule__Designer__Group__6 ;
    public final void rule__Designer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1271:1: ( rule__Designer__Group__5__Impl rule__Designer__Group__6 )
            // InternalSiriusTextDsl.g:1272:2: rule__Designer__Group__5__Impl rule__Designer__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Designer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__5"


    // $ANTLR start "rule__Designer__Group__5__Impl"
    // InternalSiriusTextDsl.g:1279:1: rule__Designer__Group__5__Impl : ( ( rule__Designer__ViewpointsAssignment_5 )* ) ;
    public final void rule__Designer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1283:1: ( ( ( rule__Designer__ViewpointsAssignment_5 )* ) )
            // InternalSiriusTextDsl.g:1284:1: ( ( rule__Designer__ViewpointsAssignment_5 )* )
            {
            // InternalSiriusTextDsl.g:1284:1: ( ( rule__Designer__ViewpointsAssignment_5 )* )
            // InternalSiriusTextDsl.g:1285:1: ( rule__Designer__ViewpointsAssignment_5 )*
            {
             before(grammarAccess.getDesignerAccess().getViewpointsAssignment_5()); 
            // InternalSiriusTextDsl.g:1286:1: ( rule__Designer__ViewpointsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOCUMENTATION||LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1286:2: rule__Designer__ViewpointsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Designer__ViewpointsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDesignerAccess().getViewpointsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__5__Impl"


    // $ANTLR start "rule__Designer__Group__6"
    // InternalSiriusTextDsl.g:1296:1: rule__Designer__Group__6 : rule__Designer__Group__6__Impl ;
    public final void rule__Designer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1300:1: ( rule__Designer__Group__6__Impl )
            // InternalSiriusTextDsl.g:1301:2: rule__Designer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__6"


    // $ANTLR start "rule__Designer__Group__6__Impl"
    // InternalSiriusTextDsl.g:1307:1: rule__Designer__Group__6__Impl : ( '}' ) ;
    public final void rule__Designer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1311:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:1312:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:1312:1: ( '}' )
            // InternalSiriusTextDsl.g:1313:1: '}'
            {
             before(grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group__6__Impl"


    // $ANTLR start "rule__Designer__Group_3__0"
    // InternalSiriusTextDsl.g:1340:1: rule__Designer__Group_3__0 : rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1 ;
    public final void rule__Designer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1344:1: ( rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1 )
            // InternalSiriusTextDsl.g:1345:2: rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Designer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group_3__0"


    // $ANTLR start "rule__Designer__Group_3__0__Impl"
    // InternalSiriusTextDsl.g:1352:1: rule__Designer__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Designer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1356:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:1357:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:1357:1: ( 'as' )
            // InternalSiriusTextDsl.g:1358:1: 'as'
            {
             before(grammarAccess.getDesignerAccess().getAsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group_3__0__Impl"


    // $ANTLR start "rule__Designer__Group_3__1"
    // InternalSiriusTextDsl.g:1371:1: rule__Designer__Group_3__1 : rule__Designer__Group_3__1__Impl ;
    public final void rule__Designer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1375:1: ( rule__Designer__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:1376:2: rule__Designer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group_3__1"


    // $ANTLR start "rule__Designer__Group_3__1__Impl"
    // InternalSiriusTextDsl.g:1382:1: rule__Designer__Group_3__1__Impl : ( ( rule__Designer__LabelAssignment_3_1 ) ) ;
    public final void rule__Designer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1386:1: ( ( ( rule__Designer__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:1387:1: ( ( rule__Designer__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:1387:1: ( ( rule__Designer__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:1388:1: ( rule__Designer__LabelAssignment_3_1 )
            {
             before(grammarAccess.getDesignerAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:1389:1: ( rule__Designer__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:1389:2: rule__Designer__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Designer__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignerAccess().getLabelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__Group_3__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group__0"
    // InternalSiriusTextDsl.g:1403:1: rule__Viewpoint__Group__0 : rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 ;
    public final void rule__Viewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1407:1: ( rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 )
            // InternalSiriusTextDsl.g:1408:2: rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Viewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__0"


    // $ANTLR start "rule__Viewpoint__Group__0__Impl"
    // InternalSiriusTextDsl.g:1415:1: rule__Viewpoint__Group__0__Impl : ( ( rule__Viewpoint__DocumentationAssignment_0 )? ) ;
    public final void rule__Viewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1419:1: ( ( ( rule__Viewpoint__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1420:1: ( ( rule__Viewpoint__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1420:1: ( ( rule__Viewpoint__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1421:1: ( rule__Viewpoint__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getViewpointAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1422:1: ( rule__Viewpoint__DocumentationAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOCUMENTATION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSiriusTextDsl.g:1422:2: rule__Viewpoint__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group__1"
    // InternalSiriusTextDsl.g:1432:1: rule__Viewpoint__Group__1 : rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 ;
    public final void rule__Viewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1436:1: ( rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 )
            // InternalSiriusTextDsl.g:1437:2: rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Viewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__1"


    // $ANTLR start "rule__Viewpoint__Group__1__Impl"
    // InternalSiriusTextDsl.g:1444:1: rule__Viewpoint__Group__1__Impl : ( 'viewpoint' ) ;
    public final void rule__Viewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1448:1: ( ( 'viewpoint' ) )
            // InternalSiriusTextDsl.g:1449:1: ( 'viewpoint' )
            {
            // InternalSiriusTextDsl.g:1449:1: ( 'viewpoint' )
            // InternalSiriusTextDsl.g:1450:1: 'viewpoint'
            {
             before(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getViewpointKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group__2"
    // InternalSiriusTextDsl.g:1463:1: rule__Viewpoint__Group__2 : rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 ;
    public final void rule__Viewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1467:1: ( rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 )
            // InternalSiriusTextDsl.g:1468:2: rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Viewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__2"


    // $ANTLR start "rule__Viewpoint__Group__2__Impl"
    // InternalSiriusTextDsl.g:1475:1: rule__Viewpoint__Group__2__Impl : ( ( rule__Viewpoint__NameAssignment_2 ) ) ;
    public final void rule__Viewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1479:1: ( ( ( rule__Viewpoint__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1480:1: ( ( rule__Viewpoint__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1480:1: ( ( rule__Viewpoint__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1481:1: ( rule__Viewpoint__NameAssignment_2 )
            {
             before(grammarAccess.getViewpointAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1482:1: ( rule__Viewpoint__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1482:2: rule__Viewpoint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group__3"
    // InternalSiriusTextDsl.g:1492:1: rule__Viewpoint__Group__3 : rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 ;
    public final void rule__Viewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1496:1: ( rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 )
            // InternalSiriusTextDsl.g:1497:2: rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Viewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__3"


    // $ANTLR start "rule__Viewpoint__Group__3__Impl"
    // InternalSiriusTextDsl.g:1504:1: rule__Viewpoint__Group__3__Impl : ( ( rule__Viewpoint__Group_3__0 )? ) ;
    public final void rule__Viewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1508:1: ( ( ( rule__Viewpoint__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:1509:1: ( ( rule__Viewpoint__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:1509:1: ( ( rule__Viewpoint__Group_3__0 )? )
            // InternalSiriusTextDsl.g:1510:1: ( rule__Viewpoint__Group_3__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:1511:1: ( rule__Viewpoint__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSiriusTextDsl.g:1511:2: rule__Viewpoint__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group__4"
    // InternalSiriusTextDsl.g:1521:1: rule__Viewpoint__Group__4 : rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 ;
    public final void rule__Viewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1525:1: ( rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 )
            // InternalSiriusTextDsl.g:1526:2: rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__4"


    // $ANTLR start "rule__Viewpoint__Group__4__Impl"
    // InternalSiriusTextDsl.g:1533:1: rule__Viewpoint__Group__4__Impl : ( '{' ) ;
    public final void rule__Viewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1537:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:1538:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:1538:1: ( '{' )
            // InternalSiriusTextDsl.g:1539:1: '{'
            {
             before(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group__5"
    // InternalSiriusTextDsl.g:1552:1: rule__Viewpoint__Group__5 : rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 ;
    public final void rule__Viewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1556:1: ( rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 )
            // InternalSiriusTextDsl.g:1557:2: rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__5"


    // $ANTLR start "rule__Viewpoint__Group__5__Impl"
    // InternalSiriusTextDsl.g:1564:1: rule__Viewpoint__Group__5__Impl : ( ( rule__Viewpoint__Group_5__0 )? ) ;
    public final void rule__Viewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1568:1: ( ( ( rule__Viewpoint__Group_5__0 )? ) )
            // InternalSiriusTextDsl.g:1569:1: ( ( rule__Viewpoint__Group_5__0 )? )
            {
            // InternalSiriusTextDsl.g:1569:1: ( ( rule__Viewpoint__Group_5__0 )? )
            // InternalSiriusTextDsl.g:1570:1: ( rule__Viewpoint__Group_5__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_5()); 
            // InternalSiriusTextDsl.g:1571:1: ( rule__Viewpoint__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:1571:2: rule__Viewpoint__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__5__Impl"


    // $ANTLR start "rule__Viewpoint__Group__6"
    // InternalSiriusTextDsl.g:1581:1: rule__Viewpoint__Group__6 : rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 ;
    public final void rule__Viewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1585:1: ( rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 )
            // InternalSiriusTextDsl.g:1586:2: rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__6"


    // $ANTLR start "rule__Viewpoint__Group__6__Impl"
    // InternalSiriusTextDsl.g:1593:1: rule__Viewpoint__Group__6__Impl : ( ( rule__Viewpoint__Group_6__0 )? ) ;
    public final void rule__Viewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1597:1: ( ( ( rule__Viewpoint__Group_6__0 )? ) )
            // InternalSiriusTextDsl.g:1598:1: ( ( rule__Viewpoint__Group_6__0 )? )
            {
            // InternalSiriusTextDsl.g:1598:1: ( ( rule__Viewpoint__Group_6__0 )? )
            // InternalSiriusTextDsl.g:1599:1: ( rule__Viewpoint__Group_6__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_6()); 
            // InternalSiriusTextDsl.g:1600:1: ( rule__Viewpoint__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSiriusTextDsl.g:1600:2: rule__Viewpoint__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__6__Impl"


    // $ANTLR start "rule__Viewpoint__Group__7"
    // InternalSiriusTextDsl.g:1610:1: rule__Viewpoint__Group__7 : rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 ;
    public final void rule__Viewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1614:1: ( rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 )
            // InternalSiriusTextDsl.g:1615:2: rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Viewpoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__7"


    // $ANTLR start "rule__Viewpoint__Group__7__Impl"
    // InternalSiriusTextDsl.g:1622:1: rule__Viewpoint__Group__7__Impl : ( ( rule__Viewpoint__Group_7__0 )? ) ;
    public final void rule__Viewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1626:1: ( ( ( rule__Viewpoint__Group_7__0 )? ) )
            // InternalSiriusTextDsl.g:1627:1: ( ( rule__Viewpoint__Group_7__0 )? )
            {
            // InternalSiriusTextDsl.g:1627:1: ( ( rule__Viewpoint__Group_7__0 )? )
            // InternalSiriusTextDsl.g:1628:1: ( rule__Viewpoint__Group_7__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:1629:1: ( rule__Viewpoint__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSiriusTextDsl.g:1629:2: rule__Viewpoint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__7__Impl"


    // $ANTLR start "rule__Viewpoint__Group__8"
    // InternalSiriusTextDsl.g:1639:1: rule__Viewpoint__Group__8 : rule__Viewpoint__Group__8__Impl ;
    public final void rule__Viewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1643:1: ( rule__Viewpoint__Group__8__Impl )
            // InternalSiriusTextDsl.g:1644:2: rule__Viewpoint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__8"


    // $ANTLR start "rule__Viewpoint__Group__8__Impl"
    // InternalSiriusTextDsl.g:1650:1: rule__Viewpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1654:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:1655:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:1655:1: ( '}' )
            // InternalSiriusTextDsl.g:1656:1: '}'
            {
             before(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group__8__Impl"


    // $ANTLR start "rule__Viewpoint__Group_3__0"
    // InternalSiriusTextDsl.g:1687:1: rule__Viewpoint__Group_3__0 : rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1 ;
    public final void rule__Viewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1691:1: ( rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1 )
            // InternalSiriusTextDsl.g:1692:2: rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_3__0"


    // $ANTLR start "rule__Viewpoint__Group_3__0__Impl"
    // InternalSiriusTextDsl.g:1699:1: rule__Viewpoint__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Viewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1703:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:1704:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:1704:1: ( 'as' )
            // InternalSiriusTextDsl.g:1705:1: 'as'
            {
             before(grammarAccess.getViewpointAccess().getAsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_3__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_3__1"
    // InternalSiriusTextDsl.g:1718:1: rule__Viewpoint__Group_3__1 : rule__Viewpoint__Group_3__1__Impl ;
    public final void rule__Viewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1722:1: ( rule__Viewpoint__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:1723:2: rule__Viewpoint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_3__1"


    // $ANTLR start "rule__Viewpoint__Group_3__1__Impl"
    // InternalSiriusTextDsl.g:1729:1: rule__Viewpoint__Group_3__1__Impl : ( ( rule__Viewpoint__LabelAssignment_3_1 ) ) ;
    public final void rule__Viewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1733:1: ( ( ( rule__Viewpoint__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:1734:1: ( ( rule__Viewpoint__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:1734:1: ( ( rule__Viewpoint__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:1735:1: ( rule__Viewpoint__LabelAssignment_3_1 )
            {
             before(grammarAccess.getViewpointAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:1736:1: ( rule__Viewpoint__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:1736:2: rule__Viewpoint__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getLabelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_3__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__0"
    // InternalSiriusTextDsl.g:1750:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1754:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // InternalSiriusTextDsl.g:1755:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Viewpoint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__0"


    // $ANTLR start "rule__Viewpoint__Group_5__0__Impl"
    // InternalSiriusTextDsl.g:1762:1: rule__Viewpoint__Group_5__0__Impl : ( 'modelFileExtensions' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1766:1: ( ( 'modelFileExtensions' ) )
            // InternalSiriusTextDsl.g:1767:1: ( 'modelFileExtensions' )
            {
            // InternalSiriusTextDsl.g:1767:1: ( 'modelFileExtensions' )
            // InternalSiriusTextDsl.g:1768:1: 'modelFileExtensions'
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__1"
    // InternalSiriusTextDsl.g:1781:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2 ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1785:1: ( rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2 )
            // InternalSiriusTextDsl.g:1786:2: rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Viewpoint__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__1"


    // $ANTLR start "rule__Viewpoint__Group_5__1__Impl"
    // InternalSiriusTextDsl.g:1793:1: rule__Viewpoint__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1797:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:1798:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:1798:1: ( '=' )
            // InternalSiriusTextDsl.g:1799:1: '='
            {
             before(grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__2"
    // InternalSiriusTextDsl.g:1812:1: rule__Viewpoint__Group_5__2 : rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3 ;
    public final void rule__Viewpoint__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1816:1: ( rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3 )
            // InternalSiriusTextDsl.g:1817:2: rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__2"


    // $ANTLR start "rule__Viewpoint__Group_5__2__Impl"
    // InternalSiriusTextDsl.g:1824:1: rule__Viewpoint__Group_5__2__Impl : ( '[' ) ;
    public final void rule__Viewpoint__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1828:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:1829:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:1829:1: ( '[' )
            // InternalSiriusTextDsl.g:1830:1: '['
            {
             before(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__3"
    // InternalSiriusTextDsl.g:1843:1: rule__Viewpoint__Group_5__3 : rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4 ;
    public final void rule__Viewpoint__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1847:1: ( rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4 )
            // InternalSiriusTextDsl.g:1848:2: rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4
            {
            pushFollow(FOLLOW_19);
            rule__Viewpoint__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__3"


    // $ANTLR start "rule__Viewpoint__Group_5__3__Impl"
    // InternalSiriusTextDsl.g:1855:1: rule__Viewpoint__Group_5__3__Impl : ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) ) ;
    public final void rule__Viewpoint__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1859:1: ( ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) ) )
            // InternalSiriusTextDsl.g:1860:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) )
            {
            // InternalSiriusTextDsl.g:1860:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) )
            // InternalSiriusTextDsl.g:1861:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 )
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_3()); 
            // InternalSiriusTextDsl.g:1862:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 )
            // InternalSiriusTextDsl.g:1862:2: rule__Viewpoint__ModelFileExtensionsAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__ModelFileExtensionsAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__4"
    // InternalSiriusTextDsl.g:1872:1: rule__Viewpoint__Group_5__4 : rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5 ;
    public final void rule__Viewpoint__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1876:1: ( rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5 )
            // InternalSiriusTextDsl.g:1877:2: rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5
            {
            pushFollow(FOLLOW_19);
            rule__Viewpoint__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__4"


    // $ANTLR start "rule__Viewpoint__Group_5__4__Impl"
    // InternalSiriusTextDsl.g:1884:1: rule__Viewpoint__Group_5__4__Impl : ( ( rule__Viewpoint__Group_5_4__0 )* ) ;
    public final void rule__Viewpoint__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1888:1: ( ( ( rule__Viewpoint__Group_5_4__0 )* ) )
            // InternalSiriusTextDsl.g:1889:1: ( ( rule__Viewpoint__Group_5_4__0 )* )
            {
            // InternalSiriusTextDsl.g:1889:1: ( ( rule__Viewpoint__Group_5_4__0 )* )
            // InternalSiriusTextDsl.g:1890:1: ( rule__Viewpoint__Group_5_4__0 )*
            {
             before(grammarAccess.getViewpointAccess().getGroup_5_4()); 
            // InternalSiriusTextDsl.g:1891:1: ( rule__Viewpoint__Group_5_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1891:2: rule__Viewpoint__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Viewpoint__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getViewpointAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5__5"
    // InternalSiriusTextDsl.g:1901:1: rule__Viewpoint__Group_5__5 : rule__Viewpoint__Group_5__5__Impl ;
    public final void rule__Viewpoint__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1905:1: ( rule__Viewpoint__Group_5__5__Impl )
            // InternalSiriusTextDsl.g:1906:2: rule__Viewpoint__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__5"


    // $ANTLR start "rule__Viewpoint__Group_5__5__Impl"
    // InternalSiriusTextDsl.g:1912:1: rule__Viewpoint__Group_5__5__Impl : ( ']' ) ;
    public final void rule__Viewpoint__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1916:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:1917:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:1917:1: ( ']' )
            // InternalSiriusTextDsl.g:1918:1: ']'
            {
             before(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5__5__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5_4__0"
    // InternalSiriusTextDsl.g:1943:1: rule__Viewpoint__Group_5_4__0 : rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1 ;
    public final void rule__Viewpoint__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1947:1: ( rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1 )
            // InternalSiriusTextDsl.g:1948:2: rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5_4__0"


    // $ANTLR start "rule__Viewpoint__Group_5_4__0__Impl"
    // InternalSiriusTextDsl.g:1955:1: rule__Viewpoint__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1959:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:1960:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:1960:1: ( ',' )
            // InternalSiriusTextDsl.g:1961:1: ','
            {
             before(grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5_4__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_5_4__1"
    // InternalSiriusTextDsl.g:1974:1: rule__Viewpoint__Group_5_4__1 : rule__Viewpoint__Group_5_4__1__Impl ;
    public final void rule__Viewpoint__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1978:1: ( rule__Viewpoint__Group_5_4__1__Impl )
            // InternalSiriusTextDsl.g:1979:2: rule__Viewpoint__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5_4__1"


    // $ANTLR start "rule__Viewpoint__Group_5_4__1__Impl"
    // InternalSiriusTextDsl.g:1985:1: rule__Viewpoint__Group_5_4__1__Impl : ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) ) ;
    public final void rule__Viewpoint__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1989:1: ( ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) ) )
            // InternalSiriusTextDsl.g:1990:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) )
            {
            // InternalSiriusTextDsl.g:1990:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) )
            // InternalSiriusTextDsl.g:1991:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 )
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_4_1()); 
            // InternalSiriusTextDsl.g:1992:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 )
            // InternalSiriusTextDsl.g:1992:2: rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_5_4__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__0"
    // InternalSiriusTextDsl.g:2006:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2010:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // InternalSiriusTextDsl.g:2011:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Viewpoint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__0"


    // $ANTLR start "rule__Viewpoint__Group_6__0__Impl"
    // InternalSiriusTextDsl.g:2018:1: rule__Viewpoint__Group_6__0__Impl : ( 'icon' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2022:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:2023:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:2023:1: ( 'icon' )
            // InternalSiriusTextDsl.g:2024:1: 'icon'
            {
             before(grammarAccess.getViewpointAccess().getIconKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getIconKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__1"
    // InternalSiriusTextDsl.g:2037:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2041:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // InternalSiriusTextDsl.g:2042:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__Viewpoint__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__1"


    // $ANTLR start "rule__Viewpoint__Group_6__1__Impl"
    // InternalSiriusTextDsl.g:2049:1: rule__Viewpoint__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2053:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2054:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2054:1: ( '=' )
            // InternalSiriusTextDsl.g:2055:1: '='
            {
             before(grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_6__2"
    // InternalSiriusTextDsl.g:2068:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2072:1: ( rule__Viewpoint__Group_6__2__Impl )
            // InternalSiriusTextDsl.g:2073:2: rule__Viewpoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__2"


    // $ANTLR start "rule__Viewpoint__Group_6__2__Impl"
    // InternalSiriusTextDsl.g:2079:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__IconAssignment_6_2 ) ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2083:1: ( ( ( rule__Viewpoint__IconAssignment_6_2 ) ) )
            // InternalSiriusTextDsl.g:2084:1: ( ( rule__Viewpoint__IconAssignment_6_2 ) )
            {
            // InternalSiriusTextDsl.g:2084:1: ( ( rule__Viewpoint__IconAssignment_6_2 ) )
            // InternalSiriusTextDsl.g:2085:1: ( rule__Viewpoint__IconAssignment_6_2 )
            {
             before(grammarAccess.getViewpointAccess().getIconAssignment_6_2()); 
            // InternalSiriusTextDsl.g:2086:1: ( rule__Viewpoint__IconAssignment_6_2 )
            // InternalSiriusTextDsl.g:2086:2: rule__Viewpoint__IconAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__IconAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getIconAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_6__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__0"
    // InternalSiriusTextDsl.g:2102:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2106:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // InternalSiriusTextDsl.g:2107:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__Viewpoint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__0"


    // $ANTLR start "rule__Viewpoint__Group_7__0__Impl"
    // InternalSiriusTextDsl.g:2114:1: rule__Viewpoint__Group_7__0__Impl : ( 'representations' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2118:1: ( ( 'representations' ) )
            // InternalSiriusTextDsl.g:2119:1: ( 'representations' )
            {
            // InternalSiriusTextDsl.g:2119:1: ( 'representations' )
            // InternalSiriusTextDsl.g:2120:1: 'representations'
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__1"
    // InternalSiriusTextDsl.g:2133:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2137:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // InternalSiriusTextDsl.g:2138:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__Viewpoint__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__1"


    // $ANTLR start "rule__Viewpoint__Group_7__1__Impl"
    // InternalSiriusTextDsl.g:2145:1: rule__Viewpoint__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2149:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2150:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2150:1: ( '=' )
            // InternalSiriusTextDsl.g:2151:1: '='
            {
             before(grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__2"
    // InternalSiriusTextDsl.g:2164:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3 ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2168:1: ( rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3 )
            // InternalSiriusTextDsl.g:2169:2: rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__Viewpoint__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__2"


    // $ANTLR start "rule__Viewpoint__Group_7__2__Impl"
    // InternalSiriusTextDsl.g:2176:1: rule__Viewpoint__Group_7__2__Impl : ( '[' ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2180:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:2181:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:2181:1: ( '[' )
            // InternalSiriusTextDsl.g:2182:1: '['
            {
             before(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__2__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__3"
    // InternalSiriusTextDsl.g:2195:1: rule__Viewpoint__Group_7__3 : rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4 ;
    public final void rule__Viewpoint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2199:1: ( rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4 )
            // InternalSiriusTextDsl.g:2200:2: rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4
            {
            pushFollow(FOLLOW_21);
            rule__Viewpoint__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__3"


    // $ANTLR start "rule__Viewpoint__Group_7__3__Impl"
    // InternalSiriusTextDsl.g:2207:1: rule__Viewpoint__Group_7__3__Impl : ( ( rule__Viewpoint__Group_7_3__0 )? ) ;
    public final void rule__Viewpoint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2211:1: ( ( ( rule__Viewpoint__Group_7_3__0 )? ) )
            // InternalSiriusTextDsl.g:2212:1: ( ( rule__Viewpoint__Group_7_3__0 )? )
            {
            // InternalSiriusTextDsl.g:2212:1: ( ( rule__Viewpoint__Group_7_3__0 )? )
            // InternalSiriusTextDsl.g:2213:1: ( rule__Viewpoint__Group_7_3__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_7_3()); 
            // InternalSiriusTextDsl.g:2214:1: ( rule__Viewpoint__Group_7_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSiriusTextDsl.g:2214:2: rule__Viewpoint__Group_7_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Viewpoint__Group_7_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewpointAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__3__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7__4"
    // InternalSiriusTextDsl.g:2224:1: rule__Viewpoint__Group_7__4 : rule__Viewpoint__Group_7__4__Impl ;
    public final void rule__Viewpoint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2228:1: ( rule__Viewpoint__Group_7__4__Impl )
            // InternalSiriusTextDsl.g:2229:2: rule__Viewpoint__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__4"


    // $ANTLR start "rule__Viewpoint__Group_7__4__Impl"
    // InternalSiriusTextDsl.g:2235:1: rule__Viewpoint__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Viewpoint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2239:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:2240:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:2240:1: ( ']' )
            // InternalSiriusTextDsl.g:2241:1: ']'
            {
             before(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7__4__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3__0"
    // InternalSiriusTextDsl.g:2264:1: rule__Viewpoint__Group_7_3__0 : rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1 ;
    public final void rule__Viewpoint__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2268:1: ( rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1 )
            // InternalSiriusTextDsl.g:2269:2: rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Viewpoint__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3__0"


    // $ANTLR start "rule__Viewpoint__Group_7_3__0__Impl"
    // InternalSiriusTextDsl.g:2276:1: rule__Viewpoint__Group_7_3__0__Impl : ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) ) ;
    public final void rule__Viewpoint__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2280:1: ( ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) ) )
            // InternalSiriusTextDsl.g:2281:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) )
            {
            // InternalSiriusTextDsl.g:2281:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) )
            // InternalSiriusTextDsl.g:2282:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_0 )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_0()); 
            // InternalSiriusTextDsl.g:2283:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_0 )
            // InternalSiriusTextDsl.g:2283:2: rule__Viewpoint__RepresentationsAssignment_7_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__RepresentationsAssignment_7_3_0();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3__1"
    // InternalSiriusTextDsl.g:2293:1: rule__Viewpoint__Group_7_3__1 : rule__Viewpoint__Group_7_3__1__Impl ;
    public final void rule__Viewpoint__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2297:1: ( rule__Viewpoint__Group_7_3__1__Impl )
            // InternalSiriusTextDsl.g:2298:2: rule__Viewpoint__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3__1"


    // $ANTLR start "rule__Viewpoint__Group_7_3__1__Impl"
    // InternalSiriusTextDsl.g:2304:1: rule__Viewpoint__Group_7_3__1__Impl : ( ( rule__Viewpoint__Group_7_3_1__0 )* ) ;
    public final void rule__Viewpoint__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2308:1: ( ( ( rule__Viewpoint__Group_7_3_1__0 )* ) )
            // InternalSiriusTextDsl.g:2309:1: ( ( rule__Viewpoint__Group_7_3_1__0 )* )
            {
            // InternalSiriusTextDsl.g:2309:1: ( ( rule__Viewpoint__Group_7_3_1__0 )* )
            // InternalSiriusTextDsl.g:2310:1: ( rule__Viewpoint__Group_7_3_1__0 )*
            {
             before(grammarAccess.getViewpointAccess().getGroup_7_3_1()); 
            // InternalSiriusTextDsl.g:2311:1: ( rule__Viewpoint__Group_7_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2311:2: rule__Viewpoint__Group_7_3_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Viewpoint__Group_7_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getViewpointAccess().getGroup_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3__1__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__0"
    // InternalSiriusTextDsl.g:2325:1: rule__Viewpoint__Group_7_3_1__0 : rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1 ;
    public final void rule__Viewpoint__Group_7_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2329:1: ( rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1 )
            // InternalSiriusTextDsl.g:2330:2: rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Viewpoint__Group_7_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__0"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__0__Impl"
    // InternalSiriusTextDsl.g:2337:1: rule__Viewpoint__Group_7_3_1__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2341:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:2342:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:2342:1: ( ',' )
            // InternalSiriusTextDsl.g:2343:1: ','
            {
             before(grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__0__Impl"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__1"
    // InternalSiriusTextDsl.g:2356:1: rule__Viewpoint__Group_7_3_1__1 : rule__Viewpoint__Group_7_3_1__1__Impl ;
    public final void rule__Viewpoint__Group_7_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2360:1: ( rule__Viewpoint__Group_7_3_1__1__Impl )
            // InternalSiriusTextDsl.g:2361:2: rule__Viewpoint__Group_7_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__Group_7_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__1"


    // $ANTLR start "rule__Viewpoint__Group_7_3_1__1__Impl"
    // InternalSiriusTextDsl.g:2367:1: rule__Viewpoint__Group_7_3_1__1__Impl : ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) ) ;
    public final void rule__Viewpoint__Group_7_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2371:1: ( ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) ) )
            // InternalSiriusTextDsl.g:2372:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) )
            {
            // InternalSiriusTextDsl.g:2372:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) )
            // InternalSiriusTextDsl.g:2373:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_1_1()); 
            // InternalSiriusTextDsl.g:2374:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 )
            // InternalSiriusTextDsl.g:2374:2: rule__Viewpoint__RepresentationsAssignment_7_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Viewpoint__RepresentationsAssignment_7_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__Group_7_3_1__1__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // InternalSiriusTextDsl.g:2388:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2392:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // InternalSiriusTextDsl.g:2393:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // InternalSiriusTextDsl.g:2400:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__DocumentationAssignment_0 )? ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2404:1: ( ( ( rule__Diagram__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:2405:1: ( ( rule__Diagram__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:2405:1: ( ( rule__Diagram__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:2406:1: ( rule__Diagram__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getDiagramAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:2407:1: ( rule__Diagram__DocumentationAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOCUMENTATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:2407:2: rule__Diagram__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // InternalSiriusTextDsl.g:2417:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2421:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // InternalSiriusTextDsl.g:2422:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // InternalSiriusTextDsl.g:2429:1: rule__Diagram__Group__1__Impl : ( ( rule__Diagram__InitializedAssignment_1 )? ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2433:1: ( ( ( rule__Diagram__InitializedAssignment_1 )? ) )
            // InternalSiriusTextDsl.g:2434:1: ( ( rule__Diagram__InitializedAssignment_1 )? )
            {
            // InternalSiriusTextDsl.g:2434:1: ( ( rule__Diagram__InitializedAssignment_1 )? )
            // InternalSiriusTextDsl.g:2435:1: ( rule__Diagram__InitializedAssignment_1 )?
            {
             before(grammarAccess.getDiagramAccess().getInitializedAssignment_1()); 
            // InternalSiriusTextDsl.g:2436:1: ( rule__Diagram__InitializedAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==61) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:2436:2: rule__Diagram__InitializedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__InitializedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getInitializedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // InternalSiriusTextDsl.g:2446:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2450:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // InternalSiriusTextDsl.g:2451:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // InternalSiriusTextDsl.g:2458:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__ShowOnStartupAssignment_2 )? ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2462:1: ( ( ( rule__Diagram__ShowOnStartupAssignment_2 )? ) )
            // InternalSiriusTextDsl.g:2463:1: ( ( rule__Diagram__ShowOnStartupAssignment_2 )? )
            {
            // InternalSiriusTextDsl.g:2463:1: ( ( rule__Diagram__ShowOnStartupAssignment_2 )? )
            // InternalSiriusTextDsl.g:2464:1: ( rule__Diagram__ShowOnStartupAssignment_2 )?
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupAssignment_2()); 
            // InternalSiriusTextDsl.g:2465:1: ( rule__Diagram__ShowOnStartupAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSiriusTextDsl.g:2465:2: rule__Diagram__ShowOnStartupAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__ShowOnStartupAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getShowOnStartupAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // InternalSiriusTextDsl.g:2475:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2479:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // InternalSiriusTextDsl.g:2480:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // InternalSiriusTextDsl.g:2487:1: rule__Diagram__Group__3__Impl : ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2491:1: ( ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? ) )
            // InternalSiriusTextDsl.g:2492:1: ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? )
            {
            // InternalSiriusTextDsl.g:2492:1: ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? )
            // InternalSiriusTextDsl.g:2493:1: ( rule__Diagram__EnablePopupBarsAssignment_3 )?
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsAssignment_3()); 
            // InternalSiriusTextDsl.g:2494:1: ( rule__Diagram__EnablePopupBarsAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==63) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSiriusTextDsl.g:2494:2: rule__Diagram__EnablePopupBarsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__EnablePopupBarsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getEnablePopupBarsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // InternalSiriusTextDsl.g:2504:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2508:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // InternalSiriusTextDsl.g:2509:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // InternalSiriusTextDsl.g:2516:1: rule__Diagram__Group__4__Impl : ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2520:1: ( ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) ) )
            // InternalSiriusTextDsl.g:2521:1: ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) )
            {
            // InternalSiriusTextDsl.g:2521:1: ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) )
            // InternalSiriusTextDsl.g:2522:1: ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* )
            {
            // InternalSiriusTextDsl.g:2522:1: ( ( '@MetamodelUris' ) )
            // InternalSiriusTextDsl.g:2523:1: ( '@MetamodelUris' )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 
            // InternalSiriusTextDsl.g:2524:1: ( '@MetamodelUris' )
            // InternalSiriusTextDsl.g:2525:2: '@MetamodelUris'
            {
            match(input,32,FOLLOW_25); 

            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 

            }

            // InternalSiriusTextDsl.g:2529:1: ( ( '@MetamodelUris' )* )
            // InternalSiriusTextDsl.g:2530:1: ( '@MetamodelUris' )*
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 
            // InternalSiriusTextDsl.g:2531:1: ( '@MetamodelUris' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2532:2: '@MetamodelUris'
            	    {
            	    match(input,32,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // InternalSiriusTextDsl.g:2544:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl rule__Diagram__Group__6 ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2548:1: ( rule__Diagram__Group__5__Impl rule__Diagram__Group__6 )
            // InternalSiriusTextDsl.g:2549:2: rule__Diagram__Group__5__Impl rule__Diagram__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // InternalSiriusTextDsl.g:2556:1: rule__Diagram__Group__5__Impl : ( '({' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2560:1: ( ( '({' ) )
            // InternalSiriusTextDsl.g:2561:1: ( '({' )
            {
            // InternalSiriusTextDsl.g:2561:1: ( '({' )
            // InternalSiriusTextDsl.g:2562:1: '({'
            {
             before(grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Diagram__Group__6"
    // InternalSiriusTextDsl.g:2575:1: rule__Diagram__Group__6 : rule__Diagram__Group__6__Impl rule__Diagram__Group__7 ;
    public final void rule__Diagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2579:1: ( rule__Diagram__Group__6__Impl rule__Diagram__Group__7 )
            // InternalSiriusTextDsl.g:2580:2: rule__Diagram__Group__6__Impl rule__Diagram__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Diagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__6"


    // $ANTLR start "rule__Diagram__Group__6__Impl"
    // InternalSiriusTextDsl.g:2587:1: rule__Diagram__Group__6__Impl : ( ( rule__Diagram__MetamodelUrisAssignment_6 ) ) ;
    public final void rule__Diagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2591:1: ( ( ( rule__Diagram__MetamodelUrisAssignment_6 ) ) )
            // InternalSiriusTextDsl.g:2592:1: ( ( rule__Diagram__MetamodelUrisAssignment_6 ) )
            {
            // InternalSiriusTextDsl.g:2592:1: ( ( rule__Diagram__MetamodelUrisAssignment_6 ) )
            // InternalSiriusTextDsl.g:2593:1: ( rule__Diagram__MetamodelUrisAssignment_6 )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_6()); 
            // InternalSiriusTextDsl.g:2594:1: ( rule__Diagram__MetamodelUrisAssignment_6 )
            // InternalSiriusTextDsl.g:2594:2: rule__Diagram__MetamodelUrisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__MetamodelUrisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__6__Impl"


    // $ANTLR start "rule__Diagram__Group__7"
    // InternalSiriusTextDsl.g:2604:1: rule__Diagram__Group__7 : rule__Diagram__Group__7__Impl rule__Diagram__Group__8 ;
    public final void rule__Diagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2608:1: ( rule__Diagram__Group__7__Impl rule__Diagram__Group__8 )
            // InternalSiriusTextDsl.g:2609:2: rule__Diagram__Group__7__Impl rule__Diagram__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Diagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__7"


    // $ANTLR start "rule__Diagram__Group__7__Impl"
    // InternalSiriusTextDsl.g:2616:1: rule__Diagram__Group__7__Impl : ( ( rule__Diagram__Group_7__0 )* ) ;
    public final void rule__Diagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2620:1: ( ( ( rule__Diagram__Group_7__0 )* ) )
            // InternalSiriusTextDsl.g:2621:1: ( ( rule__Diagram__Group_7__0 )* )
            {
            // InternalSiriusTextDsl.g:2621:1: ( ( rule__Diagram__Group_7__0 )* )
            // InternalSiriusTextDsl.g:2622:1: ( rule__Diagram__Group_7__0 )*
            {
             before(grammarAccess.getDiagramAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:2623:1: ( rule__Diagram__Group_7__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2623:2: rule__Diagram__Group_7__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Diagram__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__7__Impl"


    // $ANTLR start "rule__Diagram__Group__8"
    // InternalSiriusTextDsl.g:2633:1: rule__Diagram__Group__8 : rule__Diagram__Group__8__Impl rule__Diagram__Group__9 ;
    public final void rule__Diagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2637:1: ( rule__Diagram__Group__8__Impl rule__Diagram__Group__9 )
            // InternalSiriusTextDsl.g:2638:2: rule__Diagram__Group__8__Impl rule__Diagram__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Diagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__8"


    // $ANTLR start "rule__Diagram__Group__8__Impl"
    // InternalSiriusTextDsl.g:2645:1: rule__Diagram__Group__8__Impl : ( '})' ) ;
    public final void rule__Diagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2649:1: ( ( '})' ) )
            // InternalSiriusTextDsl.g:2650:1: ( '})' )
            {
            // InternalSiriusTextDsl.g:2650:1: ( '})' )
            // InternalSiriusTextDsl.g:2651:1: '})'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__8__Impl"


    // $ANTLR start "rule__Diagram__Group__9"
    // InternalSiriusTextDsl.g:2664:1: rule__Diagram__Group__9 : rule__Diagram__Group__9__Impl rule__Diagram__Group__10 ;
    public final void rule__Diagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2668:1: ( rule__Diagram__Group__9__Impl rule__Diagram__Group__10 )
            // InternalSiriusTextDsl.g:2669:2: rule__Diagram__Group__9__Impl rule__Diagram__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__9"


    // $ANTLR start "rule__Diagram__Group__9__Impl"
    // InternalSiriusTextDsl.g:2676:1: rule__Diagram__Group__9__Impl : ( 'diagram' ) ;
    public final void rule__Diagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2680:1: ( ( 'diagram' ) )
            // InternalSiriusTextDsl.g:2681:1: ( 'diagram' )
            {
            // InternalSiriusTextDsl.g:2681:1: ( 'diagram' )
            // InternalSiriusTextDsl.g:2682:1: 'diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__9__Impl"


    // $ANTLR start "rule__Diagram__Group__10"
    // InternalSiriusTextDsl.g:2695:1: rule__Diagram__Group__10 : rule__Diagram__Group__10__Impl rule__Diagram__Group__11 ;
    public final void rule__Diagram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2699:1: ( rule__Diagram__Group__10__Impl rule__Diagram__Group__11 )
            // InternalSiriusTextDsl.g:2700:2: rule__Diagram__Group__10__Impl rule__Diagram__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Diagram__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__10"


    // $ANTLR start "rule__Diagram__Group__10__Impl"
    // InternalSiriusTextDsl.g:2707:1: rule__Diagram__Group__10__Impl : ( ( rule__Diagram__NameAssignment_10 ) ) ;
    public final void rule__Diagram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2711:1: ( ( ( rule__Diagram__NameAssignment_10 ) ) )
            // InternalSiriusTextDsl.g:2712:1: ( ( rule__Diagram__NameAssignment_10 ) )
            {
            // InternalSiriusTextDsl.g:2712:1: ( ( rule__Diagram__NameAssignment_10 ) )
            // InternalSiriusTextDsl.g:2713:1: ( rule__Diagram__NameAssignment_10 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_10()); 
            // InternalSiriusTextDsl.g:2714:1: ( rule__Diagram__NameAssignment_10 )
            // InternalSiriusTextDsl.g:2714:2: rule__Diagram__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__10__Impl"


    // $ANTLR start "rule__Diagram__Group__11"
    // InternalSiriusTextDsl.g:2724:1: rule__Diagram__Group__11 : rule__Diagram__Group__11__Impl rule__Diagram__Group__12 ;
    public final void rule__Diagram__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2728:1: ( rule__Diagram__Group__11__Impl rule__Diagram__Group__12 )
            // InternalSiriusTextDsl.g:2729:2: rule__Diagram__Group__11__Impl rule__Diagram__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__Diagram__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__11"


    // $ANTLR start "rule__Diagram__Group__11__Impl"
    // InternalSiriusTextDsl.g:2736:1: rule__Diagram__Group__11__Impl : ( ( rule__Diagram__Group_11__0 )? ) ;
    public final void rule__Diagram__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2740:1: ( ( ( rule__Diagram__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:2741:1: ( ( rule__Diagram__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:2741:1: ( ( rule__Diagram__Group_11__0 )? )
            // InternalSiriusTextDsl.g:2742:1: ( rule__Diagram__Group_11__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:2743:1: ( rule__Diagram__Group_11__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSiriusTextDsl.g:2743:2: rule__Diagram__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__11__Impl"


    // $ANTLR start "rule__Diagram__Group__12"
    // InternalSiriusTextDsl.g:2753:1: rule__Diagram__Group__12 : rule__Diagram__Group__12__Impl rule__Diagram__Group__13 ;
    public final void rule__Diagram__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2757:1: ( rule__Diagram__Group__12__Impl rule__Diagram__Group__13 )
            // InternalSiriusTextDsl.g:2758:2: rule__Diagram__Group__12__Impl rule__Diagram__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__12"


    // $ANTLR start "rule__Diagram__Group__12__Impl"
    // InternalSiriusTextDsl.g:2765:1: rule__Diagram__Group__12__Impl : ( 'for' ) ;
    public final void rule__Diagram__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2769:1: ( ( 'for' ) )
            // InternalSiriusTextDsl.g:2770:1: ( 'for' )
            {
            // InternalSiriusTextDsl.g:2770:1: ( 'for' )
            // InternalSiriusTextDsl.g:2771:1: 'for'
            {
             before(grammarAccess.getDiagramAccess().getForKeyword_12()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getForKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__12__Impl"


    // $ANTLR start "rule__Diagram__Group__13"
    // InternalSiriusTextDsl.g:2784:1: rule__Diagram__Group__13 : rule__Diagram__Group__13__Impl rule__Diagram__Group__14 ;
    public final void rule__Diagram__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2788:1: ( rule__Diagram__Group__13__Impl rule__Diagram__Group__14 )
            // InternalSiriusTextDsl.g:2789:2: rule__Diagram__Group__13__Impl rule__Diagram__Group__14
            {
            pushFollow(FOLLOW_29);
            rule__Diagram__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__13"


    // $ANTLR start "rule__Diagram__Group__13__Impl"
    // InternalSiriusTextDsl.g:2796:1: rule__Diagram__Group__13__Impl : ( ( rule__Diagram__DomainClassAssignment_13 ) ) ;
    public final void rule__Diagram__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2800:1: ( ( ( rule__Diagram__DomainClassAssignment_13 ) ) )
            // InternalSiriusTextDsl.g:2801:1: ( ( rule__Diagram__DomainClassAssignment_13 ) )
            {
            // InternalSiriusTextDsl.g:2801:1: ( ( rule__Diagram__DomainClassAssignment_13 ) )
            // InternalSiriusTextDsl.g:2802:1: ( rule__Diagram__DomainClassAssignment_13 )
            {
             before(grammarAccess.getDiagramAccess().getDomainClassAssignment_13()); 
            // InternalSiriusTextDsl.g:2803:1: ( rule__Diagram__DomainClassAssignment_13 )
            // InternalSiriusTextDsl.g:2803:2: rule__Diagram__DomainClassAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__DomainClassAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getDomainClassAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__13__Impl"


    // $ANTLR start "rule__Diagram__Group__14"
    // InternalSiriusTextDsl.g:2813:1: rule__Diagram__Group__14 : rule__Diagram__Group__14__Impl rule__Diagram__Group__15 ;
    public final void rule__Diagram__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2817:1: ( rule__Diagram__Group__14__Impl rule__Diagram__Group__15 )
            // InternalSiriusTextDsl.g:2818:2: rule__Diagram__Group__14__Impl rule__Diagram__Group__15
            {
            pushFollow(FOLLOW_29);
            rule__Diagram__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__14"


    // $ANTLR start "rule__Diagram__Group__14__Impl"
    // InternalSiriusTextDsl.g:2825:1: rule__Diagram__Group__14__Impl : ( ( rule__Diagram__Group_14__0 )? ) ;
    public final void rule__Diagram__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2829:1: ( ( ( rule__Diagram__Group_14__0 )? ) )
            // InternalSiriusTextDsl.g:2830:1: ( ( rule__Diagram__Group_14__0 )? )
            {
            // InternalSiriusTextDsl.g:2830:1: ( ( rule__Diagram__Group_14__0 )? )
            // InternalSiriusTextDsl.g:2831:1: ( rule__Diagram__Group_14__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_14()); 
            // InternalSiriusTextDsl.g:2832:1: ( rule__Diagram__Group_14__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:2832:2: rule__Diagram__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__14__Impl"


    // $ANTLR start "rule__Diagram__Group__15"
    // InternalSiriusTextDsl.g:2842:1: rule__Diagram__Group__15 : rule__Diagram__Group__15__Impl rule__Diagram__Group__16 ;
    public final void rule__Diagram__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2846:1: ( rule__Diagram__Group__15__Impl rule__Diagram__Group__16 )
            // InternalSiriusTextDsl.g:2847:2: rule__Diagram__Group__15__Impl rule__Diagram__Group__16
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__15"


    // $ANTLR start "rule__Diagram__Group__15__Impl"
    // InternalSiriusTextDsl.g:2854:1: rule__Diagram__Group__15__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2858:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:2859:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:2859:1: ( '{' )
            // InternalSiriusTextDsl.g:2860:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__15__Impl"


    // $ANTLR start "rule__Diagram__Group__16"
    // InternalSiriusTextDsl.g:2873:1: rule__Diagram__Group__16 : rule__Diagram__Group__16__Impl rule__Diagram__Group__17 ;
    public final void rule__Diagram__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2877:1: ( rule__Diagram__Group__16__Impl rule__Diagram__Group__17 )
            // InternalSiriusTextDsl.g:2878:2: rule__Diagram__Group__16__Impl rule__Diagram__Group__17
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__16"


    // $ANTLR start "rule__Diagram__Group__16__Impl"
    // InternalSiriusTextDsl.g:2885:1: rule__Diagram__Group__16__Impl : ( ( rule__Diagram__Group_16__0 )? ) ;
    public final void rule__Diagram__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2889:1: ( ( ( rule__Diagram__Group_16__0 )? ) )
            // InternalSiriusTextDsl.g:2890:1: ( ( rule__Diagram__Group_16__0 )? )
            {
            // InternalSiriusTextDsl.g:2890:1: ( ( rule__Diagram__Group_16__0 )? )
            // InternalSiriusTextDsl.g:2891:1: ( rule__Diagram__Group_16__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_16()); 
            // InternalSiriusTextDsl.g:2892:1: ( rule__Diagram__Group_16__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:2892:2: rule__Diagram__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__16__Impl"


    // $ANTLR start "rule__Diagram__Group__17"
    // InternalSiriusTextDsl.g:2902:1: rule__Diagram__Group__17 : rule__Diagram__Group__17__Impl rule__Diagram__Group__18 ;
    public final void rule__Diagram__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2906:1: ( rule__Diagram__Group__17__Impl rule__Diagram__Group__18 )
            // InternalSiriusTextDsl.g:2907:2: rule__Diagram__Group__17__Impl rule__Diagram__Group__18
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__17"


    // $ANTLR start "rule__Diagram__Group__17__Impl"
    // InternalSiriusTextDsl.g:2914:1: rule__Diagram__Group__17__Impl : ( ( rule__Diagram__Group_17__0 )? ) ;
    public final void rule__Diagram__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2918:1: ( ( ( rule__Diagram__Group_17__0 )? ) )
            // InternalSiriusTextDsl.g:2919:1: ( ( rule__Diagram__Group_17__0 )? )
            {
            // InternalSiriusTextDsl.g:2919:1: ( ( rule__Diagram__Group_17__0 )? )
            // InternalSiriusTextDsl.g:2920:1: ( rule__Diagram__Group_17__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_17()); 
            // InternalSiriusTextDsl.g:2921:1: ( rule__Diagram__Group_17__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:2921:2: rule__Diagram__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__17__Impl"


    // $ANTLR start "rule__Diagram__Group__18"
    // InternalSiriusTextDsl.g:2931:1: rule__Diagram__Group__18 : rule__Diagram__Group__18__Impl rule__Diagram__Group__19 ;
    public final void rule__Diagram__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2935:1: ( rule__Diagram__Group__18__Impl rule__Diagram__Group__19 )
            // InternalSiriusTextDsl.g:2936:2: rule__Diagram__Group__18__Impl rule__Diagram__Group__19
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__18"


    // $ANTLR start "rule__Diagram__Group__18__Impl"
    // InternalSiriusTextDsl.g:2943:1: rule__Diagram__Group__18__Impl : ( ( rule__Diagram__Group_18__0 )? ) ;
    public final void rule__Diagram__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2947:1: ( ( ( rule__Diagram__Group_18__0 )? ) )
            // InternalSiriusTextDsl.g:2948:1: ( ( rule__Diagram__Group_18__0 )? )
            {
            // InternalSiriusTextDsl.g:2948:1: ( ( rule__Diagram__Group_18__0 )? )
            // InternalSiriusTextDsl.g:2949:1: ( rule__Diagram__Group_18__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_18()); 
            // InternalSiriusTextDsl.g:2950:1: ( rule__Diagram__Group_18__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSiriusTextDsl.g:2950:2: rule__Diagram__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__18__Impl"


    // $ANTLR start "rule__Diagram__Group__19"
    // InternalSiriusTextDsl.g:2960:1: rule__Diagram__Group__19 : rule__Diagram__Group__19__Impl rule__Diagram__Group__20 ;
    public final void rule__Diagram__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2964:1: ( rule__Diagram__Group__19__Impl rule__Diagram__Group__20 )
            // InternalSiriusTextDsl.g:2965:2: rule__Diagram__Group__19__Impl rule__Diagram__Group__20
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__19"


    // $ANTLR start "rule__Diagram__Group__19__Impl"
    // InternalSiriusTextDsl.g:2972:1: rule__Diagram__Group__19__Impl : ( ( rule__Diagram__Group_19__0 )? ) ;
    public final void rule__Diagram__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2976:1: ( ( ( rule__Diagram__Group_19__0 )? ) )
            // InternalSiriusTextDsl.g:2977:1: ( ( rule__Diagram__Group_19__0 )? )
            {
            // InternalSiriusTextDsl.g:2977:1: ( ( rule__Diagram__Group_19__0 )? )
            // InternalSiriusTextDsl.g:2978:1: ( rule__Diagram__Group_19__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_19()); 
            // InternalSiriusTextDsl.g:2979:1: ( rule__Diagram__Group_19__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSiriusTextDsl.g:2979:2: rule__Diagram__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__19__Impl"


    // $ANTLR start "rule__Diagram__Group__20"
    // InternalSiriusTextDsl.g:2989:1: rule__Diagram__Group__20 : rule__Diagram__Group__20__Impl rule__Diagram__Group__21 ;
    public final void rule__Diagram__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2993:1: ( rule__Diagram__Group__20__Impl rule__Diagram__Group__21 )
            // InternalSiriusTextDsl.g:2994:2: rule__Diagram__Group__20__Impl rule__Diagram__Group__21
            {
            pushFollow(FOLLOW_30);
            rule__Diagram__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__20"


    // $ANTLR start "rule__Diagram__Group__20__Impl"
    // InternalSiriusTextDsl.g:3001:1: rule__Diagram__Group__20__Impl : ( ( rule__Diagram__Group_20__0 )? ) ;
    public final void rule__Diagram__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3005:1: ( ( ( rule__Diagram__Group_20__0 )? ) )
            // InternalSiriusTextDsl.g:3006:1: ( ( rule__Diagram__Group_20__0 )? )
            {
            // InternalSiriusTextDsl.g:3006:1: ( ( rule__Diagram__Group_20__0 )? )
            // InternalSiriusTextDsl.g:3007:1: ( rule__Diagram__Group_20__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_20()); 
            // InternalSiriusTextDsl.g:3008:1: ( rule__Diagram__Group_20__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:3008:2: rule__Diagram__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__20__Impl"


    // $ANTLR start "rule__Diagram__Group__21"
    // InternalSiriusTextDsl.g:3018:1: rule__Diagram__Group__21 : rule__Diagram__Group__21__Impl ;
    public final void rule__Diagram__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3022:1: ( rule__Diagram__Group__21__Impl )
            // InternalSiriusTextDsl.g:3023:2: rule__Diagram__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__21__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__21"


    // $ANTLR start "rule__Diagram__Group__21__Impl"
    // InternalSiriusTextDsl.g:3029:1: rule__Diagram__Group__21__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3033:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:3034:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:3034:1: ( '}' )
            // InternalSiriusTextDsl.g:3035:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__21__Impl"


    // $ANTLR start "rule__Diagram__Group_7__0"
    // InternalSiriusTextDsl.g:3092:1: rule__Diagram__Group_7__0 : rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1 ;
    public final void rule__Diagram__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3096:1: ( rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1 )
            // InternalSiriusTextDsl.g:3097:2: rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_7__0"


    // $ANTLR start "rule__Diagram__Group_7__0__Impl"
    // InternalSiriusTextDsl.g:3104:1: rule__Diagram__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Diagram__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3108:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:3109:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:3109:1: ( ',' )
            // InternalSiriusTextDsl.g:3110:1: ','
            {
             before(grammarAccess.getDiagramAccess().getCommaKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_7__0__Impl"


    // $ANTLR start "rule__Diagram__Group_7__1"
    // InternalSiriusTextDsl.g:3123:1: rule__Diagram__Group_7__1 : rule__Diagram__Group_7__1__Impl ;
    public final void rule__Diagram__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3127:1: ( rule__Diagram__Group_7__1__Impl )
            // InternalSiriusTextDsl.g:3128:2: rule__Diagram__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_7__1"


    // $ANTLR start "rule__Diagram__Group_7__1__Impl"
    // InternalSiriusTextDsl.g:3134:1: rule__Diagram__Group_7__1__Impl : ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) ) ;
    public final void rule__Diagram__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3138:1: ( ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) ) )
            // InternalSiriusTextDsl.g:3139:1: ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) )
            {
            // InternalSiriusTextDsl.g:3139:1: ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) )
            // InternalSiriusTextDsl.g:3140:1: ( rule__Diagram__MetamodelUrisAssignment_7_1 )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_7_1()); 
            // InternalSiriusTextDsl.g:3141:1: ( rule__Diagram__MetamodelUrisAssignment_7_1 )
            // InternalSiriusTextDsl.g:3141:2: rule__Diagram__MetamodelUrisAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__MetamodelUrisAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_7__1__Impl"


    // $ANTLR start "rule__Diagram__Group_11__0"
    // InternalSiriusTextDsl.g:3155:1: rule__Diagram__Group_11__0 : rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1 ;
    public final void rule__Diagram__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3159:1: ( rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1 )
            // InternalSiriusTextDsl.g:3160:2: rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_11__0"


    // $ANTLR start "rule__Diagram__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:3167:1: rule__Diagram__Group_11__0__Impl : ( 'as' ) ;
    public final void rule__Diagram__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3171:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:3172:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:3172:1: ( 'as' )
            // InternalSiriusTextDsl.g:3173:1: 'as'
            {
             before(grammarAccess.getDiagramAccess().getAsKeyword_11_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getAsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_11__0__Impl"


    // $ANTLR start "rule__Diagram__Group_11__1"
    // InternalSiriusTextDsl.g:3186:1: rule__Diagram__Group_11__1 : rule__Diagram__Group_11__1__Impl ;
    public final void rule__Diagram__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3190:1: ( rule__Diagram__Group_11__1__Impl )
            // InternalSiriusTextDsl.g:3191:2: rule__Diagram__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_11__1"


    // $ANTLR start "rule__Diagram__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:3197:1: rule__Diagram__Group_11__1__Impl : ( ( rule__Diagram__LabelAssignment_11_1 ) ) ;
    public final void rule__Diagram__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3201:1: ( ( ( rule__Diagram__LabelAssignment_11_1 ) ) )
            // InternalSiriusTextDsl.g:3202:1: ( ( rule__Diagram__LabelAssignment_11_1 ) )
            {
            // InternalSiriusTextDsl.g:3202:1: ( ( rule__Diagram__LabelAssignment_11_1 ) )
            // InternalSiriusTextDsl.g:3203:1: ( rule__Diagram__LabelAssignment_11_1 )
            {
             before(grammarAccess.getDiagramAccess().getLabelAssignment_11_1()); 
            // InternalSiriusTextDsl.g:3204:1: ( rule__Diagram__LabelAssignment_11_1 )
            // InternalSiriusTextDsl.g:3204:2: rule__Diagram__LabelAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__LabelAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getLabelAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_11__1__Impl"


    // $ANTLR start "rule__Diagram__Group_14__0"
    // InternalSiriusTextDsl.g:3218:1: rule__Diagram__Group_14__0 : rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1 ;
    public final void rule__Diagram__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3222:1: ( rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1 )
            // InternalSiriusTextDsl.g:3223:2: rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1
            {
            pushFollow(FOLLOW_31);
            rule__Diagram__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_14__0"


    // $ANTLR start "rule__Diagram__Group_14__0__Impl"
    // InternalSiriusTextDsl.g:3230:1: rule__Diagram__Group_14__0__Impl : ( '?' ) ;
    public final void rule__Diagram__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3234:1: ( ( '?' ) )
            // InternalSiriusTextDsl.g:3235:1: ( '?' )
            {
            // InternalSiriusTextDsl.g:3235:1: ( '?' )
            // InternalSiriusTextDsl.g:3236:1: '?'
            {
             before(grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_14__0__Impl"


    // $ANTLR start "rule__Diagram__Group_14__1"
    // InternalSiriusTextDsl.g:3249:1: rule__Diagram__Group_14__1 : rule__Diagram__Group_14__1__Impl ;
    public final void rule__Diagram__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3253:1: ( rule__Diagram__Group_14__1__Impl )
            // InternalSiriusTextDsl.g:3254:2: rule__Diagram__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_14__1"


    // $ANTLR start "rule__Diagram__Group_14__1__Impl"
    // InternalSiriusTextDsl.g:3260:1: rule__Diagram__Group_14__1__Impl : ( ( rule__Diagram__PreconditionAssignment_14_1 ) ) ;
    public final void rule__Diagram__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3264:1: ( ( ( rule__Diagram__PreconditionAssignment_14_1 ) ) )
            // InternalSiriusTextDsl.g:3265:1: ( ( rule__Diagram__PreconditionAssignment_14_1 ) )
            {
            // InternalSiriusTextDsl.g:3265:1: ( ( rule__Diagram__PreconditionAssignment_14_1 ) )
            // InternalSiriusTextDsl.g:3266:1: ( rule__Diagram__PreconditionAssignment_14_1 )
            {
             before(grammarAccess.getDiagramAccess().getPreconditionAssignment_14_1()); 
            // InternalSiriusTextDsl.g:3267:1: ( rule__Diagram__PreconditionAssignment_14_1 )
            // InternalSiriusTextDsl.g:3267:2: rule__Diagram__PreconditionAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__PreconditionAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getPreconditionAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_14__1__Impl"


    // $ANTLR start "rule__Diagram__Group_16__0"
    // InternalSiriusTextDsl.g:3281:1: rule__Diagram__Group_16__0 : rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1 ;
    public final void rule__Diagram__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3285:1: ( rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1 )
            // InternalSiriusTextDsl.g:3286:2: rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_16__0"


    // $ANTLR start "rule__Diagram__Group_16__0__Impl"
    // InternalSiriusTextDsl.g:3293:1: rule__Diagram__Group_16__0__Impl : ( 'documentation' ) ;
    public final void rule__Diagram__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3297:1: ( ( 'documentation' ) )
            // InternalSiriusTextDsl.g:3298:1: ( 'documentation' )
            {
            // InternalSiriusTextDsl.g:3298:1: ( 'documentation' )
            // InternalSiriusTextDsl.g:3299:1: 'documentation'
            {
             before(grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_16__0__Impl"


    // $ANTLR start "rule__Diagram__Group_16__1"
    // InternalSiriusTextDsl.g:3312:1: rule__Diagram__Group_16__1 : rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2 ;
    public final void rule__Diagram__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3316:1: ( rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2 )
            // InternalSiriusTextDsl.g:3317:2: rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2
            {
            pushFollow(FOLLOW_14);
            rule__Diagram__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_16__1"


    // $ANTLR start "rule__Diagram__Group_16__1__Impl"
    // InternalSiriusTextDsl.g:3324:1: rule__Diagram__Group_16__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3328:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3329:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3329:1: ( '=' )
            // InternalSiriusTextDsl.g:3330:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_16__1__Impl"


    // $ANTLR start "rule__Diagram__Group_16__2"
    // InternalSiriusTextDsl.g:3343:1: rule__Diagram__Group_16__2 : rule__Diagram__Group_16__2__Impl ;
    public final void rule__Diagram__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3347:1: ( rule__Diagram__Group_16__2__Impl )
            // InternalSiriusTextDsl.g:3348:2: rule__Diagram__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_16__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_16__2"


    // $ANTLR start "rule__Diagram__Group_16__2__Impl"
    // InternalSiriusTextDsl.g:3354:1: rule__Diagram__Group_16__2__Impl : ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) ) ;
    public final void rule__Diagram__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3358:1: ( ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) ) )
            // InternalSiriusTextDsl.g:3359:1: ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) )
            {
            // InternalSiriusTextDsl.g:3359:1: ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) )
            // InternalSiriusTextDsl.g:3360:1: ( rule__Diagram__EndUserDocumentationAssignment_16_2 )
            {
             before(grammarAccess.getDiagramAccess().getEndUserDocumentationAssignment_16_2()); 
            // InternalSiriusTextDsl.g:3361:1: ( rule__Diagram__EndUserDocumentationAssignment_16_2 )
            // InternalSiriusTextDsl.g:3361:2: rule__Diagram__EndUserDocumentationAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__EndUserDocumentationAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getEndUserDocumentationAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_16__2__Impl"


    // $ANTLR start "rule__Diagram__Group_17__0"
    // InternalSiriusTextDsl.g:3377:1: rule__Diagram__Group_17__0 : rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1 ;
    public final void rule__Diagram__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3381:1: ( rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1 )
            // InternalSiriusTextDsl.g:3382:2: rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_17__0"


    // $ANTLR start "rule__Diagram__Group_17__0__Impl"
    // InternalSiriusTextDsl.g:3389:1: rule__Diagram__Group_17__0__Impl : ( 'titleExpression' ) ;
    public final void rule__Diagram__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3393:1: ( ( 'titleExpression' ) )
            // InternalSiriusTextDsl.g:3394:1: ( 'titleExpression' )
            {
            // InternalSiriusTextDsl.g:3394:1: ( 'titleExpression' )
            // InternalSiriusTextDsl.g:3395:1: 'titleExpression'
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_17__0__Impl"


    // $ANTLR start "rule__Diagram__Group_17__1"
    // InternalSiriusTextDsl.g:3408:1: rule__Diagram__Group_17__1 : rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2 ;
    public final void rule__Diagram__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3412:1: ( rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2 )
            // InternalSiriusTextDsl.g:3413:2: rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2
            {
            pushFollow(FOLLOW_31);
            rule__Diagram__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_17__1"


    // $ANTLR start "rule__Diagram__Group_17__1__Impl"
    // InternalSiriusTextDsl.g:3420:1: rule__Diagram__Group_17__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3424:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3425:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3425:1: ( '=' )
            // InternalSiriusTextDsl.g:3426:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_17__1__Impl"


    // $ANTLR start "rule__Diagram__Group_17__2"
    // InternalSiriusTextDsl.g:3439:1: rule__Diagram__Group_17__2 : rule__Diagram__Group_17__2__Impl ;
    public final void rule__Diagram__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3443:1: ( rule__Diagram__Group_17__2__Impl )
            // InternalSiriusTextDsl.g:3444:2: rule__Diagram__Group_17__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_17__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_17__2"


    // $ANTLR start "rule__Diagram__Group_17__2__Impl"
    // InternalSiriusTextDsl.g:3450:1: rule__Diagram__Group_17__2__Impl : ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) ) ;
    public final void rule__Diagram__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3454:1: ( ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) ) )
            // InternalSiriusTextDsl.g:3455:1: ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) )
            {
            // InternalSiriusTextDsl.g:3455:1: ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) )
            // InternalSiriusTextDsl.g:3456:1: ( rule__Diagram__TitleExpressionAssignment_17_2 )
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionAssignment_17_2()); 
            // InternalSiriusTextDsl.g:3457:1: ( rule__Diagram__TitleExpressionAssignment_17_2 )
            // InternalSiriusTextDsl.g:3457:2: rule__Diagram__TitleExpressionAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__TitleExpressionAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getTitleExpressionAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_17__2__Impl"


    // $ANTLR start "rule__Diagram__Group_18__0"
    // InternalSiriusTextDsl.g:3473:1: rule__Diagram__Group_18__0 : rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1 ;
    public final void rule__Diagram__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3477:1: ( rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1 )
            // InternalSiriusTextDsl.g:3478:2: rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_18__0"


    // $ANTLR start "rule__Diagram__Group_18__0__Impl"
    // InternalSiriusTextDsl.g:3485:1: rule__Diagram__Group_18__0__Impl : ( 'rootExpression' ) ;
    public final void rule__Diagram__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3489:1: ( ( 'rootExpression' ) )
            // InternalSiriusTextDsl.g:3490:1: ( 'rootExpression' )
            {
            // InternalSiriusTextDsl.g:3490:1: ( 'rootExpression' )
            // InternalSiriusTextDsl.g:3491:1: 'rootExpression'
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_18__0__Impl"


    // $ANTLR start "rule__Diagram__Group_18__1"
    // InternalSiriusTextDsl.g:3504:1: rule__Diagram__Group_18__1 : rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2 ;
    public final void rule__Diagram__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3508:1: ( rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2 )
            // InternalSiriusTextDsl.g:3509:2: rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2
            {
            pushFollow(FOLLOW_31);
            rule__Diagram__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_18__1"


    // $ANTLR start "rule__Diagram__Group_18__1__Impl"
    // InternalSiriusTextDsl.g:3516:1: rule__Diagram__Group_18__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3520:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3521:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3521:1: ( '=' )
            // InternalSiriusTextDsl.g:3522:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_18__1__Impl"


    // $ANTLR start "rule__Diagram__Group_18__2"
    // InternalSiriusTextDsl.g:3535:1: rule__Diagram__Group_18__2 : rule__Diagram__Group_18__2__Impl ;
    public final void rule__Diagram__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3539:1: ( rule__Diagram__Group_18__2__Impl )
            // InternalSiriusTextDsl.g:3540:2: rule__Diagram__Group_18__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_18__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_18__2"


    // $ANTLR start "rule__Diagram__Group_18__2__Impl"
    // InternalSiriusTextDsl.g:3546:1: rule__Diagram__Group_18__2__Impl : ( ( rule__Diagram__RootExpressionAssignment_18_2 ) ) ;
    public final void rule__Diagram__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3550:1: ( ( ( rule__Diagram__RootExpressionAssignment_18_2 ) ) )
            // InternalSiriusTextDsl.g:3551:1: ( ( rule__Diagram__RootExpressionAssignment_18_2 ) )
            {
            // InternalSiriusTextDsl.g:3551:1: ( ( rule__Diagram__RootExpressionAssignment_18_2 ) )
            // InternalSiriusTextDsl.g:3552:1: ( rule__Diagram__RootExpressionAssignment_18_2 )
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionAssignment_18_2()); 
            // InternalSiriusTextDsl.g:3553:1: ( rule__Diagram__RootExpressionAssignment_18_2 )
            // InternalSiriusTextDsl.g:3553:2: rule__Diagram__RootExpressionAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__RootExpressionAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getRootExpressionAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_18__2__Impl"


    // $ANTLR start "rule__Diagram__Group_19__0"
    // InternalSiriusTextDsl.g:3569:1: rule__Diagram__Group_19__0 : rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1 ;
    public final void rule__Diagram__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3573:1: ( rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1 )
            // InternalSiriusTextDsl.g:3574:2: rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_19__0"


    // $ANTLR start "rule__Diagram__Group_19__0__Impl"
    // InternalSiriusTextDsl.g:3581:1: rule__Diagram__Group_19__0__Impl : ( 'defaultLayer' ) ;
    public final void rule__Diagram__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3585:1: ( ( 'defaultLayer' ) )
            // InternalSiriusTextDsl.g:3586:1: ( 'defaultLayer' )
            {
            // InternalSiriusTextDsl.g:3586:1: ( 'defaultLayer' )
            // InternalSiriusTextDsl.g:3587:1: 'defaultLayer'
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_19__0__Impl"


    // $ANTLR start "rule__Diagram__Group_19__1"
    // InternalSiriusTextDsl.g:3600:1: rule__Diagram__Group_19__1 : rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2 ;
    public final void rule__Diagram__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3604:1: ( rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2 )
            // InternalSiriusTextDsl.g:3605:2: rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_19__1"


    // $ANTLR start "rule__Diagram__Group_19__1__Impl"
    // InternalSiriusTextDsl.g:3612:1: rule__Diagram__Group_19__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3616:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3617:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3617:1: ( '=' )
            // InternalSiriusTextDsl.g:3618:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_19__1__Impl"


    // $ANTLR start "rule__Diagram__Group_19__2"
    // InternalSiriusTextDsl.g:3631:1: rule__Diagram__Group_19__2 : rule__Diagram__Group_19__2__Impl ;
    public final void rule__Diagram__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3635:1: ( rule__Diagram__Group_19__2__Impl )
            // InternalSiriusTextDsl.g:3636:2: rule__Diagram__Group_19__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_19__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_19__2"


    // $ANTLR start "rule__Diagram__Group_19__2__Impl"
    // InternalSiriusTextDsl.g:3642:1: rule__Diagram__Group_19__2__Impl : ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) ) ;
    public final void rule__Diagram__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3646:1: ( ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) ) )
            // InternalSiriusTextDsl.g:3647:1: ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) )
            {
            // InternalSiriusTextDsl.g:3647:1: ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) )
            // InternalSiriusTextDsl.g:3648:1: ( rule__Diagram__DefaultLayerAssignment_19_2 )
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerAssignment_19_2()); 
            // InternalSiriusTextDsl.g:3649:1: ( rule__Diagram__DefaultLayerAssignment_19_2 )
            // InternalSiriusTextDsl.g:3649:2: rule__Diagram__DefaultLayerAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__DefaultLayerAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getDefaultLayerAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_19__2__Impl"


    // $ANTLR start "rule__Diagram__Group_20__0"
    // InternalSiriusTextDsl.g:3665:1: rule__Diagram__Group_20__0 : rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1 ;
    public final void rule__Diagram__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3669:1: ( rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1 )
            // InternalSiriusTextDsl.g:3670:2: rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1
            {
            pushFollow(FOLLOW_17);
            rule__Diagram__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__0"


    // $ANTLR start "rule__Diagram__Group_20__0__Impl"
    // InternalSiriusTextDsl.g:3677:1: rule__Diagram__Group_20__0__Impl : ( 'additionalLayers' ) ;
    public final void rule__Diagram__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3681:1: ( ( 'additionalLayers' ) )
            // InternalSiriusTextDsl.g:3682:1: ( 'additionalLayers' )
            {
            // InternalSiriusTextDsl.g:3682:1: ( 'additionalLayers' )
            // InternalSiriusTextDsl.g:3683:1: 'additionalLayers'
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__0__Impl"


    // $ANTLR start "rule__Diagram__Group_20__1"
    // InternalSiriusTextDsl.g:3696:1: rule__Diagram__Group_20__1 : rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2 ;
    public final void rule__Diagram__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3700:1: ( rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2 )
            // InternalSiriusTextDsl.g:3701:2: rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2
            {
            pushFollow(FOLLOW_18);
            rule__Diagram__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__1"


    // $ANTLR start "rule__Diagram__Group_20__1__Impl"
    // InternalSiriusTextDsl.g:3708:1: rule__Diagram__Group_20__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3712:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3713:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3713:1: ( '=' )
            // InternalSiriusTextDsl.g:3714:1: '='
            {
             before(grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__1__Impl"


    // $ANTLR start "rule__Diagram__Group_20__2"
    // InternalSiriusTextDsl.g:3727:1: rule__Diagram__Group_20__2 : rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3 ;
    public final void rule__Diagram__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3731:1: ( rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3 )
            // InternalSiriusTextDsl.g:3732:2: rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3
            {
            pushFollow(FOLLOW_21);
            rule__Diagram__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__2"


    // $ANTLR start "rule__Diagram__Group_20__2__Impl"
    // InternalSiriusTextDsl.g:3739:1: rule__Diagram__Group_20__2__Impl : ( '[' ) ;
    public final void rule__Diagram__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3743:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:3744:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:3744:1: ( '[' )
            // InternalSiriusTextDsl.g:3745:1: '['
            {
             before(grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__2__Impl"


    // $ANTLR start "rule__Diagram__Group_20__3"
    // InternalSiriusTextDsl.g:3758:1: rule__Diagram__Group_20__3 : rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4 ;
    public final void rule__Diagram__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3762:1: ( rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4 )
            // InternalSiriusTextDsl.g:3763:2: rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4
            {
            pushFollow(FOLLOW_21);
            rule__Diagram__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__3"


    // $ANTLR start "rule__Diagram__Group_20__3__Impl"
    // InternalSiriusTextDsl.g:3770:1: rule__Diagram__Group_20__3__Impl : ( ( rule__Diagram__Group_20_3__0 )? ) ;
    public final void rule__Diagram__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3774:1: ( ( ( rule__Diagram__Group_20_3__0 )? ) )
            // InternalSiriusTextDsl.g:3775:1: ( ( rule__Diagram__Group_20_3__0 )? )
            {
            // InternalSiriusTextDsl.g:3775:1: ( ( rule__Diagram__Group_20_3__0 )? )
            // InternalSiriusTextDsl.g:3776:1: ( rule__Diagram__Group_20_3__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_20_3()); 
            // InternalSiriusTextDsl.g:3777:1: ( rule__Diagram__Group_20_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:3777:2: rule__Diagram__Group_20_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Diagram__Group_20_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiagramAccess().getGroup_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__3__Impl"


    // $ANTLR start "rule__Diagram__Group_20__4"
    // InternalSiriusTextDsl.g:3787:1: rule__Diagram__Group_20__4 : rule__Diagram__Group_20__4__Impl ;
    public final void rule__Diagram__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3791:1: ( rule__Diagram__Group_20__4__Impl )
            // InternalSiriusTextDsl.g:3792:2: rule__Diagram__Group_20__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__4"


    // $ANTLR start "rule__Diagram__Group_20__4__Impl"
    // InternalSiriusTextDsl.g:3798:1: rule__Diagram__Group_20__4__Impl : ( ']' ) ;
    public final void rule__Diagram__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3802:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:3803:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:3803:1: ( ']' )
            // InternalSiriusTextDsl.g:3804:1: ']'
            {
             before(grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20__4__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3__0"
    // InternalSiriusTextDsl.g:3827:1: rule__Diagram__Group_20_3__0 : rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1 ;
    public final void rule__Diagram__Group_20_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3831:1: ( rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1 )
            // InternalSiriusTextDsl.g:3832:2: rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Diagram__Group_20_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3__0"


    // $ANTLR start "rule__Diagram__Group_20_3__0__Impl"
    // InternalSiriusTextDsl.g:3839:1: rule__Diagram__Group_20_3__0__Impl : ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) ) ;
    public final void rule__Diagram__Group_20_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3843:1: ( ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) ) )
            // InternalSiriusTextDsl.g:3844:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) )
            {
            // InternalSiriusTextDsl.g:3844:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) )
            // InternalSiriusTextDsl.g:3845:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_0 )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_0()); 
            // InternalSiriusTextDsl.g:3846:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_0 )
            // InternalSiriusTextDsl.g:3846:2: rule__Diagram__AdditionalLayersAssignment_20_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__AdditionalLayersAssignment_20_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3__0__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3__1"
    // InternalSiriusTextDsl.g:3856:1: rule__Diagram__Group_20_3__1 : rule__Diagram__Group_20_3__1__Impl ;
    public final void rule__Diagram__Group_20_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3860:1: ( rule__Diagram__Group_20_3__1__Impl )
            // InternalSiriusTextDsl.g:3861:2: rule__Diagram__Group_20_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3__1"


    // $ANTLR start "rule__Diagram__Group_20_3__1__Impl"
    // InternalSiriusTextDsl.g:3867:1: rule__Diagram__Group_20_3__1__Impl : ( ( rule__Diagram__Group_20_3_1__0 )* ) ;
    public final void rule__Diagram__Group_20_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3871:1: ( ( ( rule__Diagram__Group_20_3_1__0 )* ) )
            // InternalSiriusTextDsl.g:3872:1: ( ( rule__Diagram__Group_20_3_1__0 )* )
            {
            // InternalSiriusTextDsl.g:3872:1: ( ( rule__Diagram__Group_20_3_1__0 )* )
            // InternalSiriusTextDsl.g:3873:1: ( rule__Diagram__Group_20_3_1__0 )*
            {
             before(grammarAccess.getDiagramAccess().getGroup_20_3_1()); 
            // InternalSiriusTextDsl.g:3874:1: ( rule__Diagram__Group_20_3_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3874:2: rule__Diagram__Group_20_3_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Diagram__Group_20_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getGroup_20_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3__1__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3_1__0"
    // InternalSiriusTextDsl.g:3888:1: rule__Diagram__Group_20_3_1__0 : rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1 ;
    public final void rule__Diagram__Group_20_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3892:1: ( rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1 )
            // InternalSiriusTextDsl.g:3893:2: rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group_20_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3_1__0"


    // $ANTLR start "rule__Diagram__Group_20_3_1__0__Impl"
    // InternalSiriusTextDsl.g:3900:1: rule__Diagram__Group_20_3_1__0__Impl : ( ',' ) ;
    public final void rule__Diagram__Group_20_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3904:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:3905:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:3905:1: ( ',' )
            // InternalSiriusTextDsl.g:3906:1: ','
            {
             before(grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3_1__0__Impl"


    // $ANTLR start "rule__Diagram__Group_20_3_1__1"
    // InternalSiriusTextDsl.g:3919:1: rule__Diagram__Group_20_3_1__1 : rule__Diagram__Group_20_3_1__1__Impl ;
    public final void rule__Diagram__Group_20_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3923:1: ( rule__Diagram__Group_20_3_1__1__Impl )
            // InternalSiriusTextDsl.g:3924:2: rule__Diagram__Group_20_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group_20_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3_1__1"


    // $ANTLR start "rule__Diagram__Group_20_3_1__1__Impl"
    // InternalSiriusTextDsl.g:3930:1: rule__Diagram__Group_20_3_1__1__Impl : ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) ) ;
    public final void rule__Diagram__Group_20_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3934:1: ( ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) ) )
            // InternalSiriusTextDsl.g:3935:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) )
            {
            // InternalSiriusTextDsl.g:3935:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) )
            // InternalSiriusTextDsl.g:3936:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_1_1()); 
            // InternalSiriusTextDsl.g:3937:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 )
            // InternalSiriusTextDsl.g:3937:2: rule__Diagram__AdditionalLayersAssignment_20_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__AdditionalLayersAssignment_20_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group_20_3_1__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalSiriusTextDsl.g:3951:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3955:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalSiriusTextDsl.g:3956:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalSiriusTextDsl.g:3963:1: rule__Layer__Group__0__Impl : ( ( rule__Layer__DocumentationAssignment_0 )? ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3967:1: ( ( ( rule__Layer__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:3968:1: ( ( rule__Layer__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:3968:1: ( ( rule__Layer__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:3969:1: ( rule__Layer__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getLayerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:3970:1: ( rule__Layer__DocumentationAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DOCUMENTATION) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSiriusTextDsl.g:3970:2: rule__Layer__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalSiriusTextDsl.g:3980:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3984:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalSiriusTextDsl.g:3985:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalSiriusTextDsl.g:3992:1: rule__Layer__Group__1__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3996:1: ( ( 'layer' ) )
            // InternalSiriusTextDsl.g:3997:1: ( 'layer' )
            {
            // InternalSiriusTextDsl.g:3997:1: ( 'layer' )
            // InternalSiriusTextDsl.g:3998:1: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalSiriusTextDsl.g:4011:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4015:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalSiriusTextDsl.g:4016:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalSiriusTextDsl.g:4023:1: rule__Layer__Group__2__Impl : ( ( rule__Layer__NameAssignment_2 ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4027:1: ( ( ( rule__Layer__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:4028:1: ( ( rule__Layer__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:4028:1: ( ( rule__Layer__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:4029:1: ( rule__Layer__NameAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:4030:1: ( rule__Layer__NameAssignment_2 )
            // InternalSiriusTextDsl.g:4030:2: rule__Layer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalSiriusTextDsl.g:4040:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4044:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalSiriusTextDsl.g:4045:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalSiriusTextDsl.g:4052:1: rule__Layer__Group__3__Impl : ( '{' ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4056:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:4057:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:4057:1: ( '{' )
            // InternalSiriusTextDsl.g:4058:1: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalSiriusTextDsl.g:4071:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4075:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // InternalSiriusTextDsl.g:4076:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Layer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalSiriusTextDsl.g:4083:1: rule__Layer__Group__4__Impl : ( ( rule__Layer__Group_4__0 )? ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4087:1: ( ( ( rule__Layer__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:4088:1: ( ( rule__Layer__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:4088:1: ( ( rule__Layer__Group_4__0 )? )
            // InternalSiriusTextDsl.g:4089:1: ( rule__Layer__Group_4__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:4090:1: ( rule__Layer__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:4090:2: rule__Layer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__5"
    // InternalSiriusTextDsl.g:4100:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl rule__Layer__Group__6 ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4104:1: ( rule__Layer__Group__5__Impl rule__Layer__Group__6 )
            // InternalSiriusTextDsl.g:4105:2: rule__Layer__Group__5__Impl rule__Layer__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__5"


    // $ANTLR start "rule__Layer__Group__5__Impl"
    // InternalSiriusTextDsl.g:4112:1: rule__Layer__Group__5__Impl : ( 'mappings' ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4116:1: ( ( 'mappings' ) )
            // InternalSiriusTextDsl.g:4117:1: ( 'mappings' )
            {
            // InternalSiriusTextDsl.g:4117:1: ( 'mappings' )
            // InternalSiriusTextDsl.g:4118:1: 'mappings'
            {
             before(grammarAccess.getLayerAccess().getMappingsKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getMappingsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__5__Impl"


    // $ANTLR start "rule__Layer__Group__6"
    // InternalSiriusTextDsl.g:4131:1: rule__Layer__Group__6 : rule__Layer__Group__6__Impl rule__Layer__Group__7 ;
    public final void rule__Layer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4135:1: ( rule__Layer__Group__6__Impl rule__Layer__Group__7 )
            // InternalSiriusTextDsl.g:4136:2: rule__Layer__Group__6__Impl rule__Layer__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__6"


    // $ANTLR start "rule__Layer__Group__6__Impl"
    // InternalSiriusTextDsl.g:4143:1: rule__Layer__Group__6__Impl : ( '=' ) ;
    public final void rule__Layer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4147:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4148:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4148:1: ( '=' )
            // InternalSiriusTextDsl.g:4149:1: '='
            {
             before(grammarAccess.getLayerAccess().getEqualsSignKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__6__Impl"


    // $ANTLR start "rule__Layer__Group__7"
    // InternalSiriusTextDsl.g:4162:1: rule__Layer__Group__7 : rule__Layer__Group__7__Impl rule__Layer__Group__8 ;
    public final void rule__Layer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4166:1: ( rule__Layer__Group__7__Impl rule__Layer__Group__8 )
            // InternalSiriusTextDsl.g:4167:2: rule__Layer__Group__7__Impl rule__Layer__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Layer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__7"


    // $ANTLR start "rule__Layer__Group__7__Impl"
    // InternalSiriusTextDsl.g:4174:1: rule__Layer__Group__7__Impl : ( '[' ) ;
    public final void rule__Layer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4178:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4179:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4179:1: ( '[' )
            // InternalSiriusTextDsl.g:4180:1: '['
            {
             before(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__7__Impl"


    // $ANTLR start "rule__Layer__Group__8"
    // InternalSiriusTextDsl.g:4193:1: rule__Layer__Group__8 : rule__Layer__Group__8__Impl rule__Layer__Group__9 ;
    public final void rule__Layer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4197:1: ( rule__Layer__Group__8__Impl rule__Layer__Group__9 )
            // InternalSiriusTextDsl.g:4198:2: rule__Layer__Group__8__Impl rule__Layer__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Layer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__8"


    // $ANTLR start "rule__Layer__Group__8__Impl"
    // InternalSiriusTextDsl.g:4205:1: rule__Layer__Group__8__Impl : ( ( rule__Layer__Group_8__0 )? ) ;
    public final void rule__Layer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4209:1: ( ( ( rule__Layer__Group_8__0 )? ) )
            // InternalSiriusTextDsl.g:4210:1: ( ( rule__Layer__Group_8__0 )? )
            {
            // InternalSiriusTextDsl.g:4210:1: ( ( rule__Layer__Group_8__0 )? )
            // InternalSiriusTextDsl.g:4211:1: ( rule__Layer__Group_8__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_8()); 
            // InternalSiriusTextDsl.g:4212:1: ( rule__Layer__Group_8__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:4212:2: rule__Layer__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layer__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__8__Impl"


    // $ANTLR start "rule__Layer__Group__9"
    // InternalSiriusTextDsl.g:4222:1: rule__Layer__Group__9 : rule__Layer__Group__9__Impl rule__Layer__Group__10 ;
    public final void rule__Layer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4226:1: ( rule__Layer__Group__9__Impl rule__Layer__Group__10 )
            // InternalSiriusTextDsl.g:4227:2: rule__Layer__Group__9__Impl rule__Layer__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__Layer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__9"


    // $ANTLR start "rule__Layer__Group__9__Impl"
    // InternalSiriusTextDsl.g:4234:1: rule__Layer__Group__9__Impl : ( ']' ) ;
    public final void rule__Layer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4238:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4239:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4239:1: ( ']' )
            // InternalSiriusTextDsl.g:4240:1: ']'
            {
             before(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__9__Impl"


    // $ANTLR start "rule__Layer__Group__10"
    // InternalSiriusTextDsl.g:4253:1: rule__Layer__Group__10 : rule__Layer__Group__10__Impl rule__Layer__Group__11 ;
    public final void rule__Layer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4257:1: ( rule__Layer__Group__10__Impl rule__Layer__Group__11 )
            // InternalSiriusTextDsl.g:4258:2: rule__Layer__Group__10__Impl rule__Layer__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__10"


    // $ANTLR start "rule__Layer__Group__10__Impl"
    // InternalSiriusTextDsl.g:4265:1: rule__Layer__Group__10__Impl : ( 'edges' ) ;
    public final void rule__Layer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4269:1: ( ( 'edges' ) )
            // InternalSiriusTextDsl.g:4270:1: ( 'edges' )
            {
            // InternalSiriusTextDsl.g:4270:1: ( 'edges' )
            // InternalSiriusTextDsl.g:4271:1: 'edges'
            {
             before(grammarAccess.getLayerAccess().getEdgesKeyword_10()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEdgesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__10__Impl"


    // $ANTLR start "rule__Layer__Group__11"
    // InternalSiriusTextDsl.g:4284:1: rule__Layer__Group__11 : rule__Layer__Group__11__Impl rule__Layer__Group__12 ;
    public final void rule__Layer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4288:1: ( rule__Layer__Group__11__Impl rule__Layer__Group__12 )
            // InternalSiriusTextDsl.g:4289:2: rule__Layer__Group__11__Impl rule__Layer__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__11"


    // $ANTLR start "rule__Layer__Group__11__Impl"
    // InternalSiriusTextDsl.g:4296:1: rule__Layer__Group__11__Impl : ( '=' ) ;
    public final void rule__Layer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4300:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4301:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4301:1: ( '=' )
            // InternalSiriusTextDsl.g:4302:1: '='
            {
             before(grammarAccess.getLayerAccess().getEqualsSignKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__11__Impl"


    // $ANTLR start "rule__Layer__Group__12"
    // InternalSiriusTextDsl.g:4315:1: rule__Layer__Group__12 : rule__Layer__Group__12__Impl rule__Layer__Group__13 ;
    public final void rule__Layer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4319:1: ( rule__Layer__Group__12__Impl rule__Layer__Group__13 )
            // InternalSiriusTextDsl.g:4320:2: rule__Layer__Group__12__Impl rule__Layer__Group__13
            {
            pushFollow(FOLLOW_36);
            rule__Layer__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__12"


    // $ANTLR start "rule__Layer__Group__12__Impl"
    // InternalSiriusTextDsl.g:4327:1: rule__Layer__Group__12__Impl : ( '[' ) ;
    public final void rule__Layer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4331:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4332:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4332:1: ( '[' )
            // InternalSiriusTextDsl.g:4333:1: '['
            {
             before(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__12__Impl"


    // $ANTLR start "rule__Layer__Group__13"
    // InternalSiriusTextDsl.g:4346:1: rule__Layer__Group__13 : rule__Layer__Group__13__Impl rule__Layer__Group__14 ;
    public final void rule__Layer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4350:1: ( rule__Layer__Group__13__Impl rule__Layer__Group__14 )
            // InternalSiriusTextDsl.g:4351:2: rule__Layer__Group__13__Impl rule__Layer__Group__14
            {
            pushFollow(FOLLOW_37);
            rule__Layer__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__13"


    // $ANTLR start "rule__Layer__Group__13__Impl"
    // InternalSiriusTextDsl.g:4358:1: rule__Layer__Group__13__Impl : ( ']' ) ;
    public final void rule__Layer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4362:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4363:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4363:1: ( ']' )
            // InternalSiriusTextDsl.g:4364:1: ']'
            {
             before(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__13__Impl"


    // $ANTLR start "rule__Layer__Group__14"
    // InternalSiriusTextDsl.g:4377:1: rule__Layer__Group__14 : rule__Layer__Group__14__Impl ;
    public final void rule__Layer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4381:1: ( rule__Layer__Group__14__Impl )
            // InternalSiriusTextDsl.g:4382:2: rule__Layer__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__14"


    // $ANTLR start "rule__Layer__Group__14__Impl"
    // InternalSiriusTextDsl.g:4388:1: rule__Layer__Group__14__Impl : ( '}' ) ;
    public final void rule__Layer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4392:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:4393:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:4393:1: ( '}' )
            // InternalSiriusTextDsl.g:4394:1: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__14__Impl"


    // $ANTLR start "rule__Layer__Group_4__0"
    // InternalSiriusTextDsl.g:4437:1: rule__Layer__Group_4__0 : rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1 ;
    public final void rule__Layer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4441:1: ( rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1 )
            // InternalSiriusTextDsl.g:4442:2: rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Layer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_4__0"


    // $ANTLR start "rule__Layer__Group_4__0__Impl"
    // InternalSiriusTextDsl.g:4449:1: rule__Layer__Group_4__0__Impl : ( 'icon' ) ;
    public final void rule__Layer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4453:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:4454:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:4454:1: ( 'icon' )
            // InternalSiriusTextDsl.g:4455:1: 'icon'
            {
             before(grammarAccess.getLayerAccess().getIconKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getIconKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_4__0__Impl"


    // $ANTLR start "rule__Layer__Group_4__1"
    // InternalSiriusTextDsl.g:4468:1: rule__Layer__Group_4__1 : rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2 ;
    public final void rule__Layer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4472:1: ( rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2 )
            // InternalSiriusTextDsl.g:4473:2: rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Layer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_4__1"


    // $ANTLR start "rule__Layer__Group_4__1__Impl"
    // InternalSiriusTextDsl.g:4480:1: rule__Layer__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Layer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4484:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4485:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4485:1: ( '=' )
            // InternalSiriusTextDsl.g:4486:1: '='
            {
             before(grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_4__1__Impl"


    // $ANTLR start "rule__Layer__Group_4__2"
    // InternalSiriusTextDsl.g:4499:1: rule__Layer__Group_4__2 : rule__Layer__Group_4__2__Impl ;
    public final void rule__Layer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4503:1: ( rule__Layer__Group_4__2__Impl )
            // InternalSiriusTextDsl.g:4504:2: rule__Layer__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_4__2"


    // $ANTLR start "rule__Layer__Group_4__2__Impl"
    // InternalSiriusTextDsl.g:4510:1: rule__Layer__Group_4__2__Impl : ( ( rule__Layer__IconAssignment_4_2 ) ) ;
    public final void rule__Layer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4514:1: ( ( ( rule__Layer__IconAssignment_4_2 ) ) )
            // InternalSiriusTextDsl.g:4515:1: ( ( rule__Layer__IconAssignment_4_2 ) )
            {
            // InternalSiriusTextDsl.g:4515:1: ( ( rule__Layer__IconAssignment_4_2 ) )
            // InternalSiriusTextDsl.g:4516:1: ( rule__Layer__IconAssignment_4_2 )
            {
             before(grammarAccess.getLayerAccess().getIconAssignment_4_2()); 
            // InternalSiriusTextDsl.g:4517:1: ( rule__Layer__IconAssignment_4_2 )
            // InternalSiriusTextDsl.g:4517:2: rule__Layer__IconAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__IconAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getIconAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_4__2__Impl"


    // $ANTLR start "rule__Layer__Group_8__0"
    // InternalSiriusTextDsl.g:4533:1: rule__Layer__Group_8__0 : rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1 ;
    public final void rule__Layer__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4537:1: ( rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1 )
            // InternalSiriusTextDsl.g:4538:2: rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1
            {
            pushFollow(FOLLOW_22);
            rule__Layer__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8__0"


    // $ANTLR start "rule__Layer__Group_8__0__Impl"
    // InternalSiriusTextDsl.g:4545:1: rule__Layer__Group_8__0__Impl : ( ( rule__Layer__MappingsAssignment_8_0 ) ) ;
    public final void rule__Layer__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4549:1: ( ( ( rule__Layer__MappingsAssignment_8_0 ) ) )
            // InternalSiriusTextDsl.g:4550:1: ( ( rule__Layer__MappingsAssignment_8_0 ) )
            {
            // InternalSiriusTextDsl.g:4550:1: ( ( rule__Layer__MappingsAssignment_8_0 ) )
            // InternalSiriusTextDsl.g:4551:1: ( rule__Layer__MappingsAssignment_8_0 )
            {
             before(grammarAccess.getLayerAccess().getMappingsAssignment_8_0()); 
            // InternalSiriusTextDsl.g:4552:1: ( rule__Layer__MappingsAssignment_8_0 )
            // InternalSiriusTextDsl.g:4552:2: rule__Layer__MappingsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__MappingsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getMappingsAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8__0__Impl"


    // $ANTLR start "rule__Layer__Group_8__1"
    // InternalSiriusTextDsl.g:4562:1: rule__Layer__Group_8__1 : rule__Layer__Group_8__1__Impl ;
    public final void rule__Layer__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4566:1: ( rule__Layer__Group_8__1__Impl )
            // InternalSiriusTextDsl.g:4567:2: rule__Layer__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8__1"


    // $ANTLR start "rule__Layer__Group_8__1__Impl"
    // InternalSiriusTextDsl.g:4573:1: rule__Layer__Group_8__1__Impl : ( ( rule__Layer__Group_8_1__0 )* ) ;
    public final void rule__Layer__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4577:1: ( ( ( rule__Layer__Group_8_1__0 )* ) )
            // InternalSiriusTextDsl.g:4578:1: ( ( rule__Layer__Group_8_1__0 )* )
            {
            // InternalSiriusTextDsl.g:4578:1: ( ( rule__Layer__Group_8_1__0 )* )
            // InternalSiriusTextDsl.g:4579:1: ( rule__Layer__Group_8_1__0 )*
            {
             before(grammarAccess.getLayerAccess().getGroup_8_1()); 
            // InternalSiriusTextDsl.g:4580:1: ( rule__Layer__Group_8_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:4580:2: rule__Layer__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Layer__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8__1__Impl"


    // $ANTLR start "rule__Layer__Group_8_1__0"
    // InternalSiriusTextDsl.g:4594:1: rule__Layer__Group_8_1__0 : rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1 ;
    public final void rule__Layer__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4598:1: ( rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1 )
            // InternalSiriusTextDsl.g:4599:2: rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8_1__0"


    // $ANTLR start "rule__Layer__Group_8_1__0__Impl"
    // InternalSiriusTextDsl.g:4606:1: rule__Layer__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__Layer__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4610:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:4611:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:4611:1: ( ',' )
            // InternalSiriusTextDsl.g:4612:1: ','
            {
             before(grammarAccess.getLayerAccess().getCommaKeyword_8_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getCommaKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8_1__0__Impl"


    // $ANTLR start "rule__Layer__Group_8_1__1"
    // InternalSiriusTextDsl.g:4625:1: rule__Layer__Group_8_1__1 : rule__Layer__Group_8_1__1__Impl ;
    public final void rule__Layer__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4629:1: ( rule__Layer__Group_8_1__1__Impl )
            // InternalSiriusTextDsl.g:4630:2: rule__Layer__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8_1__1"


    // $ANTLR start "rule__Layer__Group_8_1__1__Impl"
    // InternalSiriusTextDsl.g:4636:1: rule__Layer__Group_8_1__1__Impl : ( ( rule__Layer__MappingsAssignment_8_1_1 ) ) ;
    public final void rule__Layer__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4640:1: ( ( ( rule__Layer__MappingsAssignment_8_1_1 ) ) )
            // InternalSiriusTextDsl.g:4641:1: ( ( rule__Layer__MappingsAssignment_8_1_1 ) )
            {
            // InternalSiriusTextDsl.g:4641:1: ( ( rule__Layer__MappingsAssignment_8_1_1 ) )
            // InternalSiriusTextDsl.g:4642:1: ( rule__Layer__MappingsAssignment_8_1_1 )
            {
             before(grammarAccess.getLayerAccess().getMappingsAssignment_8_1_1()); 
            // InternalSiriusTextDsl.g:4643:1: ( rule__Layer__MappingsAssignment_8_1_1 )
            // InternalSiriusTextDsl.g:4643:2: rule__Layer__MappingsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__MappingsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getMappingsAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_8_1__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalSiriusTextDsl.g:4657:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4661:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalSiriusTextDsl.g:4662:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalSiriusTextDsl.g:4669:1: rule__Container__Group__0__Impl : ( ( rule__Container__DocumentationAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4673:1: ( ( ( rule__Container__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:4674:1: ( ( rule__Container__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:4674:1: ( ( rule__Container__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:4675:1: ( rule__Container__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:4676:1: ( rule__Container__DocumentationAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DOCUMENTATION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSiriusTextDsl.g:4676:2: rule__Container__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalSiriusTextDsl.g:4686:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4690:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalSiriusTextDsl.g:4691:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalSiriusTextDsl.g:4698:1: rule__Container__Group__1__Impl : ( ( rule__Container__ListAssignment_1 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4702:1: ( ( ( rule__Container__ListAssignment_1 )? ) )
            // InternalSiriusTextDsl.g:4703:1: ( ( rule__Container__ListAssignment_1 )? )
            {
            // InternalSiriusTextDsl.g:4703:1: ( ( rule__Container__ListAssignment_1 )? )
            // InternalSiriusTextDsl.g:4704:1: ( rule__Container__ListAssignment_1 )?
            {
             before(grammarAccess.getContainerAccess().getListAssignment_1()); 
            // InternalSiriusTextDsl.g:4705:1: ( rule__Container__ListAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSiriusTextDsl.g:4705:2: rule__Container__ListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__ListAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalSiriusTextDsl.g:4715:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4719:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalSiriusTextDsl.g:4720:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalSiriusTextDsl.g:4727:1: rule__Container__Group__2__Impl : ( 'container' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4731:1: ( ( 'container' ) )
            // InternalSiriusTextDsl.g:4732:1: ( 'container' )
            {
            // InternalSiriusTextDsl.g:4732:1: ( 'container' )
            // InternalSiriusTextDsl.g:4733:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalSiriusTextDsl.g:4746:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4750:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalSiriusTextDsl.g:4751:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalSiriusTextDsl.g:4758:1: rule__Container__Group__3__Impl : ( ( rule__Container__NameAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4762:1: ( ( ( rule__Container__NameAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:4763:1: ( ( rule__Container__NameAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:4763:1: ( ( rule__Container__NameAssignment_3 ) )
            // InternalSiriusTextDsl.g:4764:1: ( rule__Container__NameAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_3()); 
            // InternalSiriusTextDsl.g:4765:1: ( rule__Container__NameAssignment_3 )
            // InternalSiriusTextDsl.g:4765:2: rule__Container__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalSiriusTextDsl.g:4775:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4779:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalSiriusTextDsl.g:4780:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalSiriusTextDsl.g:4787:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )? ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4791:1: ( ( ( rule__Container__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:4792:1: ( ( rule__Container__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:4792:1: ( ( rule__Container__Group_4__0 )? )
            // InternalSiriusTextDsl.g:4793:1: ( rule__Container__Group_4__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:4794:1: ( rule__Container__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSiriusTextDsl.g:4794:2: rule__Container__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalSiriusTextDsl.g:4804:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4808:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalSiriusTextDsl.g:4809:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalSiriusTextDsl.g:4816:1: rule__Container__Group__5__Impl : ( 'for' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4820:1: ( ( 'for' ) )
            // InternalSiriusTextDsl.g:4821:1: ( 'for' )
            {
            // InternalSiriusTextDsl.g:4821:1: ( 'for' )
            // InternalSiriusTextDsl.g:4822:1: 'for'
            {
             before(grammarAccess.getContainerAccess().getForKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalSiriusTextDsl.g:4835:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4839:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalSiriusTextDsl.g:4840:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalSiriusTextDsl.g:4847:1: rule__Container__Group__6__Impl : ( ( rule__Container__DomainClassAssignment_6 ) ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4851:1: ( ( ( rule__Container__DomainClassAssignment_6 ) ) )
            // InternalSiriusTextDsl.g:4852:1: ( ( rule__Container__DomainClassAssignment_6 ) )
            {
            // InternalSiriusTextDsl.g:4852:1: ( ( rule__Container__DomainClassAssignment_6 ) )
            // InternalSiriusTextDsl.g:4853:1: ( rule__Container__DomainClassAssignment_6 )
            {
             before(grammarAccess.getContainerAccess().getDomainClassAssignment_6()); 
            // InternalSiriusTextDsl.g:4854:1: ( rule__Container__DomainClassAssignment_6 )
            // InternalSiriusTextDsl.g:4854:2: rule__Container__DomainClassAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Container__DomainClassAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getDomainClassAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // InternalSiriusTextDsl.g:4864:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4868:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalSiriusTextDsl.g:4869:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // InternalSiriusTextDsl.g:4876:1: rule__Container__Group__7__Impl : ( 'style' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4880:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:4881:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:4881:1: ( 'style' )
            // InternalSiriusTextDsl.g:4882:1: 'style'
            {
             before(grammarAccess.getContainerAccess().getStyleKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getStyleKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // InternalSiriusTextDsl.g:4895:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4899:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // InternalSiriusTextDsl.g:4900:2: rule__Container__Group__8__Impl rule__Container__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Container__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // InternalSiriusTextDsl.g:4907:1: rule__Container__Group__8__Impl : ( ( rule__Container__StyleAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4911:1: ( ( ( rule__Container__StyleAssignment_8 ) ) )
            // InternalSiriusTextDsl.g:4912:1: ( ( rule__Container__StyleAssignment_8 ) )
            {
            // InternalSiriusTextDsl.g:4912:1: ( ( rule__Container__StyleAssignment_8 ) )
            // InternalSiriusTextDsl.g:4913:1: ( rule__Container__StyleAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getStyleAssignment_8()); 
            // InternalSiriusTextDsl.g:4914:1: ( rule__Container__StyleAssignment_8 )
            // InternalSiriusTextDsl.g:4914:2: rule__Container__StyleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Container__StyleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getStyleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group__9"
    // InternalSiriusTextDsl.g:4924:1: rule__Container__Group__9 : rule__Container__Group__9__Impl rule__Container__Group__10 ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4928:1: ( rule__Container__Group__9__Impl rule__Container__Group__10 )
            // InternalSiriusTextDsl.g:4929:2: rule__Container__Group__9__Impl rule__Container__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Container__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__9"


    // $ANTLR start "rule__Container__Group__9__Impl"
    // InternalSiriusTextDsl.g:4936:1: rule__Container__Group__9__Impl : ( ( rule__Container__Group_9__0 )? ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4940:1: ( ( ( rule__Container__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:4941:1: ( ( rule__Container__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:4941:1: ( ( rule__Container__Group_9__0 )? )
            // InternalSiriusTextDsl.g:4942:1: ( rule__Container__Group_9__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:4943:1: ( rule__Container__Group_9__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSiriusTextDsl.g:4943:2: rule__Container__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__9__Impl"


    // $ANTLR start "rule__Container__Group__10"
    // InternalSiriusTextDsl.g:4953:1: rule__Container__Group__10 : rule__Container__Group__10__Impl rule__Container__Group__11 ;
    public final void rule__Container__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4957:1: ( rule__Container__Group__10__Impl rule__Container__Group__11 )
            // InternalSiriusTextDsl.g:4958:2: rule__Container__Group__10__Impl rule__Container__Group__11
            {
            pushFollow(FOLLOW_40);
            rule__Container__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__10"


    // $ANTLR start "rule__Container__Group__10__Impl"
    // InternalSiriusTextDsl.g:4965:1: rule__Container__Group__10__Impl : ( '{' ) ;
    public final void rule__Container__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4969:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:4970:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:4970:1: ( '{' )
            // InternalSiriusTextDsl.g:4971:1: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__10__Impl"


    // $ANTLR start "rule__Container__Group__11"
    // InternalSiriusTextDsl.g:4984:1: rule__Container__Group__11 : rule__Container__Group__11__Impl rule__Container__Group__12 ;
    public final void rule__Container__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4988:1: ( rule__Container__Group__11__Impl rule__Container__Group__12 )
            // InternalSiriusTextDsl.g:4989:2: rule__Container__Group__11__Impl rule__Container__Group__12
            {
            pushFollow(FOLLOW_40);
            rule__Container__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__11"


    // $ANTLR start "rule__Container__Group__11__Impl"
    // InternalSiriusTextDsl.g:4996:1: rule__Container__Group__11__Impl : ( ( rule__Container__Group_11__0 )? ) ;
    public final void rule__Container__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5000:1: ( ( ( rule__Container__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:5001:1: ( ( rule__Container__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:5001:1: ( ( rule__Container__Group_11__0 )? )
            // InternalSiriusTextDsl.g:5002:1: ( rule__Container__Group_11__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:5003:1: ( rule__Container__Group_11__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:5003:2: rule__Container__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__11__Impl"


    // $ANTLR start "rule__Container__Group__12"
    // InternalSiriusTextDsl.g:5013:1: rule__Container__Group__12 : rule__Container__Group__12__Impl rule__Container__Group__13 ;
    public final void rule__Container__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5017:1: ( rule__Container__Group__12__Impl rule__Container__Group__13 )
            // InternalSiriusTextDsl.g:5018:2: rule__Container__Group__12__Impl rule__Container__Group__13
            {
            pushFollow(FOLLOW_40);
            rule__Container__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__12"


    // $ANTLR start "rule__Container__Group__12__Impl"
    // InternalSiriusTextDsl.g:5025:1: rule__Container__Group__12__Impl : ( ( rule__Container__ConditionalStylesAssignment_12 )* ) ;
    public final void rule__Container__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5029:1: ( ( ( rule__Container__ConditionalStylesAssignment_12 )* ) )
            // InternalSiriusTextDsl.g:5030:1: ( ( rule__Container__ConditionalStylesAssignment_12 )* )
            {
            // InternalSiriusTextDsl.g:5030:1: ( ( rule__Container__ConditionalStylesAssignment_12 )* )
            // InternalSiriusTextDsl.g:5031:1: ( rule__Container__ConditionalStylesAssignment_12 )*
            {
             before(grammarAccess.getContainerAccess().getConditionalStylesAssignment_12()); 
            // InternalSiriusTextDsl.g:5032:1: ( rule__Container__ConditionalStylesAssignment_12 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==47) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5032:2: rule__Container__ConditionalStylesAssignment_12
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Container__ConditionalStylesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getConditionalStylesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__12__Impl"


    // $ANTLR start "rule__Container__Group__13"
    // InternalSiriusTextDsl.g:5042:1: rule__Container__Group__13 : rule__Container__Group__13__Impl ;
    public final void rule__Container__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5046:1: ( rule__Container__Group__13__Impl )
            // InternalSiriusTextDsl.g:5047:2: rule__Container__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__13"


    // $ANTLR start "rule__Container__Group__13__Impl"
    // InternalSiriusTextDsl.g:5053:1: rule__Container__Group__13__Impl : ( '}' ) ;
    public final void rule__Container__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5057:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:5058:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:5058:1: ( '}' )
            // InternalSiriusTextDsl.g:5059:1: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__13__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // InternalSiriusTextDsl.g:5100:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5104:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // InternalSiriusTextDsl.g:5105:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // InternalSiriusTextDsl.g:5112:1: rule__Container__Group_4__0__Impl : ( 'as' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5116:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:5117:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:5117:1: ( 'as' )
            // InternalSiriusTextDsl.g:5118:1: 'as'
            {
             before(grammarAccess.getContainerAccess().getAsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getAsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // InternalSiriusTextDsl.g:5131:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5135:1: ( rule__Container__Group_4__1__Impl )
            // InternalSiriusTextDsl.g:5136:2: rule__Container__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // InternalSiriusTextDsl.g:5142:1: rule__Container__Group_4__1__Impl : ( ( rule__Container__LabelAssignment_4_1 ) ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5146:1: ( ( ( rule__Container__LabelAssignment_4_1 ) ) )
            // InternalSiriusTextDsl.g:5147:1: ( ( rule__Container__LabelAssignment_4_1 ) )
            {
            // InternalSiriusTextDsl.g:5147:1: ( ( rule__Container__LabelAssignment_4_1 ) )
            // InternalSiriusTextDsl.g:5148:1: ( rule__Container__LabelAssignment_4_1 )
            {
             before(grammarAccess.getContainerAccess().getLabelAssignment_4_1()); 
            // InternalSiriusTextDsl.g:5149:1: ( rule__Container__LabelAssignment_4_1 )
            // InternalSiriusTextDsl.g:5149:2: rule__Container__LabelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__LabelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getLabelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__Container__Group_9__0"
    // InternalSiriusTextDsl.g:5163:1: rule__Container__Group_9__0 : rule__Container__Group_9__0__Impl rule__Container__Group_9__1 ;
    public final void rule__Container__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5167:1: ( rule__Container__Group_9__0__Impl rule__Container__Group_9__1 )
            // InternalSiriusTextDsl.g:5168:2: rule__Container__Group_9__0__Impl rule__Container__Group_9__1
            {
            pushFollow(FOLLOW_31);
            rule__Container__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_9__0"


    // $ANTLR start "rule__Container__Group_9__0__Impl"
    // InternalSiriusTextDsl.g:5175:1: rule__Container__Group_9__0__Impl : ( '?' ) ;
    public final void rule__Container__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5179:1: ( ( '?' ) )
            // InternalSiriusTextDsl.g:5180:1: ( '?' )
            {
            // InternalSiriusTextDsl.g:5180:1: ( '?' )
            // InternalSiriusTextDsl.g:5181:1: '?'
            {
             before(grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_9__0__Impl"


    // $ANTLR start "rule__Container__Group_9__1"
    // InternalSiriusTextDsl.g:5194:1: rule__Container__Group_9__1 : rule__Container__Group_9__1__Impl ;
    public final void rule__Container__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5198:1: ( rule__Container__Group_9__1__Impl )
            // InternalSiriusTextDsl.g:5199:2: rule__Container__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_9__1"


    // $ANTLR start "rule__Container__Group_9__1__Impl"
    // InternalSiriusTextDsl.g:5205:1: rule__Container__Group_9__1__Impl : ( ( rule__Container__PreconditionAssignment_9_1 ) ) ;
    public final void rule__Container__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5209:1: ( ( ( rule__Container__PreconditionAssignment_9_1 ) ) )
            // InternalSiriusTextDsl.g:5210:1: ( ( rule__Container__PreconditionAssignment_9_1 ) )
            {
            // InternalSiriusTextDsl.g:5210:1: ( ( rule__Container__PreconditionAssignment_9_1 ) )
            // InternalSiriusTextDsl.g:5211:1: ( rule__Container__PreconditionAssignment_9_1 )
            {
             before(grammarAccess.getContainerAccess().getPreconditionAssignment_9_1()); 
            // InternalSiriusTextDsl.g:5212:1: ( rule__Container__PreconditionAssignment_9_1 )
            // InternalSiriusTextDsl.g:5212:2: rule__Container__PreconditionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__PreconditionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getPreconditionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_9__1__Impl"


    // $ANTLR start "rule__Container__Group_11__0"
    // InternalSiriusTextDsl.g:5226:1: rule__Container__Group_11__0 : rule__Container__Group_11__0__Impl rule__Container__Group_11__1 ;
    public final void rule__Container__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5230:1: ( rule__Container__Group_11__0__Impl rule__Container__Group_11__1 )
            // InternalSiriusTextDsl.g:5231:2: rule__Container__Group_11__0__Impl rule__Container__Group_11__1
            {
            pushFollow(FOLLOW_17);
            rule__Container__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_11__0"


    // $ANTLR start "rule__Container__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:5238:1: rule__Container__Group_11__0__Impl : ( 'semanticCandidatesExpression' ) ;
    public final void rule__Container__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5242:1: ( ( 'semanticCandidatesExpression' ) )
            // InternalSiriusTextDsl.g:5243:1: ( 'semanticCandidatesExpression' )
            {
            // InternalSiriusTextDsl.g:5243:1: ( 'semanticCandidatesExpression' )
            // InternalSiriusTextDsl.g:5244:1: 'semanticCandidatesExpression'
            {
             before(grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_11__0__Impl"


    // $ANTLR start "rule__Container__Group_11__1"
    // InternalSiriusTextDsl.g:5257:1: rule__Container__Group_11__1 : rule__Container__Group_11__1__Impl rule__Container__Group_11__2 ;
    public final void rule__Container__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5261:1: ( rule__Container__Group_11__1__Impl rule__Container__Group_11__2 )
            // InternalSiriusTextDsl.g:5262:2: rule__Container__Group_11__1__Impl rule__Container__Group_11__2
            {
            pushFollow(FOLLOW_31);
            rule__Container__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_11__1"


    // $ANTLR start "rule__Container__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:5269:1: rule__Container__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5273:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:5274:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:5274:1: ( '=' )
            // InternalSiriusTextDsl.g:5275:1: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_11__1__Impl"


    // $ANTLR start "rule__Container__Group_11__2"
    // InternalSiriusTextDsl.g:5288:1: rule__Container__Group_11__2 : rule__Container__Group_11__2__Impl ;
    public final void rule__Container__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5292:1: ( rule__Container__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:5293:2: rule__Container__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_11__2"


    // $ANTLR start "rule__Container__Group_11__2__Impl"
    // InternalSiriusTextDsl.g:5299:1: rule__Container__Group_11__2__Impl : ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) ) ;
    public final void rule__Container__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5303:1: ( ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:5304:1: ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:5304:1: ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:5305:1: ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 )
            {
             before(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionAssignment_11_2()); 
            // InternalSiriusTextDsl.g:5306:1: ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 )
            // InternalSiriusTextDsl.g:5306:2: rule__Container__SemanticCanditatesExpressionAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__SemanticCanditatesExpressionAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_11__2__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__0"
    // InternalSiriusTextDsl.g:5322:1: rule__ConditionalContainerStyleDeclaration__Group__0 : rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5326:1: ( rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1 )
            // InternalSiriusTextDsl.g:5327:2: rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionalContainerStyleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__0"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__0__Impl"
    // InternalSiriusTextDsl.g:5334:1: rule__ConditionalContainerStyleDeclaration__Group__0__Impl : ( 'style' ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5338:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:5339:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:5339:1: ( 'style' )
            // InternalSiriusTextDsl.g:5340:1: 'style'
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__1"
    // InternalSiriusTextDsl.g:5353:1: rule__ConditionalContainerStyleDeclaration__Group__1 : rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5357:1: ( rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2 )
            // InternalSiriusTextDsl.g:5358:2: rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ConditionalContainerStyleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__1"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__1__Impl"
    // InternalSiriusTextDsl.g:5365:1: rule__ConditionalContainerStyleDeclaration__Group__1__Impl : ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5369:1: ( ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:5370:1: ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:5370:1: ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) )
            // InternalSiriusTextDsl.g:5371:1: ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleAssignment_1()); 
            // InternalSiriusTextDsl.g:5372:1: ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 )
            // InternalSiriusTextDsl.g:5372:2: rule__ConditionalContainerStyleDeclaration__StyleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__StyleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__2"
    // InternalSiriusTextDsl.g:5382:1: rule__ConditionalContainerStyleDeclaration__Group__2 : rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5386:1: ( rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3 )
            // InternalSiriusTextDsl.g:5387:2: rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ConditionalContainerStyleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__2"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__2__Impl"
    // InternalSiriusTextDsl.g:5394:1: rule__ConditionalContainerStyleDeclaration__Group__2__Impl : ( 'if' ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5398:1: ( ( 'if' ) )
            // InternalSiriusTextDsl.g:5399:1: ( 'if' )
            {
            // InternalSiriusTextDsl.g:5399:1: ( 'if' )
            // InternalSiriusTextDsl.g:5400:1: 'if'
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__3"
    // InternalSiriusTextDsl.g:5413:1: rule__ConditionalContainerStyleDeclaration__Group__3 : rule__ConditionalContainerStyleDeclaration__Group__3__Impl ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5417:1: ( rule__ConditionalContainerStyleDeclaration__Group__3__Impl )
            // InternalSiriusTextDsl.g:5418:2: rule__ConditionalContainerStyleDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__3"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__Group__3__Impl"
    // InternalSiriusTextDsl.g:5424:1: rule__ConditionalContainerStyleDeclaration__Group__3__Impl : ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5428:1: ( ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:5429:1: ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:5429:1: ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) )
            // InternalSiriusTextDsl.g:5430:1: ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionAssignment_3()); 
            // InternalSiriusTextDsl.g:5431:1: ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 )
            // InternalSiriusTextDsl.g:5431:2: rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Gradient__Group__0"
    // InternalSiriusTextDsl.g:5449:1: rule__Gradient__Group__0 : rule__Gradient__Group__0__Impl rule__Gradient__Group__1 ;
    public final void rule__Gradient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5453:1: ( rule__Gradient__Group__0__Impl rule__Gradient__Group__1 )
            // InternalSiriusTextDsl.g:5454:2: rule__Gradient__Group__0__Impl rule__Gradient__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Gradient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__0"


    // $ANTLR start "rule__Gradient__Group__0__Impl"
    // InternalSiriusTextDsl.g:5461:1: rule__Gradient__Group__0__Impl : ( ( rule__Gradient__DocumentationAssignment_0 )? ) ;
    public final void rule__Gradient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5465:1: ( ( ( rule__Gradient__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:5466:1: ( ( rule__Gradient__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:5466:1: ( ( rule__Gradient__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:5467:1: ( rule__Gradient__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getGradientAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:5468:1: ( rule__Gradient__DocumentationAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DOCUMENTATION) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSiriusTextDsl.g:5468:2: rule__Gradient__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__0__Impl"


    // $ANTLR start "rule__Gradient__Group__1"
    // InternalSiriusTextDsl.g:5478:1: rule__Gradient__Group__1 : rule__Gradient__Group__1__Impl rule__Gradient__Group__2 ;
    public final void rule__Gradient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5482:1: ( rule__Gradient__Group__1__Impl rule__Gradient__Group__2 )
            // InternalSiriusTextDsl.g:5483:2: rule__Gradient__Group__1__Impl rule__Gradient__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Gradient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__1"


    // $ANTLR start "rule__Gradient__Group__1__Impl"
    // InternalSiriusTextDsl.g:5490:1: rule__Gradient__Group__1__Impl : ( 'gradient' ) ;
    public final void rule__Gradient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5494:1: ( ( 'gradient' ) )
            // InternalSiriusTextDsl.g:5495:1: ( 'gradient' )
            {
            // InternalSiriusTextDsl.g:5495:1: ( 'gradient' )
            // InternalSiriusTextDsl.g:5496:1: 'gradient'
            {
             before(grammarAccess.getGradientAccess().getGradientKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getGradientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__1__Impl"


    // $ANTLR start "rule__Gradient__Group__2"
    // InternalSiriusTextDsl.g:5509:1: rule__Gradient__Group__2 : rule__Gradient__Group__2__Impl rule__Gradient__Group__3 ;
    public final void rule__Gradient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5513:1: ( rule__Gradient__Group__2__Impl rule__Gradient__Group__3 )
            // InternalSiriusTextDsl.g:5514:2: rule__Gradient__Group__2__Impl rule__Gradient__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__2"


    // $ANTLR start "rule__Gradient__Group__2__Impl"
    // InternalSiriusTextDsl.g:5521:1: rule__Gradient__Group__2__Impl : ( ( rule__Gradient__DirectionAssignment_2 ) ) ;
    public final void rule__Gradient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5525:1: ( ( ( rule__Gradient__DirectionAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:5526:1: ( ( rule__Gradient__DirectionAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:5526:1: ( ( rule__Gradient__DirectionAssignment_2 ) )
            // InternalSiriusTextDsl.g:5527:1: ( rule__Gradient__DirectionAssignment_2 )
            {
             before(grammarAccess.getGradientAccess().getDirectionAssignment_2()); 
            // InternalSiriusTextDsl.g:5528:1: ( rule__Gradient__DirectionAssignment_2 )
            // InternalSiriusTextDsl.g:5528:2: rule__Gradient__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getDirectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__2__Impl"


    // $ANTLR start "rule__Gradient__Group__3"
    // InternalSiriusTextDsl.g:5538:1: rule__Gradient__Group__3 : rule__Gradient__Group__3__Impl rule__Gradient__Group__4 ;
    public final void rule__Gradient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5542:1: ( rule__Gradient__Group__3__Impl rule__Gradient__Group__4 )
            // InternalSiriusTextDsl.g:5543:2: rule__Gradient__Group__3__Impl rule__Gradient__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Gradient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__3"


    // $ANTLR start "rule__Gradient__Group__3__Impl"
    // InternalSiriusTextDsl.g:5550:1: rule__Gradient__Group__3__Impl : ( ( rule__Gradient__NameAssignment_3 ) ) ;
    public final void rule__Gradient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5554:1: ( ( ( rule__Gradient__NameAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:5555:1: ( ( rule__Gradient__NameAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:5555:1: ( ( rule__Gradient__NameAssignment_3 ) )
            // InternalSiriusTextDsl.g:5556:1: ( rule__Gradient__NameAssignment_3 )
            {
             before(grammarAccess.getGradientAccess().getNameAssignment_3()); 
            // InternalSiriusTextDsl.g:5557:1: ( rule__Gradient__NameAssignment_3 )
            // InternalSiriusTextDsl.g:5557:2: rule__Gradient__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__3__Impl"


    // $ANTLR start "rule__Gradient__Group__4"
    // InternalSiriusTextDsl.g:5567:1: rule__Gradient__Group__4 : rule__Gradient__Group__4__Impl rule__Gradient__Group__5 ;
    public final void rule__Gradient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5571:1: ( rule__Gradient__Group__4__Impl rule__Gradient__Group__5 )
            // InternalSiriusTextDsl.g:5572:2: rule__Gradient__Group__4__Impl rule__Gradient__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__4"


    // $ANTLR start "rule__Gradient__Group__4__Impl"
    // InternalSiriusTextDsl.g:5579:1: rule__Gradient__Group__4__Impl : ( 'from' ) ;
    public final void rule__Gradient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5583:1: ( ( 'from' ) )
            // InternalSiriusTextDsl.g:5584:1: ( 'from' )
            {
            // InternalSiriusTextDsl.g:5584:1: ( 'from' )
            // InternalSiriusTextDsl.g:5585:1: 'from'
            {
             before(grammarAccess.getGradientAccess().getFromKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__4__Impl"


    // $ANTLR start "rule__Gradient__Group__5"
    // InternalSiriusTextDsl.g:5598:1: rule__Gradient__Group__5 : rule__Gradient__Group__5__Impl rule__Gradient__Group__6 ;
    public final void rule__Gradient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5602:1: ( rule__Gradient__Group__5__Impl rule__Gradient__Group__6 )
            // InternalSiriusTextDsl.g:5603:2: rule__Gradient__Group__5__Impl rule__Gradient__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__Gradient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__5"


    // $ANTLR start "rule__Gradient__Group__5__Impl"
    // InternalSiriusTextDsl.g:5610:1: rule__Gradient__Group__5__Impl : ( ( rule__Gradient__BackgroundColorAssignment_5 ) ) ;
    public final void rule__Gradient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5614:1: ( ( ( rule__Gradient__BackgroundColorAssignment_5 ) ) )
            // InternalSiriusTextDsl.g:5615:1: ( ( rule__Gradient__BackgroundColorAssignment_5 ) )
            {
            // InternalSiriusTextDsl.g:5615:1: ( ( rule__Gradient__BackgroundColorAssignment_5 ) )
            // InternalSiriusTextDsl.g:5616:1: ( rule__Gradient__BackgroundColorAssignment_5 )
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorAssignment_5()); 
            // InternalSiriusTextDsl.g:5617:1: ( rule__Gradient__BackgroundColorAssignment_5 )
            // InternalSiriusTextDsl.g:5617:2: rule__Gradient__BackgroundColorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__BackgroundColorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getBackgroundColorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__5__Impl"


    // $ANTLR start "rule__Gradient__Group__6"
    // InternalSiriusTextDsl.g:5627:1: rule__Gradient__Group__6 : rule__Gradient__Group__6__Impl rule__Gradient__Group__7 ;
    public final void rule__Gradient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5631:1: ( rule__Gradient__Group__6__Impl rule__Gradient__Group__7 )
            // InternalSiriusTextDsl.g:5632:2: rule__Gradient__Group__6__Impl rule__Gradient__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__6"


    // $ANTLR start "rule__Gradient__Group__6__Impl"
    // InternalSiriusTextDsl.g:5639:1: rule__Gradient__Group__6__Impl : ( 'to' ) ;
    public final void rule__Gradient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5643:1: ( ( 'to' ) )
            // InternalSiriusTextDsl.g:5644:1: ( 'to' )
            {
            // InternalSiriusTextDsl.g:5644:1: ( 'to' )
            // InternalSiriusTextDsl.g:5645:1: 'to'
            {
             before(grammarAccess.getGradientAccess().getToKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__6__Impl"


    // $ANTLR start "rule__Gradient__Group__7"
    // InternalSiriusTextDsl.g:5658:1: rule__Gradient__Group__7 : rule__Gradient__Group__7__Impl rule__Gradient__Group__8 ;
    public final void rule__Gradient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5662:1: ( rule__Gradient__Group__7__Impl rule__Gradient__Group__8 )
            // InternalSiriusTextDsl.g:5663:2: rule__Gradient__Group__7__Impl rule__Gradient__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Gradient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__7"


    // $ANTLR start "rule__Gradient__Group__7__Impl"
    // InternalSiriusTextDsl.g:5670:1: rule__Gradient__Group__7__Impl : ( ( rule__Gradient__ForegroundColorAssignment_7 ) ) ;
    public final void rule__Gradient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5674:1: ( ( ( rule__Gradient__ForegroundColorAssignment_7 ) ) )
            // InternalSiriusTextDsl.g:5675:1: ( ( rule__Gradient__ForegroundColorAssignment_7 ) )
            {
            // InternalSiriusTextDsl.g:5675:1: ( ( rule__Gradient__ForegroundColorAssignment_7 ) )
            // InternalSiriusTextDsl.g:5676:1: ( rule__Gradient__ForegroundColorAssignment_7 )
            {
             before(grammarAccess.getGradientAccess().getForegroundColorAssignment_7()); 
            // InternalSiriusTextDsl.g:5677:1: ( rule__Gradient__ForegroundColorAssignment_7 )
            // InternalSiriusTextDsl.g:5677:2: rule__Gradient__ForegroundColorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__ForegroundColorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getForegroundColorAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__7__Impl"


    // $ANTLR start "rule__Gradient__Group__8"
    // InternalSiriusTextDsl.g:5687:1: rule__Gradient__Group__8 : rule__Gradient__Group__8__Impl rule__Gradient__Group__9 ;
    public final void rule__Gradient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5691:1: ( rule__Gradient__Group__8__Impl rule__Gradient__Group__9 )
            // InternalSiriusTextDsl.g:5692:2: rule__Gradient__Group__8__Impl rule__Gradient__Group__9
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__8"


    // $ANTLR start "rule__Gradient__Group__8__Impl"
    // InternalSiriusTextDsl.g:5699:1: rule__Gradient__Group__8__Impl : ( '{' ) ;
    public final void rule__Gradient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5703:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:5704:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:5704:1: ( '{' )
            // InternalSiriusTextDsl.g:5705:1: '{'
            {
             before(grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__8__Impl"


    // $ANTLR start "rule__Gradient__Group__9"
    // InternalSiriusTextDsl.g:5718:1: rule__Gradient__Group__9 : rule__Gradient__Group__9__Impl rule__Gradient__Group__10 ;
    public final void rule__Gradient__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5722:1: ( rule__Gradient__Group__9__Impl rule__Gradient__Group__10 )
            // InternalSiriusTextDsl.g:5723:2: rule__Gradient__Group__9__Impl rule__Gradient__Group__10
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__9"


    // $ANTLR start "rule__Gradient__Group__9__Impl"
    // InternalSiriusTextDsl.g:5730:1: rule__Gradient__Group__9__Impl : ( ( rule__Gradient__Group_9__0 )? ) ;
    public final void rule__Gradient__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5734:1: ( ( ( rule__Gradient__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:5735:1: ( ( rule__Gradient__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:5735:1: ( ( rule__Gradient__Group_9__0 )? )
            // InternalSiriusTextDsl.g:5736:1: ( rule__Gradient__Group_9__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:5737:1: ( rule__Gradient__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSiriusTextDsl.g:5737:2: rule__Gradient__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__9__Impl"


    // $ANTLR start "rule__Gradient__Group__10"
    // InternalSiriusTextDsl.g:5747:1: rule__Gradient__Group__10 : rule__Gradient__Group__10__Impl rule__Gradient__Group__11 ;
    public final void rule__Gradient__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5751:1: ( rule__Gradient__Group__10__Impl rule__Gradient__Group__11 )
            // InternalSiriusTextDsl.g:5752:2: rule__Gradient__Group__10__Impl rule__Gradient__Group__11
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__10"


    // $ANTLR start "rule__Gradient__Group__10__Impl"
    // InternalSiriusTextDsl.g:5759:1: rule__Gradient__Group__10__Impl : ( ( rule__Gradient__Group_10__0 )? ) ;
    public final void rule__Gradient__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5763:1: ( ( ( rule__Gradient__Group_10__0 )? ) )
            // InternalSiriusTextDsl.g:5764:1: ( ( rule__Gradient__Group_10__0 )? )
            {
            // InternalSiriusTextDsl.g:5764:1: ( ( rule__Gradient__Group_10__0 )? )
            // InternalSiriusTextDsl.g:5765:1: ( rule__Gradient__Group_10__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_10()); 
            // InternalSiriusTextDsl.g:5766:1: ( rule__Gradient__Group_10__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:5766:2: rule__Gradient__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__10__Impl"


    // $ANTLR start "rule__Gradient__Group__11"
    // InternalSiriusTextDsl.g:5776:1: rule__Gradient__Group__11 : rule__Gradient__Group__11__Impl rule__Gradient__Group__12 ;
    public final void rule__Gradient__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5780:1: ( rule__Gradient__Group__11__Impl rule__Gradient__Group__12 )
            // InternalSiriusTextDsl.g:5781:2: rule__Gradient__Group__11__Impl rule__Gradient__Group__12
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__11"


    // $ANTLR start "rule__Gradient__Group__11__Impl"
    // InternalSiriusTextDsl.g:5788:1: rule__Gradient__Group__11__Impl : ( ( rule__Gradient__Group_11__0 )? ) ;
    public final void rule__Gradient__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5792:1: ( ( ( rule__Gradient__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:5793:1: ( ( rule__Gradient__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:5793:1: ( ( rule__Gradient__Group_11__0 )? )
            // InternalSiriusTextDsl.g:5794:1: ( rule__Gradient__Group_11__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:5795:1: ( rule__Gradient__Group_11__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:5795:2: rule__Gradient__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__11__Impl"


    // $ANTLR start "rule__Gradient__Group__12"
    // InternalSiriusTextDsl.g:5805:1: rule__Gradient__Group__12 : rule__Gradient__Group__12__Impl rule__Gradient__Group__13 ;
    public final void rule__Gradient__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5809:1: ( rule__Gradient__Group__12__Impl rule__Gradient__Group__13 )
            // InternalSiriusTextDsl.g:5810:2: rule__Gradient__Group__12__Impl rule__Gradient__Group__13
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__12"


    // $ANTLR start "rule__Gradient__Group__12__Impl"
    // InternalSiriusTextDsl.g:5817:1: rule__Gradient__Group__12__Impl : ( ( rule__Gradient__Group_12__0 )? ) ;
    public final void rule__Gradient__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5821:1: ( ( ( rule__Gradient__Group_12__0 )? ) )
            // InternalSiriusTextDsl.g:5822:1: ( ( rule__Gradient__Group_12__0 )? )
            {
            // InternalSiriusTextDsl.g:5822:1: ( ( rule__Gradient__Group_12__0 )? )
            // InternalSiriusTextDsl.g:5823:1: ( rule__Gradient__Group_12__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_12()); 
            // InternalSiriusTextDsl.g:5824:1: ( rule__Gradient__Group_12__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:5824:2: rule__Gradient__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__12__Impl"


    // $ANTLR start "rule__Gradient__Group__13"
    // InternalSiriusTextDsl.g:5834:1: rule__Gradient__Group__13 : rule__Gradient__Group__13__Impl rule__Gradient__Group__14 ;
    public final void rule__Gradient__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5838:1: ( rule__Gradient__Group__13__Impl rule__Gradient__Group__14 )
            // InternalSiriusTextDsl.g:5839:2: rule__Gradient__Group__13__Impl rule__Gradient__Group__14
            {
            pushFollow(FOLLOW_47);
            rule__Gradient__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__13"


    // $ANTLR start "rule__Gradient__Group__13__Impl"
    // InternalSiriusTextDsl.g:5846:1: rule__Gradient__Group__13__Impl : ( ( rule__Gradient__Group_13__0 )? ) ;
    public final void rule__Gradient__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5850:1: ( ( ( rule__Gradient__Group_13__0 )? ) )
            // InternalSiriusTextDsl.g:5851:1: ( ( rule__Gradient__Group_13__0 )? )
            {
            // InternalSiriusTextDsl.g:5851:1: ( ( rule__Gradient__Group_13__0 )? )
            // InternalSiriusTextDsl.g:5852:1: ( rule__Gradient__Group_13__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_13()); 
            // InternalSiriusTextDsl.g:5853:1: ( rule__Gradient__Group_13__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSiriusTextDsl.g:5853:2: rule__Gradient__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gradient__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGradientAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__13__Impl"


    // $ANTLR start "rule__Gradient__Group__14"
    // InternalSiriusTextDsl.g:5863:1: rule__Gradient__Group__14 : rule__Gradient__Group__14__Impl ;
    public final void rule__Gradient__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5867:1: ( rule__Gradient__Group__14__Impl )
            // InternalSiriusTextDsl.g:5868:2: rule__Gradient__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__14"


    // $ANTLR start "rule__Gradient__Group__14__Impl"
    // InternalSiriusTextDsl.g:5874:1: rule__Gradient__Group__14__Impl : ( '}' ) ;
    public final void rule__Gradient__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5878:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:5879:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:5879:1: ( '}' )
            // InternalSiriusTextDsl.g:5880:1: '}'
            {
             before(grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group__14__Impl"


    // $ANTLR start "rule__Gradient__Group_9__0"
    // InternalSiriusTextDsl.g:5923:1: rule__Gradient__Group_9__0 : rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1 ;
    public final void rule__Gradient__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5927:1: ( rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1 )
            // InternalSiriusTextDsl.g:5928:2: rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1
            {
            pushFollow(FOLLOW_48);
            rule__Gradient__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__0"


    // $ANTLR start "rule__Gradient__Group_9__0__Impl"
    // InternalSiriusTextDsl.g:5935:1: rule__Gradient__Group_9__0__Impl : ( 'label' ) ;
    public final void rule__Gradient__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5939:1: ( ( 'label' ) )
            // InternalSiriusTextDsl.g:5940:1: ( 'label' )
            {
            // InternalSiriusTextDsl.g:5940:1: ( 'label' )
            // InternalSiriusTextDsl.g:5941:1: 'label'
            {
             before(grammarAccess.getGradientAccess().getLabelKeyword_9_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getLabelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__0__Impl"


    // $ANTLR start "rule__Gradient__Group_9__1"
    // InternalSiriusTextDsl.g:5954:1: rule__Gradient__Group_9__1 : rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2 ;
    public final void rule__Gradient__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5958:1: ( rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2 )
            // InternalSiriusTextDsl.g:5959:2: rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2
            {
            pushFollow(FOLLOW_31);
            rule__Gradient__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__1"


    // $ANTLR start "rule__Gradient__Group_9__1__Impl"
    // InternalSiriusTextDsl.g:5966:1: rule__Gradient__Group_9__1__Impl : ( ( rule__Gradient__PositionAssignment_9_1 ) ) ;
    public final void rule__Gradient__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5970:1: ( ( ( rule__Gradient__PositionAssignment_9_1 ) ) )
            // InternalSiriusTextDsl.g:5971:1: ( ( rule__Gradient__PositionAssignment_9_1 ) )
            {
            // InternalSiriusTextDsl.g:5971:1: ( ( rule__Gradient__PositionAssignment_9_1 ) )
            // InternalSiriusTextDsl.g:5972:1: ( rule__Gradient__PositionAssignment_9_1 )
            {
             before(grammarAccess.getGradientAccess().getPositionAssignment_9_1()); 
            // InternalSiriusTextDsl.g:5973:1: ( rule__Gradient__PositionAssignment_9_1 )
            // InternalSiriusTextDsl.g:5973:2: rule__Gradient__PositionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__PositionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getPositionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__1__Impl"


    // $ANTLR start "rule__Gradient__Group_9__2"
    // InternalSiriusTextDsl.g:5983:1: rule__Gradient__Group_9__2 : rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3 ;
    public final void rule__Gradient__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5987:1: ( rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3 )
            // InternalSiriusTextDsl.g:5988:2: rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3
            {
            pushFollow(FOLLOW_49);
            rule__Gradient__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__2"


    // $ANTLR start "rule__Gradient__Group_9__2__Impl"
    // InternalSiriusTextDsl.g:5995:1: rule__Gradient__Group_9__2__Impl : ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) ) ;
    public final void rule__Gradient__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5999:1: ( ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) ) )
            // InternalSiriusTextDsl.g:6000:1: ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) )
            {
            // InternalSiriusTextDsl.g:6000:1: ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) )
            // InternalSiriusTextDsl.g:6001:1: ( rule__Gradient__LabelExpressionAssignment_9_2 )
            {
             before(grammarAccess.getGradientAccess().getLabelExpressionAssignment_9_2()); 
            // InternalSiriusTextDsl.g:6002:1: ( rule__Gradient__LabelExpressionAssignment_9_2 )
            // InternalSiriusTextDsl.g:6002:2: rule__Gradient__LabelExpressionAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__LabelExpressionAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getLabelExpressionAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__2__Impl"


    // $ANTLR start "rule__Gradient__Group_9__3"
    // InternalSiriusTextDsl.g:6012:1: rule__Gradient__Group_9__3 : rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4 ;
    public final void rule__Gradient__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6016:1: ( rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4 )
            // InternalSiriusTextDsl.g:6017:2: rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__3"


    // $ANTLR start "rule__Gradient__Group_9__3__Impl"
    // InternalSiriusTextDsl.g:6024:1: rule__Gradient__Group_9__3__Impl : ( 'in' ) ;
    public final void rule__Gradient__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6028:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:6029:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:6029:1: ( 'in' )
            // InternalSiriusTextDsl.g:6030:1: 'in'
            {
             before(grammarAccess.getGradientAccess().getInKeyword_9_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getInKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__3__Impl"


    // $ANTLR start "rule__Gradient__Group_9__4"
    // InternalSiriusTextDsl.g:6043:1: rule__Gradient__Group_9__4 : rule__Gradient__Group_9__4__Impl ;
    public final void rule__Gradient__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6047:1: ( rule__Gradient__Group_9__4__Impl )
            // InternalSiriusTextDsl.g:6048:2: rule__Gradient__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__4"


    // $ANTLR start "rule__Gradient__Group_9__4__Impl"
    // InternalSiriusTextDsl.g:6054:1: rule__Gradient__Group_9__4__Impl : ( ( rule__Gradient__LabelColorAssignment_9_4 ) ) ;
    public final void rule__Gradient__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6058:1: ( ( ( rule__Gradient__LabelColorAssignment_9_4 ) ) )
            // InternalSiriusTextDsl.g:6059:1: ( ( rule__Gradient__LabelColorAssignment_9_4 ) )
            {
            // InternalSiriusTextDsl.g:6059:1: ( ( rule__Gradient__LabelColorAssignment_9_4 ) )
            // InternalSiriusTextDsl.g:6060:1: ( rule__Gradient__LabelColorAssignment_9_4 )
            {
             before(grammarAccess.getGradientAccess().getLabelColorAssignment_9_4()); 
            // InternalSiriusTextDsl.g:6061:1: ( rule__Gradient__LabelColorAssignment_9_4 )
            // InternalSiriusTextDsl.g:6061:2: rule__Gradient__LabelColorAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__LabelColorAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getLabelColorAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_9__4__Impl"


    // $ANTLR start "rule__Gradient__Group_10__0"
    // InternalSiriusTextDsl.g:6081:1: rule__Gradient__Group_10__0 : rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1 ;
    public final void rule__Gradient__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6085:1: ( rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1 )
            // InternalSiriusTextDsl.g:6086:2: rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1
            {
            pushFollow(FOLLOW_50);
            rule__Gradient__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__0"


    // $ANTLR start "rule__Gradient__Group_10__0__Impl"
    // InternalSiriusTextDsl.g:6093:1: rule__Gradient__Group_10__0__Impl : ( 'border' ) ;
    public final void rule__Gradient__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6097:1: ( ( 'border' ) )
            // InternalSiriusTextDsl.g:6098:1: ( 'border' )
            {
            // InternalSiriusTextDsl.g:6098:1: ( 'border' )
            // InternalSiriusTextDsl.g:6099:1: 'border'
            {
             before(grammarAccess.getGradientAccess().getBorderKeyword_10_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getBorderKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__0__Impl"


    // $ANTLR start "rule__Gradient__Group_10__1"
    // InternalSiriusTextDsl.g:6112:1: rule__Gradient__Group_10__1 : rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2 ;
    public final void rule__Gradient__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6116:1: ( rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2 )
            // InternalSiriusTextDsl.g:6117:2: rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__1"


    // $ANTLR start "rule__Gradient__Group_10__1__Impl"
    // InternalSiriusTextDsl.g:6124:1: rule__Gradient__Group_10__1__Impl : ( 'size' ) ;
    public final void rule__Gradient__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6128:1: ( ( 'size' ) )
            // InternalSiriusTextDsl.g:6129:1: ( 'size' )
            {
            // InternalSiriusTextDsl.g:6129:1: ( 'size' )
            // InternalSiriusTextDsl.g:6130:1: 'size'
            {
             before(grammarAccess.getGradientAccess().getSizeKeyword_10_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getSizeKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__1__Impl"


    // $ANTLR start "rule__Gradient__Group_10__2"
    // InternalSiriusTextDsl.g:6143:1: rule__Gradient__Group_10__2 : rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3 ;
    public final void rule__Gradient__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6147:1: ( rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3 )
            // InternalSiriusTextDsl.g:6148:2: rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3
            {
            pushFollow(FOLLOW_51);
            rule__Gradient__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__2"


    // $ANTLR start "rule__Gradient__Group_10__2__Impl"
    // InternalSiriusTextDsl.g:6155:1: rule__Gradient__Group_10__2__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6159:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6160:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6160:1: ( '=' )
            // InternalSiriusTextDsl.g:6161:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__2__Impl"


    // $ANTLR start "rule__Gradient__Group_10__3"
    // InternalSiriusTextDsl.g:6174:1: rule__Gradient__Group_10__3 : rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4 ;
    public final void rule__Gradient__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6178:1: ( rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4 )
            // InternalSiriusTextDsl.g:6179:2: rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4
            {
            pushFollow(FOLLOW_49);
            rule__Gradient__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__3"


    // $ANTLR start "rule__Gradient__Group_10__3__Impl"
    // InternalSiriusTextDsl.g:6186:1: rule__Gradient__Group_10__3__Impl : ( ( rule__Gradient__BorderSizeAssignment_10_3 ) ) ;
    public final void rule__Gradient__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6190:1: ( ( ( rule__Gradient__BorderSizeAssignment_10_3 ) ) )
            // InternalSiriusTextDsl.g:6191:1: ( ( rule__Gradient__BorderSizeAssignment_10_3 ) )
            {
            // InternalSiriusTextDsl.g:6191:1: ( ( rule__Gradient__BorderSizeAssignment_10_3 ) )
            // InternalSiriusTextDsl.g:6192:1: ( rule__Gradient__BorderSizeAssignment_10_3 )
            {
             before(grammarAccess.getGradientAccess().getBorderSizeAssignment_10_3()); 
            // InternalSiriusTextDsl.g:6193:1: ( rule__Gradient__BorderSizeAssignment_10_3 )
            // InternalSiriusTextDsl.g:6193:2: rule__Gradient__BorderSizeAssignment_10_3
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__BorderSizeAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getBorderSizeAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__3__Impl"


    // $ANTLR start "rule__Gradient__Group_10__4"
    // InternalSiriusTextDsl.g:6203:1: rule__Gradient__Group_10__4 : rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5 ;
    public final void rule__Gradient__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6207:1: ( rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5 )
            // InternalSiriusTextDsl.g:6208:2: rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5
            {
            pushFollow(FOLLOW_4);
            rule__Gradient__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__4"


    // $ANTLR start "rule__Gradient__Group_10__4__Impl"
    // InternalSiriusTextDsl.g:6215:1: rule__Gradient__Group_10__4__Impl : ( 'in' ) ;
    public final void rule__Gradient__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6219:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:6220:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:6220:1: ( 'in' )
            // InternalSiriusTextDsl.g:6221:1: 'in'
            {
             before(grammarAccess.getGradientAccess().getInKeyword_10_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getInKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__4__Impl"


    // $ANTLR start "rule__Gradient__Group_10__5"
    // InternalSiriusTextDsl.g:6234:1: rule__Gradient__Group_10__5 : rule__Gradient__Group_10__5__Impl ;
    public final void rule__Gradient__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6238:1: ( rule__Gradient__Group_10__5__Impl )
            // InternalSiriusTextDsl.g:6239:2: rule__Gradient__Group_10__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_10__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__5"


    // $ANTLR start "rule__Gradient__Group_10__5__Impl"
    // InternalSiriusTextDsl.g:6245:1: rule__Gradient__Group_10__5__Impl : ( ( rule__Gradient__BorderColorAssignment_10_5 ) ) ;
    public final void rule__Gradient__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6249:1: ( ( ( rule__Gradient__BorderColorAssignment_10_5 ) ) )
            // InternalSiriusTextDsl.g:6250:1: ( ( rule__Gradient__BorderColorAssignment_10_5 ) )
            {
            // InternalSiriusTextDsl.g:6250:1: ( ( rule__Gradient__BorderColorAssignment_10_5 ) )
            // InternalSiriusTextDsl.g:6251:1: ( rule__Gradient__BorderColorAssignment_10_5 )
            {
             before(grammarAccess.getGradientAccess().getBorderColorAssignment_10_5()); 
            // InternalSiriusTextDsl.g:6252:1: ( rule__Gradient__BorderColorAssignment_10_5 )
            // InternalSiriusTextDsl.g:6252:2: rule__Gradient__BorderColorAssignment_10_5
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__BorderColorAssignment_10_5();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getBorderColorAssignment_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_10__5__Impl"


    // $ANTLR start "rule__Gradient__Group_11__0"
    // InternalSiriusTextDsl.g:6274:1: rule__Gradient__Group_11__0 : rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1 ;
    public final void rule__Gradient__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6278:1: ( rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1 )
            // InternalSiriusTextDsl.g:6279:2: rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_11__0"


    // $ANTLR start "rule__Gradient__Group_11__0__Impl"
    // InternalSiriusTextDsl.g:6286:1: rule__Gradient__Group_11__0__Impl : ( 'icon' ) ;
    public final void rule__Gradient__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6290:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:6291:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:6291:1: ( 'icon' )
            // InternalSiriusTextDsl.g:6292:1: 'icon'
            {
             before(grammarAccess.getGradientAccess().getIconKeyword_11_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getIconKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_11__0__Impl"


    // $ANTLR start "rule__Gradient__Group_11__1"
    // InternalSiriusTextDsl.g:6305:1: rule__Gradient__Group_11__1 : rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2 ;
    public final void rule__Gradient__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6309:1: ( rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2 )
            // InternalSiriusTextDsl.g:6310:2: rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2
            {
            pushFollow(FOLLOW_14);
            rule__Gradient__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_11__1"


    // $ANTLR start "rule__Gradient__Group_11__1__Impl"
    // InternalSiriusTextDsl.g:6317:1: rule__Gradient__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6321:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6322:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6322:1: ( '=' )
            // InternalSiriusTextDsl.g:6323:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_11__1__Impl"


    // $ANTLR start "rule__Gradient__Group_11__2"
    // InternalSiriusTextDsl.g:6336:1: rule__Gradient__Group_11__2 : rule__Gradient__Group_11__2__Impl ;
    public final void rule__Gradient__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6340:1: ( rule__Gradient__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:6341:2: rule__Gradient__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_11__2"


    // $ANTLR start "rule__Gradient__Group_11__2__Impl"
    // InternalSiriusTextDsl.g:6347:1: rule__Gradient__Group_11__2__Impl : ( ( rule__Gradient__IconAssignment_11_2 ) ) ;
    public final void rule__Gradient__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6351:1: ( ( ( rule__Gradient__IconAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:6352:1: ( ( rule__Gradient__IconAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:6352:1: ( ( rule__Gradient__IconAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:6353:1: ( rule__Gradient__IconAssignment_11_2 )
            {
             before(grammarAccess.getGradientAccess().getIconAssignment_11_2()); 
            // InternalSiriusTextDsl.g:6354:1: ( rule__Gradient__IconAssignment_11_2 )
            // InternalSiriusTextDsl.g:6354:2: rule__Gradient__IconAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__IconAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getIconAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_11__2__Impl"


    // $ANTLR start "rule__Gradient__Group_12__0"
    // InternalSiriusTextDsl.g:6370:1: rule__Gradient__Group_12__0 : rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1 ;
    public final void rule__Gradient__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6374:1: ( rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1 )
            // InternalSiriusTextDsl.g:6375:2: rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_12__0"


    // $ANTLR start "rule__Gradient__Group_12__0__Impl"
    // InternalSiriusTextDsl.g:6382:1: rule__Gradient__Group_12__0__Impl : ( 'height' ) ;
    public final void rule__Gradient__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6386:1: ( ( 'height' ) )
            // InternalSiriusTextDsl.g:6387:1: ( 'height' )
            {
            // InternalSiriusTextDsl.g:6387:1: ( 'height' )
            // InternalSiriusTextDsl.g:6388:1: 'height'
            {
             before(grammarAccess.getGradientAccess().getHeightKeyword_12_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getHeightKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_12__0__Impl"


    // $ANTLR start "rule__Gradient__Group_12__1"
    // InternalSiriusTextDsl.g:6401:1: rule__Gradient__Group_12__1 : rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2 ;
    public final void rule__Gradient__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6405:1: ( rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2 )
            // InternalSiriusTextDsl.g:6406:2: rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2
            {
            pushFollow(FOLLOW_51);
            rule__Gradient__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_12__1"


    // $ANTLR start "rule__Gradient__Group_12__1__Impl"
    // InternalSiriusTextDsl.g:6413:1: rule__Gradient__Group_12__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6417:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6418:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6418:1: ( '=' )
            // InternalSiriusTextDsl.g:6419:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_12__1__Impl"


    // $ANTLR start "rule__Gradient__Group_12__2"
    // InternalSiriusTextDsl.g:6432:1: rule__Gradient__Group_12__2 : rule__Gradient__Group_12__2__Impl ;
    public final void rule__Gradient__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6436:1: ( rule__Gradient__Group_12__2__Impl )
            // InternalSiriusTextDsl.g:6437:2: rule__Gradient__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_12__2"


    // $ANTLR start "rule__Gradient__Group_12__2__Impl"
    // InternalSiriusTextDsl.g:6443:1: rule__Gradient__Group_12__2__Impl : ( ( rule__Gradient__HeightAssignment_12_2 ) ) ;
    public final void rule__Gradient__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6447:1: ( ( ( rule__Gradient__HeightAssignment_12_2 ) ) )
            // InternalSiriusTextDsl.g:6448:1: ( ( rule__Gradient__HeightAssignment_12_2 ) )
            {
            // InternalSiriusTextDsl.g:6448:1: ( ( rule__Gradient__HeightAssignment_12_2 ) )
            // InternalSiriusTextDsl.g:6449:1: ( rule__Gradient__HeightAssignment_12_2 )
            {
             before(grammarAccess.getGradientAccess().getHeightAssignment_12_2()); 
            // InternalSiriusTextDsl.g:6450:1: ( rule__Gradient__HeightAssignment_12_2 )
            // InternalSiriusTextDsl.g:6450:2: rule__Gradient__HeightAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__HeightAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getHeightAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_12__2__Impl"


    // $ANTLR start "rule__Gradient__Group_13__0"
    // InternalSiriusTextDsl.g:6466:1: rule__Gradient__Group_13__0 : rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1 ;
    public final void rule__Gradient__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6470:1: ( rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1 )
            // InternalSiriusTextDsl.g:6471:2: rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1
            {
            pushFollow(FOLLOW_17);
            rule__Gradient__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_13__0"


    // $ANTLR start "rule__Gradient__Group_13__0__Impl"
    // InternalSiriusTextDsl.g:6478:1: rule__Gradient__Group_13__0__Impl : ( 'width' ) ;
    public final void rule__Gradient__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6482:1: ( ( 'width' ) )
            // InternalSiriusTextDsl.g:6483:1: ( 'width' )
            {
            // InternalSiriusTextDsl.g:6483:1: ( 'width' )
            // InternalSiriusTextDsl.g:6484:1: 'width'
            {
             before(grammarAccess.getGradientAccess().getWidthKeyword_13_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getWidthKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_13__0__Impl"


    // $ANTLR start "rule__Gradient__Group_13__1"
    // InternalSiriusTextDsl.g:6497:1: rule__Gradient__Group_13__1 : rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2 ;
    public final void rule__Gradient__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6501:1: ( rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2 )
            // InternalSiriusTextDsl.g:6502:2: rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2
            {
            pushFollow(FOLLOW_51);
            rule__Gradient__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradient__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_13__1"


    // $ANTLR start "rule__Gradient__Group_13__1__Impl"
    // InternalSiriusTextDsl.g:6509:1: rule__Gradient__Group_13__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6513:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6514:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6514:1: ( '=' )
            // InternalSiriusTextDsl.g:6515:1: '='
            {
             before(grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_13__1__Impl"


    // $ANTLR start "rule__Gradient__Group_13__2"
    // InternalSiriusTextDsl.g:6528:1: rule__Gradient__Group_13__2 : rule__Gradient__Group_13__2__Impl ;
    public final void rule__Gradient__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6532:1: ( rule__Gradient__Group_13__2__Impl )
            // InternalSiriusTextDsl.g:6533:2: rule__Gradient__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_13__2"


    // $ANTLR start "rule__Gradient__Group_13__2__Impl"
    // InternalSiriusTextDsl.g:6539:1: rule__Gradient__Group_13__2__Impl : ( ( rule__Gradient__WidthAssignment_13_2 ) ) ;
    public final void rule__Gradient__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6543:1: ( ( ( rule__Gradient__WidthAssignment_13_2 ) ) )
            // InternalSiriusTextDsl.g:6544:1: ( ( rule__Gradient__WidthAssignment_13_2 ) )
            {
            // InternalSiriusTextDsl.g:6544:1: ( ( rule__Gradient__WidthAssignment_13_2 ) )
            // InternalSiriusTextDsl.g:6545:1: ( rule__Gradient__WidthAssignment_13_2 )
            {
             before(grammarAccess.getGradientAccess().getWidthAssignment_13_2()); 
            // InternalSiriusTextDsl.g:6546:1: ( rule__Gradient__WidthAssignment_13_2 )
            // InternalSiriusTextDsl.g:6546:2: rule__Gradient__WidthAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__WidthAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getWidthAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__Group_13__2__Impl"


    // $ANTLR start "rule__Palette__Group__0"
    // InternalSiriusTextDsl.g:6562:1: rule__Palette__Group__0 : rule__Palette__Group__0__Impl rule__Palette__Group__1 ;
    public final void rule__Palette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6566:1: ( rule__Palette__Group__0__Impl rule__Palette__Group__1 )
            // InternalSiriusTextDsl.g:6567:2: rule__Palette__Group__0__Impl rule__Palette__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Palette__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__0"


    // $ANTLR start "rule__Palette__Group__0__Impl"
    // InternalSiriusTextDsl.g:6574:1: rule__Palette__Group__0__Impl : ( ( rule__Palette__DocumentationAssignment_0 )? ) ;
    public final void rule__Palette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6578:1: ( ( ( rule__Palette__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:6579:1: ( ( rule__Palette__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:6579:1: ( ( rule__Palette__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:6580:1: ( rule__Palette__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getPaletteAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:6581:1: ( rule__Palette__DocumentationAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DOCUMENTATION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSiriusTextDsl.g:6581:2: rule__Palette__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Palette__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaletteAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__0__Impl"


    // $ANTLR start "rule__Palette__Group__1"
    // InternalSiriusTextDsl.g:6591:1: rule__Palette__Group__1 : rule__Palette__Group__1__Impl rule__Palette__Group__2 ;
    public final void rule__Palette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6595:1: ( rule__Palette__Group__1__Impl rule__Palette__Group__2 )
            // InternalSiriusTextDsl.g:6596:2: rule__Palette__Group__1__Impl rule__Palette__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Palette__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__1"


    // $ANTLR start "rule__Palette__Group__1__Impl"
    // InternalSiriusTextDsl.g:6603:1: rule__Palette__Group__1__Impl : ( 'palette' ) ;
    public final void rule__Palette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6607:1: ( ( 'palette' ) )
            // InternalSiriusTextDsl.g:6608:1: ( 'palette' )
            {
            // InternalSiriusTextDsl.g:6608:1: ( 'palette' )
            // InternalSiriusTextDsl.g:6609:1: 'palette'
            {
             before(grammarAccess.getPaletteAccess().getPaletteKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getPaletteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__1__Impl"


    // $ANTLR start "rule__Palette__Group__2"
    // InternalSiriusTextDsl.g:6622:1: rule__Palette__Group__2 : rule__Palette__Group__2__Impl rule__Palette__Group__3 ;
    public final void rule__Palette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6626:1: ( rule__Palette__Group__2__Impl rule__Palette__Group__3 )
            // InternalSiriusTextDsl.g:6627:2: rule__Palette__Group__2__Impl rule__Palette__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Palette__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__2"


    // $ANTLR start "rule__Palette__Group__2__Impl"
    // InternalSiriusTextDsl.g:6634:1: rule__Palette__Group__2__Impl : ( ( rule__Palette__NameAssignment_2 ) ) ;
    public final void rule__Palette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6638:1: ( ( ( rule__Palette__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:6639:1: ( ( rule__Palette__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:6639:1: ( ( rule__Palette__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:6640:1: ( rule__Palette__NameAssignment_2 )
            {
             before(grammarAccess.getPaletteAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:6641:1: ( rule__Palette__NameAssignment_2 )
            // InternalSiriusTextDsl.g:6641:2: rule__Palette__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Palette__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPaletteAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__2__Impl"


    // $ANTLR start "rule__Palette__Group__3"
    // InternalSiriusTextDsl.g:6651:1: rule__Palette__Group__3 : rule__Palette__Group__3__Impl rule__Palette__Group__4 ;
    public final void rule__Palette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6655:1: ( rule__Palette__Group__3__Impl rule__Palette__Group__4 )
            // InternalSiriusTextDsl.g:6656:2: rule__Palette__Group__3__Impl rule__Palette__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__Palette__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__3"


    // $ANTLR start "rule__Palette__Group__3__Impl"
    // InternalSiriusTextDsl.g:6663:1: rule__Palette__Group__3__Impl : ( '{' ) ;
    public final void rule__Palette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6667:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:6668:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:6668:1: ( '{' )
            // InternalSiriusTextDsl.g:6669:1: '{'
            {
             before(grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__3__Impl"


    // $ANTLR start "rule__Palette__Group__4"
    // InternalSiriusTextDsl.g:6682:1: rule__Palette__Group__4 : rule__Palette__Group__4__Impl rule__Palette__Group__5 ;
    public final void rule__Palette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6686:1: ( rule__Palette__Group__4__Impl rule__Palette__Group__5 )
            // InternalSiriusTextDsl.g:6687:2: rule__Palette__Group__4__Impl rule__Palette__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__Palette__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Palette__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__4"


    // $ANTLR start "rule__Palette__Group__4__Impl"
    // InternalSiriusTextDsl.g:6694:1: rule__Palette__Group__4__Impl : ( ( rule__Palette__ColorsAssignment_4 )* ) ;
    public final void rule__Palette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6698:1: ( ( ( rule__Palette__ColorsAssignment_4 )* ) )
            // InternalSiriusTextDsl.g:6699:1: ( ( rule__Palette__ColorsAssignment_4 )* )
            {
            // InternalSiriusTextDsl.g:6699:1: ( ( rule__Palette__ColorsAssignment_4 )* )
            // InternalSiriusTextDsl.g:6700:1: ( rule__Palette__ColorsAssignment_4 )*
            {
             before(grammarAccess.getPaletteAccess().getColorsAssignment_4()); 
            // InternalSiriusTextDsl.g:6701:1: ( rule__Palette__ColorsAssignment_4 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==60) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:6701:2: rule__Palette__ColorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Palette__ColorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getPaletteAccess().getColorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__4__Impl"


    // $ANTLR start "rule__Palette__Group__5"
    // InternalSiriusTextDsl.g:6711:1: rule__Palette__Group__5 : rule__Palette__Group__5__Impl ;
    public final void rule__Palette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6715:1: ( rule__Palette__Group__5__Impl )
            // InternalSiriusTextDsl.g:6716:2: rule__Palette__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Palette__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__5"


    // $ANTLR start "rule__Palette__Group__5__Impl"
    // InternalSiriusTextDsl.g:6722:1: rule__Palette__Group__5__Impl : ( '}' ) ;
    public final void rule__Palette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6726:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:6727:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:6727:1: ( '}' )
            // InternalSiriusTextDsl.g:6728:1: '}'
            {
             before(grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalSiriusTextDsl.g:6753:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6757:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalSiriusTextDsl.g:6758:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalSiriusTextDsl.g:6765:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6769:1: ( ( 'color' ) )
            // InternalSiriusTextDsl.g:6770:1: ( 'color' )
            {
            // InternalSiriusTextDsl.g:6770:1: ( 'color' )
            // InternalSiriusTextDsl.g:6771:1: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalSiriusTextDsl.g:6784:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6788:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalSiriusTextDsl.g:6789:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalSiriusTextDsl.g:6796:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6800:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:6801:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:6801:1: ( ( rule__Color__NameAssignment_1 ) )
            // InternalSiriusTextDsl.g:6802:1: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalSiriusTextDsl.g:6803:1: ( rule__Color__NameAssignment_1 )
            // InternalSiriusTextDsl.g:6803:2: rule__Color__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalSiriusTextDsl.g:6813:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6817:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalSiriusTextDsl.g:6818:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalSiriusTextDsl.g:6825:1: rule__Color__Group__2__Impl : ( '=' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6829:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6830:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6830:1: ( '=' )
            // InternalSiriusTextDsl.g:6831:1: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalSiriusTextDsl.g:6844:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6848:1: ( rule__Color__Group__3__Impl )
            // InternalSiriusTextDsl.g:6849:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalSiriusTextDsl.g:6855:1: rule__Color__Group__3__Impl : ( ( rule__Color__ValueAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6859:1: ( ( ( rule__Color__ValueAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:6860:1: ( ( rule__Color__ValueAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:6860:1: ( ( rule__Color__ValueAssignment_3 ) )
            // InternalSiriusTextDsl.g:6861:1: ( rule__Color__ValueAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getValueAssignment_3()); 
            // InternalSiriusTextDsl.g:6862:1: ( rule__Color__ValueAssignment_3 )
            // InternalSiriusTextDsl.g:6862:2: rule__Color__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__SiriusFile__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:6881:1: rule__SiriusFile__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__SiriusFile__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6885:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:6886:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:6886:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:6887:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__DocumentationAssignment_0"


    // $ANTLR start "rule__SiriusFile__NameAssignment_2"
    // InternalSiriusTextDsl.g:6896:1: rule__SiriusFile__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__SiriusFile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6900:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:6901:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:6901:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:6902:1: ruleQualifiedName
            {
             before(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__NameAssignment_2"


    // $ANTLR start "rule__SiriusFile__ImportsAssignment_3"
    // InternalSiriusTextDsl.g:6911:1: rule__SiriusFile__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__SiriusFile__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6915:1: ( ( ruleImport ) )
            // InternalSiriusTextDsl.g:6916:1: ( ruleImport )
            {
            // InternalSiriusTextDsl.g:6916:1: ( ruleImport )
            // InternalSiriusTextDsl.g:6917:1: ruleImport
            {
             before(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__ImportsAssignment_3"


    // $ANTLR start "rule__SiriusFile__BodyAssignment_4"
    // InternalSiriusTextDsl.g:6926:1: rule__SiriusFile__BodyAssignment_4 : ( ruleSiriusFileBody ) ;
    public final void rule__SiriusFile__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6930:1: ( ( ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:6931:1: ( ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:6931:1: ( ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:6932:1: ruleSiriusFileBody
            {
             before(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusFileBody();

            state._fsp--;

             after(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusFile__BodyAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalSiriusTextDsl.g:6941:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6945:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:6946:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:6946:1: ( ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:6947:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Designer__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:6956:1: rule__Designer__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Designer__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6960:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:6961:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:6961:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:6962:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__DocumentationAssignment_0"


    // $ANTLR start "rule__Designer__NameAssignment_2"
    // InternalSiriusTextDsl.g:6971:1: rule__Designer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Designer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6975:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:6976:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:6976:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:6977:1: RULE_ID
            {
             before(grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__NameAssignment_2"


    // $ANTLR start "rule__Designer__LabelAssignment_3_1"
    // InternalSiriusTextDsl.g:6986:1: rule__Designer__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Designer__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6990:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:6991:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:6991:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:6992:1: RULE_STRING
            {
             before(grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__LabelAssignment_3_1"


    // $ANTLR start "rule__Designer__ViewpointsAssignment_5"
    // InternalSiriusTextDsl.g:7001:1: rule__Designer__ViewpointsAssignment_5 : ( ruleViewpoint ) ;
    public final void rule__Designer__ViewpointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7005:1: ( ( ruleViewpoint ) )
            // InternalSiriusTextDsl.g:7006:1: ( ruleViewpoint )
            {
            // InternalSiriusTextDsl.g:7006:1: ( ruleViewpoint )
            // InternalSiriusTextDsl.g:7007:1: ruleViewpoint
            {
             before(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleViewpoint();

            state._fsp--;

             after(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designer__ViewpointsAssignment_5"


    // $ANTLR start "rule__Viewpoint__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7016:1: rule__Viewpoint__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Viewpoint__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7020:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7021:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7021:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7022:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__DocumentationAssignment_0"


    // $ANTLR start "rule__Viewpoint__NameAssignment_2"
    // InternalSiriusTextDsl.g:7031:1: rule__Viewpoint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7035:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7036:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7036:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7037:1: RULE_ID
            {
             before(grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__NameAssignment_2"


    // $ANTLR start "rule__Viewpoint__LabelAssignment_3_1"
    // InternalSiriusTextDsl.g:7046:1: rule__Viewpoint__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7050:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7051:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7051:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7052:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__LabelAssignment_3_1"


    // $ANTLR start "rule__Viewpoint__ModelFileExtensionsAssignment_5_3"
    // InternalSiriusTextDsl.g:7061:1: rule__Viewpoint__ModelFileExtensionsAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__ModelFileExtensionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7065:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7066:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7066:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7067:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ModelFileExtensionsAssignment_5_3"


    // $ANTLR start "rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1"
    // InternalSiriusTextDsl.g:7076:1: rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7080:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7081:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7081:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7082:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1"


    // $ANTLR start "rule__Viewpoint__IconAssignment_6_2"
    // InternalSiriusTextDsl.g:7091:1: rule__Viewpoint__IconAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__IconAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7095:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7096:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7096:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7097:1: RULE_STRING
            {
             before(grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__IconAssignment_6_2"


    // $ANTLR start "rule__Viewpoint__RepresentationsAssignment_7_3_0"
    // InternalSiriusTextDsl.g:7106:1: rule__Viewpoint__RepresentationsAssignment_7_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Viewpoint__RepresentationsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7110:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7111:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7111:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7112:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
            // InternalSiriusTextDsl.g:7113:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7114:1: ruleQualifiedName
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_0_0_1()); 

            }

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__RepresentationsAssignment_7_3_0"


    // $ANTLR start "rule__Viewpoint__RepresentationsAssignment_7_3_1_1"
    // InternalSiriusTextDsl.g:7125:1: rule__Viewpoint__RepresentationsAssignment_7_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Viewpoint__RepresentationsAssignment_7_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7129:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7130:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7130:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7131:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
            // InternalSiriusTextDsl.g:7132:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7133:1: ruleQualifiedName
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationQualifiedNameParserRuleCall_7_3_1_1_0_1()); 

            }

             after(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Viewpoint__RepresentationsAssignment_7_3_1_1"


    // $ANTLR start "rule__Diagram__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7144:1: rule__Diagram__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Diagram__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7148:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7149:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7149:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7150:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__DocumentationAssignment_0"


    // $ANTLR start "rule__Diagram__InitializedAssignment_1"
    // InternalSiriusTextDsl.g:7159:1: rule__Diagram__InitializedAssignment_1 : ( ( '@Initialized' ) ) ;
    public final void rule__Diagram__InitializedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7163:1: ( ( ( '@Initialized' ) ) )
            // InternalSiriusTextDsl.g:7164:1: ( ( '@Initialized' ) )
            {
            // InternalSiriusTextDsl.g:7164:1: ( ( '@Initialized' ) )
            // InternalSiriusTextDsl.g:7165:1: ( '@Initialized' )
            {
             before(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 
            // InternalSiriusTextDsl.g:7166:1: ( '@Initialized' )
            // InternalSiriusTextDsl.g:7167:1: '@Initialized'
            {
             before(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 

            }

             after(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__InitializedAssignment_1"


    // $ANTLR start "rule__Diagram__ShowOnStartupAssignment_2"
    // InternalSiriusTextDsl.g:7182:1: rule__Diagram__ShowOnStartupAssignment_2 : ( ( '@ShowOnStartup' ) ) ;
    public final void rule__Diagram__ShowOnStartupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7186:1: ( ( ( '@ShowOnStartup' ) ) )
            // InternalSiriusTextDsl.g:7187:1: ( ( '@ShowOnStartup' ) )
            {
            // InternalSiriusTextDsl.g:7187:1: ( ( '@ShowOnStartup' ) )
            // InternalSiriusTextDsl.g:7188:1: ( '@ShowOnStartup' )
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 
            // InternalSiriusTextDsl.g:7189:1: ( '@ShowOnStartup' )
            // InternalSiriusTextDsl.g:7190:1: '@ShowOnStartup'
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 

            }

             after(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__ShowOnStartupAssignment_2"


    // $ANTLR start "rule__Diagram__EnablePopupBarsAssignment_3"
    // InternalSiriusTextDsl.g:7205:1: rule__Diagram__EnablePopupBarsAssignment_3 : ( ( '@EnablePopupBars' ) ) ;
    public final void rule__Diagram__EnablePopupBarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7209:1: ( ( ( '@EnablePopupBars' ) ) )
            // InternalSiriusTextDsl.g:7210:1: ( ( '@EnablePopupBars' ) )
            {
            // InternalSiriusTextDsl.g:7210:1: ( ( '@EnablePopupBars' ) )
            // InternalSiriusTextDsl.g:7211:1: ( '@EnablePopupBars' )
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 
            // InternalSiriusTextDsl.g:7212:1: ( '@EnablePopupBars' )
            // InternalSiriusTextDsl.g:7213:1: '@EnablePopupBars'
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 

            }

             after(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__EnablePopupBarsAssignment_3"


    // $ANTLR start "rule__Diagram__MetamodelUrisAssignment_6"
    // InternalSiriusTextDsl.g:7228:1: rule__Diagram__MetamodelUrisAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Diagram__MetamodelUrisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7232:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7233:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7233:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7234:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__MetamodelUrisAssignment_6"


    // $ANTLR start "rule__Diagram__MetamodelUrisAssignment_7_1"
    // InternalSiriusTextDsl.g:7243:1: rule__Diagram__MetamodelUrisAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Diagram__MetamodelUrisAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7247:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7248:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7248:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7249:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__MetamodelUrisAssignment_7_1"


    // $ANTLR start "rule__Diagram__NameAssignment_10"
    // InternalSiriusTextDsl.g:7258:1: rule__Diagram__NameAssignment_10 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7262:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7263:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7263:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7264:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__NameAssignment_10"


    // $ANTLR start "rule__Diagram__LabelAssignment_11_1"
    // InternalSiriusTextDsl.g:7273:1: rule__Diagram__LabelAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__Diagram__LabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7277:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7278:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7278:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7279:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__LabelAssignment_11_1"


    // $ANTLR start "rule__Diagram__DomainClassAssignment_13"
    // InternalSiriusTextDsl.g:7288:1: rule__Diagram__DomainClassAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Diagram__DomainClassAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7292:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7293:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7293:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7294:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__DomainClassAssignment_13"


    // $ANTLR start "rule__Diagram__PreconditionAssignment_14_1"
    // InternalSiriusTextDsl.g:7303:1: rule__Diagram__PreconditionAssignment_14_1 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__PreconditionAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7307:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7308:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7308:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7309:1: RULE_EXPRESSION
            {
             before(grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__PreconditionAssignment_14_1"


    // $ANTLR start "rule__Diagram__EndUserDocumentationAssignment_16_2"
    // InternalSiriusTextDsl.g:7318:1: rule__Diagram__EndUserDocumentationAssignment_16_2 : ( RULE_STRING ) ;
    public final void rule__Diagram__EndUserDocumentationAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7322:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7323:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7323:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7324:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__EndUserDocumentationAssignment_16_2"


    // $ANTLR start "rule__Diagram__TitleExpressionAssignment_17_2"
    // InternalSiriusTextDsl.g:7333:1: rule__Diagram__TitleExpressionAssignment_17_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__TitleExpressionAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7337:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7338:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7338:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7339:1: RULE_EXPRESSION
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__TitleExpressionAssignment_17_2"


    // $ANTLR start "rule__Diagram__RootExpressionAssignment_18_2"
    // InternalSiriusTextDsl.g:7348:1: rule__Diagram__RootExpressionAssignment_18_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__RootExpressionAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7352:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7353:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7353:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7354:1: RULE_EXPRESSION
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__RootExpressionAssignment_18_2"


    // $ANTLR start "rule__Diagram__DefaultLayerAssignment_19_2"
    // InternalSiriusTextDsl.g:7363:1: rule__Diagram__DefaultLayerAssignment_19_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__DefaultLayerAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7367:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7368:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7368:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7369:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
            // InternalSiriusTextDsl.g:7370:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7371:1: ruleQualifiedName
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerLayerQualifiedNameParserRuleCall_19_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getDefaultLayerLayerQualifiedNameParserRuleCall_19_2_0_1()); 

            }

             after(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__DefaultLayerAssignment_19_2"


    // $ANTLR start "rule__Diagram__AdditionalLayersAssignment_20_3_0"
    // InternalSiriusTextDsl.g:7382:1: rule__Diagram__AdditionalLayersAssignment_20_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__AdditionalLayersAssignment_20_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7386:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7387:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7387:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7388:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 
            // InternalSiriusTextDsl.g:7389:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7390:1: ruleQualifiedName
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_0_0_1()); 

            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__AdditionalLayersAssignment_20_3_0"


    // $ANTLR start "rule__Diagram__AdditionalLayersAssignment_20_3_1_1"
    // InternalSiriusTextDsl.g:7401:1: rule__Diagram__AdditionalLayersAssignment_20_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__AdditionalLayersAssignment_20_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7405:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7406:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7406:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7407:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 
            // InternalSiriusTextDsl.g:7408:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7409:1: ruleQualifiedName
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerQualifiedNameParserRuleCall_20_3_1_1_0_1()); 

            }

             after(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__AdditionalLayersAssignment_20_3_1_1"


    // $ANTLR start "rule__Layer__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7420:1: rule__Layer__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Layer__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7424:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7425:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7425:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7426:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__DocumentationAssignment_0"


    // $ANTLR start "rule__Layer__NameAssignment_2"
    // InternalSiriusTextDsl.g:7435:1: rule__Layer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7439:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7440:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7440:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7441:1: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_2"


    // $ANTLR start "rule__Layer__IconAssignment_4_2"
    // InternalSiriusTextDsl.g:7450:1: rule__Layer__IconAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Layer__IconAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7454:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7455:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7455:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7456:1: RULE_STRING
            {
             before(grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__IconAssignment_4_2"


    // $ANTLR start "rule__Layer__MappingsAssignment_8_0"
    // InternalSiriusTextDsl.g:7465:1: rule__Layer__MappingsAssignment_8_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__MappingsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7469:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7470:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7470:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7471:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 
            // InternalSiriusTextDsl.g:7472:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7473:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_0_0_1()); 

            }

             after(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__MappingsAssignment_8_0"


    // $ANTLR start "rule__Layer__MappingsAssignment_8_1_1"
    // InternalSiriusTextDsl.g:7484:1: rule__Layer__MappingsAssignment_8_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__MappingsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7488:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7489:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7489:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7490:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 
            // InternalSiriusTextDsl.g:7491:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7492:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getMappingsMappingQualifiedNameParserRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__MappingsAssignment_8_1_1"


    // $ANTLR start "rule__Container__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7503:1: rule__Container__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Container__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7507:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7508:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7508:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7509:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__DocumentationAssignment_0"


    // $ANTLR start "rule__Container__ListAssignment_1"
    // InternalSiriusTextDsl.g:7518:1: rule__Container__ListAssignment_1 : ( ( 'list' ) ) ;
    public final void rule__Container__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7522:1: ( ( ( 'list' ) ) )
            // InternalSiriusTextDsl.g:7523:1: ( ( 'list' ) )
            {
            // InternalSiriusTextDsl.g:7523:1: ( ( 'list' ) )
            // InternalSiriusTextDsl.g:7524:1: ( 'list' )
            {
             before(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 
            // InternalSiriusTextDsl.g:7525:1: ( 'list' )
            // InternalSiriusTextDsl.g:7526:1: 'list'
            {
             before(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 

            }

             after(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ListAssignment_1"


    // $ANTLR start "rule__Container__NameAssignment_3"
    // InternalSiriusTextDsl.g:7541:1: rule__Container__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7545:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7546:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7546:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7547:1: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_3"


    // $ANTLR start "rule__Container__LabelAssignment_4_1"
    // InternalSiriusTextDsl.g:7556:1: rule__Container__LabelAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Container__LabelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7560:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7561:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7561:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7562:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__LabelAssignment_4_1"


    // $ANTLR start "rule__Container__DomainClassAssignment_6"
    // InternalSiriusTextDsl.g:7571:1: rule__Container__DomainClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Container__DomainClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7575:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7576:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7576:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7577:1: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__DomainClassAssignment_6"


    // $ANTLR start "rule__Container__StyleAssignment_8"
    // InternalSiriusTextDsl.g:7586:1: rule__Container__StyleAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Container__StyleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7590:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7591:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7591:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7592:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            // InternalSiriusTextDsl.g:7593:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7594:1: ruleQualifiedName
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleQualifiedNameParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getStyleContainerStyleQualifiedNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__StyleAssignment_8"


    // $ANTLR start "rule__Container__PreconditionAssignment_9_1"
    // InternalSiriusTextDsl.g:7605:1: rule__Container__PreconditionAssignment_9_1 : ( RULE_EXPRESSION ) ;
    public final void rule__Container__PreconditionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7609:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7610:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7610:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7611:1: RULE_EXPRESSION
            {
             before(grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__PreconditionAssignment_9_1"


    // $ANTLR start "rule__Container__SemanticCanditatesExpressionAssignment_11_2"
    // InternalSiriusTextDsl.g:7620:1: rule__Container__SemanticCanditatesExpressionAssignment_11_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Container__SemanticCanditatesExpressionAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7624:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7625:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7625:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7626:1: RULE_EXPRESSION
            {
             before(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__SemanticCanditatesExpressionAssignment_11_2"


    // $ANTLR start "rule__Container__ConditionalStylesAssignment_12"
    // InternalSiriusTextDsl.g:7635:1: rule__Container__ConditionalStylesAssignment_12 : ( ruleConditionalContainerStyleDeclaration ) ;
    public final void rule__Container__ConditionalStylesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7639:1: ( ( ruleConditionalContainerStyleDeclaration ) )
            // InternalSiriusTextDsl.g:7640:1: ( ruleConditionalContainerStyleDeclaration )
            {
            // InternalSiriusTextDsl.g:7640:1: ( ruleConditionalContainerStyleDeclaration )
            // InternalSiriusTextDsl.g:7641:1: ruleConditionalContainerStyleDeclaration
            {
             before(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ConditionalStylesAssignment_12"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__StyleAssignment_1"
    // InternalSiriusTextDsl.g:7650:1: rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__StyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7654:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7655:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7655:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7656:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            // InternalSiriusTextDsl.g:7657:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7658:1: ruleQualifiedName
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__StyleAssignment_1"


    // $ANTLR start "rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3"
    // InternalSiriusTextDsl.g:7669:1: rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 : ( RULE_EXPRESSION ) ;
    public final void rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7673:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7674:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7674:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7675:1: RULE_EXPRESSION
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3"


    // $ANTLR start "rule__Gradient__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7684:1: rule__Gradient__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Gradient__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7688:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7689:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7689:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7690:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__DocumentationAssignment_0"


    // $ANTLR start "rule__Gradient__DirectionAssignment_2"
    // InternalSiriusTextDsl.g:7699:1: rule__Gradient__DirectionAssignment_2 : ( ruleGradientDirection ) ;
    public final void rule__Gradient__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7703:1: ( ( ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:7704:1: ( ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:7704:1: ( ruleGradientDirection )
            // InternalSiriusTextDsl.g:7705:1: ruleGradientDirection
            {
             before(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGradientDirection();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__DirectionAssignment_2"


    // $ANTLR start "rule__Gradient__NameAssignment_3"
    // InternalSiriusTextDsl.g:7714:1: rule__Gradient__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Gradient__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7718:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7719:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7719:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7720:1: RULE_ID
            {
             before(grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__NameAssignment_3"


    // $ANTLR start "rule__Gradient__BackgroundColorAssignment_5"
    // InternalSiriusTextDsl.g:7729:1: rule__Gradient__BackgroundColorAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__BackgroundColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7733:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7734:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7734:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7735:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            // InternalSiriusTextDsl.g:7736:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7737:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorColorQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getBackgroundColorColorQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__BackgroundColorAssignment_5"


    // $ANTLR start "rule__Gradient__ForegroundColorAssignment_7"
    // InternalSiriusTextDsl.g:7748:1: rule__Gradient__ForegroundColorAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__ForegroundColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7752:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7753:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7753:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7754:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            // InternalSiriusTextDsl.g:7755:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7756:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getForegroundColorColorQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getForegroundColorColorQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__ForegroundColorAssignment_7"


    // $ANTLR start "rule__Gradient__PositionAssignment_9_1"
    // InternalSiriusTextDsl.g:7767:1: rule__Gradient__PositionAssignment_9_1 : ( ruleLabelPosition ) ;
    public final void rule__Gradient__PositionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7771:1: ( ( ruleLabelPosition ) )
            // InternalSiriusTextDsl.g:7772:1: ( ruleLabelPosition )
            {
            // InternalSiriusTextDsl.g:7772:1: ( ruleLabelPosition )
            // InternalSiriusTextDsl.g:7773:1: ruleLabelPosition
            {
             before(grammarAccess.getGradientAccess().getPositionLabelPositionEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelPosition();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getPositionLabelPositionEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__PositionAssignment_9_1"


    // $ANTLR start "rule__Gradient__LabelExpressionAssignment_9_2"
    // InternalSiriusTextDsl.g:7782:1: rule__Gradient__LabelExpressionAssignment_9_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__LabelExpressionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7786:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7787:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7787:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7788:1: RULE_EXPRESSION
            {
             before(grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__LabelExpressionAssignment_9_2"


    // $ANTLR start "rule__Gradient__LabelColorAssignment_9_4"
    // InternalSiriusTextDsl.g:7797:1: rule__Gradient__LabelColorAssignment_9_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__LabelColorAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7801:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7802:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7802:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7803:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
            // InternalSiriusTextDsl.g:7804:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7805:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getLabelColorColorQualifiedNameParserRuleCall_9_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getLabelColorColorQualifiedNameParserRuleCall_9_4_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__LabelColorAssignment_9_4"


    // $ANTLR start "rule__Gradient__BorderSizeAssignment_10_3"
    // InternalSiriusTextDsl.g:7816:1: rule__Gradient__BorderSizeAssignment_10_3 : ( RULE_INT ) ;
    public final void rule__Gradient__BorderSizeAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7820:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:7821:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:7821:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:7822:1: RULE_INT
            {
             before(grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__BorderSizeAssignment_10_3"


    // $ANTLR start "rule__Gradient__BorderColorAssignment_10_5"
    // InternalSiriusTextDsl.g:7831:1: rule__Gradient__BorderColorAssignment_10_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__BorderColorAssignment_10_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7835:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7836:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7836:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7837:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
            // InternalSiriusTextDsl.g:7838:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7839:1: ruleQualifiedName
            {
             before(grammarAccess.getGradientAccess().getBorderColorColorQualifiedNameParserRuleCall_10_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getBorderColorColorQualifiedNameParserRuleCall_10_5_0_1()); 

            }

             after(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__BorderColorAssignment_10_5"


    // $ANTLR start "rule__Gradient__IconAssignment_11_2"
    // InternalSiriusTextDsl.g:7850:1: rule__Gradient__IconAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Gradient__IconAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7854:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7855:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7855:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7856:1: RULE_STRING
            {
             before(grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__IconAssignment_11_2"


    // $ANTLR start "rule__Gradient__HeightAssignment_12_2"
    // InternalSiriusTextDsl.g:7865:1: rule__Gradient__HeightAssignment_12_2 : ( RULE_INT ) ;
    public final void rule__Gradient__HeightAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7869:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:7870:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:7870:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:7871:1: RULE_INT
            {
             before(grammarAccess.getGradientAccess().getHeightINTTerminalRuleCall_12_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getHeightINTTerminalRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__HeightAssignment_12_2"


    // $ANTLR start "rule__Gradient__WidthAssignment_13_2"
    // InternalSiriusTextDsl.g:7880:1: rule__Gradient__WidthAssignment_13_2 : ( RULE_INT ) ;
    public final void rule__Gradient__WidthAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7884:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:7885:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:7885:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:7886:1: RULE_INT
            {
             before(grammarAccess.getGradientAccess().getWidthINTTerminalRuleCall_13_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getWidthINTTerminalRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__WidthAssignment_13_2"


    // $ANTLR start "rule__Palette__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7895:1: rule__Palette__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Palette__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7899:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7900:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7900:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7901:1: RULE_DOCUMENTATION
            {
             before(grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__DocumentationAssignment_0"


    // $ANTLR start "rule__Palette__NameAssignment_2"
    // InternalSiriusTextDsl.g:7910:1: rule__Palette__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Palette__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7914:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7915:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7915:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7916:1: RULE_ID
            {
             before(grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__NameAssignment_2"


    // $ANTLR start "rule__Palette__ColorsAssignment_4"
    // InternalSiriusTextDsl.g:7925:1: rule__Palette__ColorsAssignment_4 : ( ruleColor ) ;
    public final void rule__Palette__ColorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7929:1: ( ( ruleColor ) )
            // InternalSiriusTextDsl.g:7930:1: ( ruleColor )
            {
            // InternalSiriusTextDsl.g:7930:1: ( ruleColor )
            // InternalSiriusTextDsl.g:7931:1: ruleColor
            {
             before(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Palette__ColorsAssignment_4"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // InternalSiriusTextDsl.g:7940:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7944:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7945:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7945:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7946:1: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__ValueAssignment_3"
    // InternalSiriusTextDsl.g:7955:1: rule__Color__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Color__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7959:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7960:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7960:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7961:1: RULE_STRING
            {
             before(grammarAccess.getColorAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xE804480100180020L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C2400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xE000000100000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007C000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001800000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x06A0000040400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000002L});

}