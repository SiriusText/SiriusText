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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCUMENTATION", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_WS", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'{'", "'}'", "'as'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "']'", "','", "'icon'", "'representations'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'container'", "'style'", "'semanticCandidatesExpression'", "'if'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'heightComputationExpression'", "'widthComputationExpression'", "'palette'", "'color'", "'rgb('", "')'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'list'"
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
    public static final int T__66=66;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleColorValue"
    // InternalSiriusTextDsl.g:564:1: entryRuleColorValue : ruleColorValue EOF ;
    public final void entryRuleColorValue() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:565:1: ( ruleColorValue EOF )
            // InternalSiriusTextDsl.g:566:1: ruleColorValue EOF
            {
             before(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorValueRule()); 
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
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalSiriusTextDsl.g:573:1: ruleColorValue : ( ruleRGB ) ;
    public final void ruleColorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:577:2: ( ( ruleRGB ) )
            // InternalSiriusTextDsl.g:578:1: ( ruleRGB )
            {
            // InternalSiriusTextDsl.g:578:1: ( ruleRGB )
            // InternalSiriusTextDsl.g:579:1: ruleRGB
            {
             before(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleRGB"
    // InternalSiriusTextDsl.g:592:1: entryRuleRGB : ruleRGB EOF ;
    public final void entryRuleRGB() throws RecognitionException {
        try {
            // InternalSiriusTextDsl.g:593:1: ( ruleRGB EOF )
            // InternalSiriusTextDsl.g:594:1: ruleRGB EOF
            {
             before(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getRGBRule()); 
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
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalSiriusTextDsl.g:601:1: ruleRGB : ( ( rule__RGB__Group__0 ) ) ;
    public final void ruleRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:605:2: ( ( ( rule__RGB__Group__0 ) ) )
            // InternalSiriusTextDsl.g:606:1: ( ( rule__RGB__Group__0 ) )
            {
            // InternalSiriusTextDsl.g:606:1: ( ( rule__RGB__Group__0 ) )
            // InternalSiriusTextDsl.g:607:1: ( rule__RGB__Group__0 )
            {
             before(grammarAccess.getRGBAccess().getGroup()); 
            // InternalSiriusTextDsl.g:608:1: ( rule__RGB__Group__0 )
            // InternalSiriusTextDsl.g:608:2: rule__RGB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RGB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "ruleLabelAlignment"
    // InternalSiriusTextDsl.g:621:1: ruleLabelAlignment : ( ( rule__LabelAlignment__Alternatives ) ) ;
    public final void ruleLabelAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:625:1: ( ( ( rule__LabelAlignment__Alternatives ) ) )
            // InternalSiriusTextDsl.g:626:1: ( ( rule__LabelAlignment__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:626:1: ( ( rule__LabelAlignment__Alternatives ) )
            // InternalSiriusTextDsl.g:627:1: ( rule__LabelAlignment__Alternatives )
            {
             before(grammarAccess.getLabelAlignmentAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:628:1: ( rule__LabelAlignment__Alternatives )
            // InternalSiriusTextDsl.g:628:2: rule__LabelAlignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LabelAlignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelAlignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:640:1: ruleGradientDirection : ( ( rule__GradientDirection__Alternatives ) ) ;
    public final void ruleGradientDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:644:1: ( ( ( rule__GradientDirection__Alternatives ) ) )
            // InternalSiriusTextDsl.g:645:1: ( ( rule__GradientDirection__Alternatives ) )
            {
            // InternalSiriusTextDsl.g:645:1: ( ( rule__GradientDirection__Alternatives ) )
            // InternalSiriusTextDsl.g:646:1: ( rule__GradientDirection__Alternatives )
            {
             before(grammarAccess.getGradientDirectionAccess().getAlternatives()); 
            // InternalSiriusTextDsl.g:647:1: ( rule__GradientDirection__Alternatives )
            // InternalSiriusTextDsl.g:647:2: rule__GradientDirection__Alternatives
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
    // InternalSiriusTextDsl.g:658:1: rule__SiriusFileBody__Alternatives : ( ( ruleDesigner ) | ( ruleRepresentation ) | ( ruleLayer ) | ( ruleMapping ) | ( ruleStyle ) | ( rulePalette ) );
    public final void rule__SiriusFileBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:662:1: ( ( ruleDesigner ) | ( ruleRepresentation ) | ( ruleLayer ) | ( ruleMapping ) | ( ruleStyle ) | ( rulePalette ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 59:
                    {
                    alt1=6;
                    }
                    break;
                case 50:
                    {
                    alt1=5;
                    }
                    break;
                case 46:
                case 66:
                    {
                    alt1=4;
                    }
                    break;
                case 20:
                    {
                    alt1=1;
                    }
                    break;
                case 32:
                case 63:
                case 64:
                case 65:
                    {
                    alt1=2;
                    }
                    break;
                case 43:
                    {
                    alt1=3;
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
            case 63:
            case 64:
            case 65:
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
            case 66:
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
                    // InternalSiriusTextDsl.g:663:1: ( ruleDesigner )
                    {
                    // InternalSiriusTextDsl.g:663:1: ( ruleDesigner )
                    // InternalSiriusTextDsl.g:664:1: ruleDesigner
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
                    // InternalSiriusTextDsl.g:669:6: ( ruleRepresentation )
                    {
                    // InternalSiriusTextDsl.g:669:6: ( ruleRepresentation )
                    // InternalSiriusTextDsl.g:670:1: ruleRepresentation
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
                    // InternalSiriusTextDsl.g:675:6: ( ruleLayer )
                    {
                    // InternalSiriusTextDsl.g:675:6: ( ruleLayer )
                    // InternalSiriusTextDsl.g:676:1: ruleLayer
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
                    // InternalSiriusTextDsl.g:681:6: ( ruleMapping )
                    {
                    // InternalSiriusTextDsl.g:681:6: ( ruleMapping )
                    // InternalSiriusTextDsl.g:682:1: ruleMapping
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
                    // InternalSiriusTextDsl.g:687:6: ( ruleStyle )
                    {
                    // InternalSiriusTextDsl.g:687:6: ( ruleStyle )
                    // InternalSiriusTextDsl.g:688:1: ruleStyle
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
                    // InternalSiriusTextDsl.g:693:6: ( rulePalette )
                    {
                    // InternalSiriusTextDsl.g:693:6: ( rulePalette )
                    // InternalSiriusTextDsl.g:694:1: rulePalette
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


    // $ANTLR start "rule__LabelAlignment__Alternatives"
    // InternalSiriusTextDsl.g:704:1: rule__LabelAlignment__Alternatives : ( ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'right' ) ) );
    public final void rule__LabelAlignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:708:1: ( ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'right' ) ) )
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
                    // InternalSiriusTextDsl.g:709:1: ( ( 'left' ) )
                    {
                    // InternalSiriusTextDsl.g:709:1: ( ( 'left' ) )
                    // InternalSiriusTextDsl.g:710:1: ( 'left' )
                    {
                     before(grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:711:1: ( 'left' )
                    // InternalSiriusTextDsl.g:711:3: 'left'
                    {
                    match(input,10,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:716:6: ( ( 'center' ) )
                    {
                    // InternalSiriusTextDsl.g:716:6: ( ( 'center' ) )
                    // InternalSiriusTextDsl.g:717:1: ( 'center' )
                    {
                     before(grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:718:1: ( 'center' )
                    // InternalSiriusTextDsl.g:718:3: 'center'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:723:6: ( ( 'right' ) )
                    {
                    // InternalSiriusTextDsl.g:723:6: ( ( 'right' ) )
                    // InternalSiriusTextDsl.g:724:1: ( 'right' )
                    {
                     before(grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:725:1: ( 'right' )
                    // InternalSiriusTextDsl.g:725:3: 'right'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__LabelAlignment__Alternatives"


    // $ANTLR start "rule__GradientDirection__Alternatives"
    // InternalSiriusTextDsl.g:735:1: rule__GradientDirection__Alternatives : ( ( ( 'oblique' ) ) | ( ( 'lefttoright' ) ) | ( ( 'toptobottom' ) ) );
    public final void rule__GradientDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:739:1: ( ( ( 'oblique' ) ) | ( ( 'lefttoright' ) ) | ( ( 'toptobottom' ) ) )
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
                    // InternalSiriusTextDsl.g:740:1: ( ( 'oblique' ) )
                    {
                    // InternalSiriusTextDsl.g:740:1: ( ( 'oblique' ) )
                    // InternalSiriusTextDsl.g:741:1: ( 'oblique' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                    // InternalSiriusTextDsl.g:742:1: ( 'oblique' )
                    // InternalSiriusTextDsl.g:742:3: 'oblique'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:747:6: ( ( 'lefttoright' ) )
                    {
                    // InternalSiriusTextDsl.g:747:6: ( ( 'lefttoright' ) )
                    // InternalSiriusTextDsl.g:748:1: ( 'lefttoright' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                    // InternalSiriusTextDsl.g:749:1: ( 'lefttoright' )
                    // InternalSiriusTextDsl.g:749:3: 'lefttoright'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:754:6: ( ( 'toptobottom' ) )
                    {
                    // InternalSiriusTextDsl.g:754:6: ( ( 'toptobottom' ) )
                    // InternalSiriusTextDsl.g:755:1: ( 'toptobottom' )
                    {
                     before(grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                    // InternalSiriusTextDsl.g:756:1: ( 'toptobottom' )
                    // InternalSiriusTextDsl.g:756:3: 'toptobottom'
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
    // InternalSiriusTextDsl.g:768:1: rule__SiriusFile__Group__0 : rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1 ;
    public final void rule__SiriusFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:772:1: ( rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1 )
            // InternalSiriusTextDsl.g:773:2: rule__SiriusFile__Group__0__Impl rule__SiriusFile__Group__1
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
    // InternalSiriusTextDsl.g:780:1: rule__SiriusFile__Group__0__Impl : ( ( rule__SiriusFile__DocumentationAssignment_0 )? ) ;
    public final void rule__SiriusFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:784:1: ( ( ( rule__SiriusFile__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:785:1: ( ( rule__SiriusFile__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:785:1: ( ( rule__SiriusFile__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:786:1: ( rule__SiriusFile__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getSiriusFileAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:787:1: ( rule__SiriusFile__DocumentationAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOCUMENTATION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSiriusTextDsl.g:787:2: rule__SiriusFile__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:797:1: rule__SiriusFile__Group__1 : rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2 ;
    public final void rule__SiriusFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:801:1: ( rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2 )
            // InternalSiriusTextDsl.g:802:2: rule__SiriusFile__Group__1__Impl rule__SiriusFile__Group__2
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
    // InternalSiriusTextDsl.g:809:1: rule__SiriusFile__Group__1__Impl : ( 'package' ) ;
    public final void rule__SiriusFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:813:1: ( ( 'package' ) )
            // InternalSiriusTextDsl.g:814:1: ( 'package' )
            {
            // InternalSiriusTextDsl.g:814:1: ( 'package' )
            // InternalSiriusTextDsl.g:815:1: 'package'
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
    // InternalSiriusTextDsl.g:828:1: rule__SiriusFile__Group__2 : rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3 ;
    public final void rule__SiriusFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:832:1: ( rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3 )
            // InternalSiriusTextDsl.g:833:2: rule__SiriusFile__Group__2__Impl rule__SiriusFile__Group__3
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
    // InternalSiriusTextDsl.g:840:1: rule__SiriusFile__Group__2__Impl : ( ( rule__SiriusFile__NameAssignment_2 ) ) ;
    public final void rule__SiriusFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:844:1: ( ( ( rule__SiriusFile__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:845:1: ( ( rule__SiriusFile__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:845:1: ( ( rule__SiriusFile__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:846:1: ( rule__SiriusFile__NameAssignment_2 )
            {
             before(grammarAccess.getSiriusFileAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:847:1: ( rule__SiriusFile__NameAssignment_2 )
            // InternalSiriusTextDsl.g:847:2: rule__SiriusFile__NameAssignment_2
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
    // InternalSiriusTextDsl.g:857:1: rule__SiriusFile__Group__3 : rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4 ;
    public final void rule__SiriusFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:861:1: ( rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4 )
            // InternalSiriusTextDsl.g:862:2: rule__SiriusFile__Group__3__Impl rule__SiriusFile__Group__4
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
    // InternalSiriusTextDsl.g:869:1: rule__SiriusFile__Group__3__Impl : ( ( rule__SiriusFile__ImportsAssignment_3 )* ) ;
    public final void rule__SiriusFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:873:1: ( ( ( rule__SiriusFile__ImportsAssignment_3 )* ) )
            // InternalSiriusTextDsl.g:874:1: ( ( rule__SiriusFile__ImportsAssignment_3 )* )
            {
            // InternalSiriusTextDsl.g:874:1: ( ( rule__SiriusFile__ImportsAssignment_3 )* )
            // InternalSiriusTextDsl.g:875:1: ( rule__SiriusFile__ImportsAssignment_3 )*
            {
             before(grammarAccess.getSiriusFileAccess().getImportsAssignment_3()); 
            // InternalSiriusTextDsl.g:876:1: ( rule__SiriusFile__ImportsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:876:2: rule__SiriusFile__ImportsAssignment_3
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
    // InternalSiriusTextDsl.g:886:1: rule__SiriusFile__Group__4 : rule__SiriusFile__Group__4__Impl ;
    public final void rule__SiriusFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:890:1: ( rule__SiriusFile__Group__4__Impl )
            // InternalSiriusTextDsl.g:891:2: rule__SiriusFile__Group__4__Impl
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
    // InternalSiriusTextDsl.g:897:1: rule__SiriusFile__Group__4__Impl : ( ( rule__SiriusFile__BodyAssignment_4 ) ) ;
    public final void rule__SiriusFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:901:1: ( ( ( rule__SiriusFile__BodyAssignment_4 ) ) )
            // InternalSiriusTextDsl.g:902:1: ( ( rule__SiriusFile__BodyAssignment_4 ) )
            {
            // InternalSiriusTextDsl.g:902:1: ( ( rule__SiriusFile__BodyAssignment_4 ) )
            // InternalSiriusTextDsl.g:903:1: ( rule__SiriusFile__BodyAssignment_4 )
            {
             before(grammarAccess.getSiriusFileAccess().getBodyAssignment_4()); 
            // InternalSiriusTextDsl.g:904:1: ( rule__SiriusFile__BodyAssignment_4 )
            // InternalSiriusTextDsl.g:904:2: rule__SiriusFile__BodyAssignment_4
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
    // InternalSiriusTextDsl.g:924:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:928:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSiriusTextDsl.g:929:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalSiriusTextDsl.g:936:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:940:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:941:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:941:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:942:1: RULE_ID
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
    // InternalSiriusTextDsl.g:953:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:957:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSiriusTextDsl.g:958:2: rule__QualifiedName__Group__1__Impl
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
    // InternalSiriusTextDsl.g:964:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:968:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSiriusTextDsl.g:969:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSiriusTextDsl.g:969:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSiriusTextDsl.g:970:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSiriusTextDsl.g:971:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:971:2: rule__QualifiedName__Group_1__0
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
    // InternalSiriusTextDsl.g:985:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:989:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSiriusTextDsl.g:990:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalSiriusTextDsl.g:997:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1001:1: ( ( '.' ) )
            // InternalSiriusTextDsl.g:1002:1: ( '.' )
            {
            // InternalSiriusTextDsl.g:1002:1: ( '.' )
            // InternalSiriusTextDsl.g:1003:1: '.'
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
    // InternalSiriusTextDsl.g:1016:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1020:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSiriusTextDsl.g:1021:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalSiriusTextDsl.g:1027:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1031:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:1032:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:1032:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:1033:1: RULE_ID
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
    // InternalSiriusTextDsl.g:1048:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1052:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalSiriusTextDsl.g:1053:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalSiriusTextDsl.g:1060:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1064:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1065:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1065:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1066:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:1077:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1081:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalSiriusTextDsl.g:1082:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSiriusTextDsl.g:1088:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1092:1: ( ( ( '.*' )? ) )
            // InternalSiriusTextDsl.g:1093:1: ( ( '.*' )? )
            {
            // InternalSiriusTextDsl.g:1093:1: ( ( '.*' )? )
            // InternalSiriusTextDsl.g:1094:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSiriusTextDsl.g:1095:1: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:1096:2: '.*'
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
    // InternalSiriusTextDsl.g:1111:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1115:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSiriusTextDsl.g:1116:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalSiriusTextDsl.g:1123:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1127:1: ( ( 'import' ) )
            // InternalSiriusTextDsl.g:1128:1: ( 'import' )
            {
            // InternalSiriusTextDsl.g:1128:1: ( 'import' )
            // InternalSiriusTextDsl.g:1129:1: 'import'
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
    // InternalSiriusTextDsl.g:1142:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1146:1: ( rule__Import__Group__1__Impl )
            // InternalSiriusTextDsl.g:1147:2: rule__Import__Group__1__Impl
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
    // InternalSiriusTextDsl.g:1153:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1157:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:1158:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:1158:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalSiriusTextDsl.g:1159:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSiriusTextDsl.g:1160:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalSiriusTextDsl.g:1160:2: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalSiriusTextDsl.g:1174:1: rule__Designer__Group__0 : rule__Designer__Group__0__Impl rule__Designer__Group__1 ;
    public final void rule__Designer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1178:1: ( rule__Designer__Group__0__Impl rule__Designer__Group__1 )
            // InternalSiriusTextDsl.g:1179:2: rule__Designer__Group__0__Impl rule__Designer__Group__1
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
    // InternalSiriusTextDsl.g:1186:1: rule__Designer__Group__0__Impl : ( ( rule__Designer__DocumentationAssignment_0 )? ) ;
    public final void rule__Designer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1190:1: ( ( ( rule__Designer__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1191:1: ( ( rule__Designer__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1191:1: ( ( rule__Designer__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1192:1: ( rule__Designer__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getDesignerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1193:1: ( rule__Designer__DocumentationAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOCUMENTATION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSiriusTextDsl.g:1193:2: rule__Designer__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:1203:1: rule__Designer__Group__1 : rule__Designer__Group__1__Impl rule__Designer__Group__2 ;
    public final void rule__Designer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1207:1: ( rule__Designer__Group__1__Impl rule__Designer__Group__2 )
            // InternalSiriusTextDsl.g:1208:2: rule__Designer__Group__1__Impl rule__Designer__Group__2
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
    // InternalSiriusTextDsl.g:1215:1: rule__Designer__Group__1__Impl : ( 'designer' ) ;
    public final void rule__Designer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1219:1: ( ( 'designer' ) )
            // InternalSiriusTextDsl.g:1220:1: ( 'designer' )
            {
            // InternalSiriusTextDsl.g:1220:1: ( 'designer' )
            // InternalSiriusTextDsl.g:1221:1: 'designer'
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
    // InternalSiriusTextDsl.g:1234:1: rule__Designer__Group__2 : rule__Designer__Group__2__Impl rule__Designer__Group__3 ;
    public final void rule__Designer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1238:1: ( rule__Designer__Group__2__Impl rule__Designer__Group__3 )
            // InternalSiriusTextDsl.g:1239:2: rule__Designer__Group__2__Impl rule__Designer__Group__3
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
    // InternalSiriusTextDsl.g:1246:1: rule__Designer__Group__2__Impl : ( ( rule__Designer__NameAssignment_2 ) ) ;
    public final void rule__Designer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1250:1: ( ( ( rule__Designer__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1251:1: ( ( rule__Designer__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1251:1: ( ( rule__Designer__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1252:1: ( rule__Designer__NameAssignment_2 )
            {
             before(grammarAccess.getDesignerAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1253:1: ( rule__Designer__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1253:2: rule__Designer__NameAssignment_2
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
    // InternalSiriusTextDsl.g:1263:1: rule__Designer__Group__3 : rule__Designer__Group__3__Impl rule__Designer__Group__4 ;
    public final void rule__Designer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1267:1: ( rule__Designer__Group__3__Impl rule__Designer__Group__4 )
            // InternalSiriusTextDsl.g:1268:2: rule__Designer__Group__3__Impl rule__Designer__Group__4
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
    // InternalSiriusTextDsl.g:1275:1: rule__Designer__Group__3__Impl : ( ( rule__Designer__Group_3__0 )? ) ;
    public final void rule__Designer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1279:1: ( ( ( rule__Designer__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:1280:1: ( ( rule__Designer__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:1280:1: ( ( rule__Designer__Group_3__0 )? )
            // InternalSiriusTextDsl.g:1281:1: ( rule__Designer__Group_3__0 )?
            {
             before(grammarAccess.getDesignerAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:1282:1: ( rule__Designer__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:1282:2: rule__Designer__Group_3__0
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
    // InternalSiriusTextDsl.g:1292:1: rule__Designer__Group__4 : rule__Designer__Group__4__Impl rule__Designer__Group__5 ;
    public final void rule__Designer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1296:1: ( rule__Designer__Group__4__Impl rule__Designer__Group__5 )
            // InternalSiriusTextDsl.g:1297:2: rule__Designer__Group__4__Impl rule__Designer__Group__5
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
    // InternalSiriusTextDsl.g:1304:1: rule__Designer__Group__4__Impl : ( '{' ) ;
    public final void rule__Designer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1308:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:1309:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:1309:1: ( '{' )
            // InternalSiriusTextDsl.g:1310:1: '{'
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
    // InternalSiriusTextDsl.g:1323:1: rule__Designer__Group__5 : rule__Designer__Group__5__Impl rule__Designer__Group__6 ;
    public final void rule__Designer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1327:1: ( rule__Designer__Group__5__Impl rule__Designer__Group__6 )
            // InternalSiriusTextDsl.g:1328:2: rule__Designer__Group__5__Impl rule__Designer__Group__6
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
    // InternalSiriusTextDsl.g:1335:1: rule__Designer__Group__5__Impl : ( ( rule__Designer__ViewpointsAssignment_5 )* ) ;
    public final void rule__Designer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1339:1: ( ( ( rule__Designer__ViewpointsAssignment_5 )* ) )
            // InternalSiriusTextDsl.g:1340:1: ( ( rule__Designer__ViewpointsAssignment_5 )* )
            {
            // InternalSiriusTextDsl.g:1340:1: ( ( rule__Designer__ViewpointsAssignment_5 )* )
            // InternalSiriusTextDsl.g:1341:1: ( rule__Designer__ViewpointsAssignment_5 )*
            {
             before(grammarAccess.getDesignerAccess().getViewpointsAssignment_5()); 
            // InternalSiriusTextDsl.g:1342:1: ( rule__Designer__ViewpointsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOCUMENTATION||LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1342:2: rule__Designer__ViewpointsAssignment_5
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
    // InternalSiriusTextDsl.g:1352:1: rule__Designer__Group__6 : rule__Designer__Group__6__Impl ;
    public final void rule__Designer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1356:1: ( rule__Designer__Group__6__Impl )
            // InternalSiriusTextDsl.g:1357:2: rule__Designer__Group__6__Impl
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
    // InternalSiriusTextDsl.g:1363:1: rule__Designer__Group__6__Impl : ( '}' ) ;
    public final void rule__Designer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1367:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:1368:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:1368:1: ( '}' )
            // InternalSiriusTextDsl.g:1369:1: '}'
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
    // InternalSiriusTextDsl.g:1396:1: rule__Designer__Group_3__0 : rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1 ;
    public final void rule__Designer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1400:1: ( rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1 )
            // InternalSiriusTextDsl.g:1401:2: rule__Designer__Group_3__0__Impl rule__Designer__Group_3__1
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
    // InternalSiriusTextDsl.g:1408:1: rule__Designer__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Designer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1412:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:1413:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:1413:1: ( 'as' )
            // InternalSiriusTextDsl.g:1414:1: 'as'
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
    // InternalSiriusTextDsl.g:1427:1: rule__Designer__Group_3__1 : rule__Designer__Group_3__1__Impl ;
    public final void rule__Designer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1431:1: ( rule__Designer__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:1432:2: rule__Designer__Group_3__1__Impl
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
    // InternalSiriusTextDsl.g:1438:1: rule__Designer__Group_3__1__Impl : ( ( rule__Designer__LabelAssignment_3_1 ) ) ;
    public final void rule__Designer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1442:1: ( ( ( rule__Designer__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:1443:1: ( ( rule__Designer__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:1443:1: ( ( rule__Designer__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:1444:1: ( rule__Designer__LabelAssignment_3_1 )
            {
             before(grammarAccess.getDesignerAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:1445:1: ( rule__Designer__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:1445:2: rule__Designer__LabelAssignment_3_1
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
    // InternalSiriusTextDsl.g:1459:1: rule__Viewpoint__Group__0 : rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 ;
    public final void rule__Viewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1463:1: ( rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1 )
            // InternalSiriusTextDsl.g:1464:2: rule__Viewpoint__Group__0__Impl rule__Viewpoint__Group__1
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
    // InternalSiriusTextDsl.g:1471:1: rule__Viewpoint__Group__0__Impl : ( ( rule__Viewpoint__DocumentationAssignment_0 )? ) ;
    public final void rule__Viewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1475:1: ( ( ( rule__Viewpoint__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:1476:1: ( ( rule__Viewpoint__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:1476:1: ( ( rule__Viewpoint__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:1477:1: ( rule__Viewpoint__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getViewpointAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:1478:1: ( rule__Viewpoint__DocumentationAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOCUMENTATION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSiriusTextDsl.g:1478:2: rule__Viewpoint__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:1488:1: rule__Viewpoint__Group__1 : rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 ;
    public final void rule__Viewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1492:1: ( rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2 )
            // InternalSiriusTextDsl.g:1493:2: rule__Viewpoint__Group__1__Impl rule__Viewpoint__Group__2
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
    // InternalSiriusTextDsl.g:1500:1: rule__Viewpoint__Group__1__Impl : ( 'viewpoint' ) ;
    public final void rule__Viewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1504:1: ( ( 'viewpoint' ) )
            // InternalSiriusTextDsl.g:1505:1: ( 'viewpoint' )
            {
            // InternalSiriusTextDsl.g:1505:1: ( 'viewpoint' )
            // InternalSiriusTextDsl.g:1506:1: 'viewpoint'
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
    // InternalSiriusTextDsl.g:1519:1: rule__Viewpoint__Group__2 : rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 ;
    public final void rule__Viewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1523:1: ( rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3 )
            // InternalSiriusTextDsl.g:1524:2: rule__Viewpoint__Group__2__Impl rule__Viewpoint__Group__3
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
    // InternalSiriusTextDsl.g:1531:1: rule__Viewpoint__Group__2__Impl : ( ( rule__Viewpoint__NameAssignment_2 ) ) ;
    public final void rule__Viewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1535:1: ( ( ( rule__Viewpoint__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:1536:1: ( ( rule__Viewpoint__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:1536:1: ( ( rule__Viewpoint__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:1537:1: ( rule__Viewpoint__NameAssignment_2 )
            {
             before(grammarAccess.getViewpointAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:1538:1: ( rule__Viewpoint__NameAssignment_2 )
            // InternalSiriusTextDsl.g:1538:2: rule__Viewpoint__NameAssignment_2
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
    // InternalSiriusTextDsl.g:1548:1: rule__Viewpoint__Group__3 : rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 ;
    public final void rule__Viewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1552:1: ( rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4 )
            // InternalSiriusTextDsl.g:1553:2: rule__Viewpoint__Group__3__Impl rule__Viewpoint__Group__4
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
    // InternalSiriusTextDsl.g:1560:1: rule__Viewpoint__Group__3__Impl : ( ( rule__Viewpoint__Group_3__0 )? ) ;
    public final void rule__Viewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1564:1: ( ( ( rule__Viewpoint__Group_3__0 )? ) )
            // InternalSiriusTextDsl.g:1565:1: ( ( rule__Viewpoint__Group_3__0 )? )
            {
            // InternalSiriusTextDsl.g:1565:1: ( ( rule__Viewpoint__Group_3__0 )? )
            // InternalSiriusTextDsl.g:1566:1: ( rule__Viewpoint__Group_3__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_3()); 
            // InternalSiriusTextDsl.g:1567:1: ( rule__Viewpoint__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSiriusTextDsl.g:1567:2: rule__Viewpoint__Group_3__0
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
    // InternalSiriusTextDsl.g:1577:1: rule__Viewpoint__Group__4 : rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 ;
    public final void rule__Viewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1581:1: ( rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5 )
            // InternalSiriusTextDsl.g:1582:2: rule__Viewpoint__Group__4__Impl rule__Viewpoint__Group__5
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
    // InternalSiriusTextDsl.g:1589:1: rule__Viewpoint__Group__4__Impl : ( '{' ) ;
    public final void rule__Viewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1593:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:1594:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:1594:1: ( '{' )
            // InternalSiriusTextDsl.g:1595:1: '{'
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
    // InternalSiriusTextDsl.g:1608:1: rule__Viewpoint__Group__5 : rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 ;
    public final void rule__Viewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1612:1: ( rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6 )
            // InternalSiriusTextDsl.g:1613:2: rule__Viewpoint__Group__5__Impl rule__Viewpoint__Group__6
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
    // InternalSiriusTextDsl.g:1620:1: rule__Viewpoint__Group__5__Impl : ( ( rule__Viewpoint__Group_5__0 )? ) ;
    public final void rule__Viewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1624:1: ( ( ( rule__Viewpoint__Group_5__0 )? ) )
            // InternalSiriusTextDsl.g:1625:1: ( ( rule__Viewpoint__Group_5__0 )? )
            {
            // InternalSiriusTextDsl.g:1625:1: ( ( rule__Viewpoint__Group_5__0 )? )
            // InternalSiriusTextDsl.g:1626:1: ( rule__Viewpoint__Group_5__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_5()); 
            // InternalSiriusTextDsl.g:1627:1: ( rule__Viewpoint__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:1627:2: rule__Viewpoint__Group_5__0
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
    // InternalSiriusTextDsl.g:1637:1: rule__Viewpoint__Group__6 : rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 ;
    public final void rule__Viewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1641:1: ( rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7 )
            // InternalSiriusTextDsl.g:1642:2: rule__Viewpoint__Group__6__Impl rule__Viewpoint__Group__7
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
    // InternalSiriusTextDsl.g:1649:1: rule__Viewpoint__Group__6__Impl : ( ( rule__Viewpoint__Group_6__0 )? ) ;
    public final void rule__Viewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1653:1: ( ( ( rule__Viewpoint__Group_6__0 )? ) )
            // InternalSiriusTextDsl.g:1654:1: ( ( rule__Viewpoint__Group_6__0 )? )
            {
            // InternalSiriusTextDsl.g:1654:1: ( ( rule__Viewpoint__Group_6__0 )? )
            // InternalSiriusTextDsl.g:1655:1: ( rule__Viewpoint__Group_6__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_6()); 
            // InternalSiriusTextDsl.g:1656:1: ( rule__Viewpoint__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSiriusTextDsl.g:1656:2: rule__Viewpoint__Group_6__0
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
    // InternalSiriusTextDsl.g:1666:1: rule__Viewpoint__Group__7 : rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 ;
    public final void rule__Viewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1670:1: ( rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8 )
            // InternalSiriusTextDsl.g:1671:2: rule__Viewpoint__Group__7__Impl rule__Viewpoint__Group__8
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
    // InternalSiriusTextDsl.g:1678:1: rule__Viewpoint__Group__7__Impl : ( ( rule__Viewpoint__Group_7__0 )? ) ;
    public final void rule__Viewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1682:1: ( ( ( rule__Viewpoint__Group_7__0 )? ) )
            // InternalSiriusTextDsl.g:1683:1: ( ( rule__Viewpoint__Group_7__0 )? )
            {
            // InternalSiriusTextDsl.g:1683:1: ( ( rule__Viewpoint__Group_7__0 )? )
            // InternalSiriusTextDsl.g:1684:1: ( rule__Viewpoint__Group_7__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:1685:1: ( rule__Viewpoint__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSiriusTextDsl.g:1685:2: rule__Viewpoint__Group_7__0
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
    // InternalSiriusTextDsl.g:1695:1: rule__Viewpoint__Group__8 : rule__Viewpoint__Group__8__Impl ;
    public final void rule__Viewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1699:1: ( rule__Viewpoint__Group__8__Impl )
            // InternalSiriusTextDsl.g:1700:2: rule__Viewpoint__Group__8__Impl
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
    // InternalSiriusTextDsl.g:1706:1: rule__Viewpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__Viewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1710:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:1711:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:1711:1: ( '}' )
            // InternalSiriusTextDsl.g:1712:1: '}'
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
    // InternalSiriusTextDsl.g:1743:1: rule__Viewpoint__Group_3__0 : rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1 ;
    public final void rule__Viewpoint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1747:1: ( rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1 )
            // InternalSiriusTextDsl.g:1748:2: rule__Viewpoint__Group_3__0__Impl rule__Viewpoint__Group_3__1
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
    // InternalSiriusTextDsl.g:1755:1: rule__Viewpoint__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Viewpoint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1759:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:1760:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:1760:1: ( 'as' )
            // InternalSiriusTextDsl.g:1761:1: 'as'
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
    // InternalSiriusTextDsl.g:1774:1: rule__Viewpoint__Group_3__1 : rule__Viewpoint__Group_3__1__Impl ;
    public final void rule__Viewpoint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1778:1: ( rule__Viewpoint__Group_3__1__Impl )
            // InternalSiriusTextDsl.g:1779:2: rule__Viewpoint__Group_3__1__Impl
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
    // InternalSiriusTextDsl.g:1785:1: rule__Viewpoint__Group_3__1__Impl : ( ( rule__Viewpoint__LabelAssignment_3_1 ) ) ;
    public final void rule__Viewpoint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1789:1: ( ( ( rule__Viewpoint__LabelAssignment_3_1 ) ) )
            // InternalSiriusTextDsl.g:1790:1: ( ( rule__Viewpoint__LabelAssignment_3_1 ) )
            {
            // InternalSiriusTextDsl.g:1790:1: ( ( rule__Viewpoint__LabelAssignment_3_1 ) )
            // InternalSiriusTextDsl.g:1791:1: ( rule__Viewpoint__LabelAssignment_3_1 )
            {
             before(grammarAccess.getViewpointAccess().getLabelAssignment_3_1()); 
            // InternalSiriusTextDsl.g:1792:1: ( rule__Viewpoint__LabelAssignment_3_1 )
            // InternalSiriusTextDsl.g:1792:2: rule__Viewpoint__LabelAssignment_3_1
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
    // InternalSiriusTextDsl.g:1806:1: rule__Viewpoint__Group_5__0 : rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 ;
    public final void rule__Viewpoint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1810:1: ( rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1 )
            // InternalSiriusTextDsl.g:1811:2: rule__Viewpoint__Group_5__0__Impl rule__Viewpoint__Group_5__1
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
    // InternalSiriusTextDsl.g:1818:1: rule__Viewpoint__Group_5__0__Impl : ( 'modelFileExtensions' ) ;
    public final void rule__Viewpoint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1822:1: ( ( 'modelFileExtensions' ) )
            // InternalSiriusTextDsl.g:1823:1: ( 'modelFileExtensions' )
            {
            // InternalSiriusTextDsl.g:1823:1: ( 'modelFileExtensions' )
            // InternalSiriusTextDsl.g:1824:1: 'modelFileExtensions'
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
    // InternalSiriusTextDsl.g:1837:1: rule__Viewpoint__Group_5__1 : rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2 ;
    public final void rule__Viewpoint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1841:1: ( rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2 )
            // InternalSiriusTextDsl.g:1842:2: rule__Viewpoint__Group_5__1__Impl rule__Viewpoint__Group_5__2
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
    // InternalSiriusTextDsl.g:1849:1: rule__Viewpoint__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1853:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:1854:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:1854:1: ( '=' )
            // InternalSiriusTextDsl.g:1855:1: '='
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
    // InternalSiriusTextDsl.g:1868:1: rule__Viewpoint__Group_5__2 : rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3 ;
    public final void rule__Viewpoint__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1872:1: ( rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3 )
            // InternalSiriusTextDsl.g:1873:2: rule__Viewpoint__Group_5__2__Impl rule__Viewpoint__Group_5__3
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
    // InternalSiriusTextDsl.g:1880:1: rule__Viewpoint__Group_5__2__Impl : ( '[' ) ;
    public final void rule__Viewpoint__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1884:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:1885:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:1885:1: ( '[' )
            // InternalSiriusTextDsl.g:1886:1: '['
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
    // InternalSiriusTextDsl.g:1899:1: rule__Viewpoint__Group_5__3 : rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4 ;
    public final void rule__Viewpoint__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1903:1: ( rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4 )
            // InternalSiriusTextDsl.g:1904:2: rule__Viewpoint__Group_5__3__Impl rule__Viewpoint__Group_5__4
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
    // InternalSiriusTextDsl.g:1911:1: rule__Viewpoint__Group_5__3__Impl : ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) ) ;
    public final void rule__Viewpoint__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1915:1: ( ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) ) )
            // InternalSiriusTextDsl.g:1916:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) )
            {
            // InternalSiriusTextDsl.g:1916:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 ) )
            // InternalSiriusTextDsl.g:1917:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 )
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_3()); 
            // InternalSiriusTextDsl.g:1918:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_3 )
            // InternalSiriusTextDsl.g:1918:2: rule__Viewpoint__ModelFileExtensionsAssignment_5_3
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
    // InternalSiriusTextDsl.g:1928:1: rule__Viewpoint__Group_5__4 : rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5 ;
    public final void rule__Viewpoint__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1932:1: ( rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5 )
            // InternalSiriusTextDsl.g:1933:2: rule__Viewpoint__Group_5__4__Impl rule__Viewpoint__Group_5__5
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
    // InternalSiriusTextDsl.g:1940:1: rule__Viewpoint__Group_5__4__Impl : ( ( rule__Viewpoint__Group_5_4__0 )* ) ;
    public final void rule__Viewpoint__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1944:1: ( ( ( rule__Viewpoint__Group_5_4__0 )* ) )
            // InternalSiriusTextDsl.g:1945:1: ( ( rule__Viewpoint__Group_5_4__0 )* )
            {
            // InternalSiriusTextDsl.g:1945:1: ( ( rule__Viewpoint__Group_5_4__0 )* )
            // InternalSiriusTextDsl.g:1946:1: ( rule__Viewpoint__Group_5_4__0 )*
            {
             before(grammarAccess.getViewpointAccess().getGroup_5_4()); 
            // InternalSiriusTextDsl.g:1947:1: ( rule__Viewpoint__Group_5_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1947:2: rule__Viewpoint__Group_5_4__0
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
    // InternalSiriusTextDsl.g:1957:1: rule__Viewpoint__Group_5__5 : rule__Viewpoint__Group_5__5__Impl ;
    public final void rule__Viewpoint__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1961:1: ( rule__Viewpoint__Group_5__5__Impl )
            // InternalSiriusTextDsl.g:1962:2: rule__Viewpoint__Group_5__5__Impl
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
    // InternalSiriusTextDsl.g:1968:1: rule__Viewpoint__Group_5__5__Impl : ( ']' ) ;
    public final void rule__Viewpoint__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:1972:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:1973:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:1973:1: ( ']' )
            // InternalSiriusTextDsl.g:1974:1: ']'
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
    // InternalSiriusTextDsl.g:1999:1: rule__Viewpoint__Group_5_4__0 : rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1 ;
    public final void rule__Viewpoint__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2003:1: ( rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1 )
            // InternalSiriusTextDsl.g:2004:2: rule__Viewpoint__Group_5_4__0__Impl rule__Viewpoint__Group_5_4__1
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
    // InternalSiriusTextDsl.g:2011:1: rule__Viewpoint__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2015:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:2016:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:2016:1: ( ',' )
            // InternalSiriusTextDsl.g:2017:1: ','
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
    // InternalSiriusTextDsl.g:2030:1: rule__Viewpoint__Group_5_4__1 : rule__Viewpoint__Group_5_4__1__Impl ;
    public final void rule__Viewpoint__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2034:1: ( rule__Viewpoint__Group_5_4__1__Impl )
            // InternalSiriusTextDsl.g:2035:2: rule__Viewpoint__Group_5_4__1__Impl
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
    // InternalSiriusTextDsl.g:2041:1: rule__Viewpoint__Group_5_4__1__Impl : ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) ) ;
    public final void rule__Viewpoint__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2045:1: ( ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) ) )
            // InternalSiriusTextDsl.g:2046:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) )
            {
            // InternalSiriusTextDsl.g:2046:1: ( ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 ) )
            // InternalSiriusTextDsl.g:2047:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 )
            {
             before(grammarAccess.getViewpointAccess().getModelFileExtensionsAssignment_5_4_1()); 
            // InternalSiriusTextDsl.g:2048:1: ( rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 )
            // InternalSiriusTextDsl.g:2048:2: rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1
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
    // InternalSiriusTextDsl.g:2062:1: rule__Viewpoint__Group_6__0 : rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 ;
    public final void rule__Viewpoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2066:1: ( rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1 )
            // InternalSiriusTextDsl.g:2067:2: rule__Viewpoint__Group_6__0__Impl rule__Viewpoint__Group_6__1
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
    // InternalSiriusTextDsl.g:2074:1: rule__Viewpoint__Group_6__0__Impl : ( 'icon' ) ;
    public final void rule__Viewpoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2078:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:2079:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:2079:1: ( 'icon' )
            // InternalSiriusTextDsl.g:2080:1: 'icon'
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
    // InternalSiriusTextDsl.g:2093:1: rule__Viewpoint__Group_6__1 : rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 ;
    public final void rule__Viewpoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2097:1: ( rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2 )
            // InternalSiriusTextDsl.g:2098:2: rule__Viewpoint__Group_6__1__Impl rule__Viewpoint__Group_6__2
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
    // InternalSiriusTextDsl.g:2105:1: rule__Viewpoint__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2109:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2110:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2110:1: ( '=' )
            // InternalSiriusTextDsl.g:2111:1: '='
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
    // InternalSiriusTextDsl.g:2124:1: rule__Viewpoint__Group_6__2 : rule__Viewpoint__Group_6__2__Impl ;
    public final void rule__Viewpoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2128:1: ( rule__Viewpoint__Group_6__2__Impl )
            // InternalSiriusTextDsl.g:2129:2: rule__Viewpoint__Group_6__2__Impl
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
    // InternalSiriusTextDsl.g:2135:1: rule__Viewpoint__Group_6__2__Impl : ( ( rule__Viewpoint__IconAssignment_6_2 ) ) ;
    public final void rule__Viewpoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2139:1: ( ( ( rule__Viewpoint__IconAssignment_6_2 ) ) )
            // InternalSiriusTextDsl.g:2140:1: ( ( rule__Viewpoint__IconAssignment_6_2 ) )
            {
            // InternalSiriusTextDsl.g:2140:1: ( ( rule__Viewpoint__IconAssignment_6_2 ) )
            // InternalSiriusTextDsl.g:2141:1: ( rule__Viewpoint__IconAssignment_6_2 )
            {
             before(grammarAccess.getViewpointAccess().getIconAssignment_6_2()); 
            // InternalSiriusTextDsl.g:2142:1: ( rule__Viewpoint__IconAssignment_6_2 )
            // InternalSiriusTextDsl.g:2142:2: rule__Viewpoint__IconAssignment_6_2
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
    // InternalSiriusTextDsl.g:2158:1: rule__Viewpoint__Group_7__0 : rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 ;
    public final void rule__Viewpoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2162:1: ( rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1 )
            // InternalSiriusTextDsl.g:2163:2: rule__Viewpoint__Group_7__0__Impl rule__Viewpoint__Group_7__1
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
    // InternalSiriusTextDsl.g:2170:1: rule__Viewpoint__Group_7__0__Impl : ( 'representations' ) ;
    public final void rule__Viewpoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2174:1: ( ( 'representations' ) )
            // InternalSiriusTextDsl.g:2175:1: ( 'representations' )
            {
            // InternalSiriusTextDsl.g:2175:1: ( 'representations' )
            // InternalSiriusTextDsl.g:2176:1: 'representations'
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
    // InternalSiriusTextDsl.g:2189:1: rule__Viewpoint__Group_7__1 : rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 ;
    public final void rule__Viewpoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2193:1: ( rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2 )
            // InternalSiriusTextDsl.g:2194:2: rule__Viewpoint__Group_7__1__Impl rule__Viewpoint__Group_7__2
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
    // InternalSiriusTextDsl.g:2201:1: rule__Viewpoint__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Viewpoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2205:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:2206:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:2206:1: ( '=' )
            // InternalSiriusTextDsl.g:2207:1: '='
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
    // InternalSiriusTextDsl.g:2220:1: rule__Viewpoint__Group_7__2 : rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3 ;
    public final void rule__Viewpoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2224:1: ( rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3 )
            // InternalSiriusTextDsl.g:2225:2: rule__Viewpoint__Group_7__2__Impl rule__Viewpoint__Group_7__3
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
    // InternalSiriusTextDsl.g:2232:1: rule__Viewpoint__Group_7__2__Impl : ( '[' ) ;
    public final void rule__Viewpoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2236:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:2237:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:2237:1: ( '[' )
            // InternalSiriusTextDsl.g:2238:1: '['
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
    // InternalSiriusTextDsl.g:2251:1: rule__Viewpoint__Group_7__3 : rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4 ;
    public final void rule__Viewpoint__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2255:1: ( rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4 )
            // InternalSiriusTextDsl.g:2256:2: rule__Viewpoint__Group_7__3__Impl rule__Viewpoint__Group_7__4
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
    // InternalSiriusTextDsl.g:2263:1: rule__Viewpoint__Group_7__3__Impl : ( ( rule__Viewpoint__Group_7_3__0 )? ) ;
    public final void rule__Viewpoint__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2267:1: ( ( ( rule__Viewpoint__Group_7_3__0 )? ) )
            // InternalSiriusTextDsl.g:2268:1: ( ( rule__Viewpoint__Group_7_3__0 )? )
            {
            // InternalSiriusTextDsl.g:2268:1: ( ( rule__Viewpoint__Group_7_3__0 )? )
            // InternalSiriusTextDsl.g:2269:1: ( rule__Viewpoint__Group_7_3__0 )?
            {
             before(grammarAccess.getViewpointAccess().getGroup_7_3()); 
            // InternalSiriusTextDsl.g:2270:1: ( rule__Viewpoint__Group_7_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSiriusTextDsl.g:2270:2: rule__Viewpoint__Group_7_3__0
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
    // InternalSiriusTextDsl.g:2280:1: rule__Viewpoint__Group_7__4 : rule__Viewpoint__Group_7__4__Impl ;
    public final void rule__Viewpoint__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2284:1: ( rule__Viewpoint__Group_7__4__Impl )
            // InternalSiriusTextDsl.g:2285:2: rule__Viewpoint__Group_7__4__Impl
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
    // InternalSiriusTextDsl.g:2291:1: rule__Viewpoint__Group_7__4__Impl : ( ']' ) ;
    public final void rule__Viewpoint__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2295:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:2296:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:2296:1: ( ']' )
            // InternalSiriusTextDsl.g:2297:1: ']'
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
    // InternalSiriusTextDsl.g:2320:1: rule__Viewpoint__Group_7_3__0 : rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1 ;
    public final void rule__Viewpoint__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2324:1: ( rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1 )
            // InternalSiriusTextDsl.g:2325:2: rule__Viewpoint__Group_7_3__0__Impl rule__Viewpoint__Group_7_3__1
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
    // InternalSiriusTextDsl.g:2332:1: rule__Viewpoint__Group_7_3__0__Impl : ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) ) ;
    public final void rule__Viewpoint__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2336:1: ( ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) ) )
            // InternalSiriusTextDsl.g:2337:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) )
            {
            // InternalSiriusTextDsl.g:2337:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_0 ) )
            // InternalSiriusTextDsl.g:2338:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_0 )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_0()); 
            // InternalSiriusTextDsl.g:2339:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_0 )
            // InternalSiriusTextDsl.g:2339:2: rule__Viewpoint__RepresentationsAssignment_7_3_0
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
    // InternalSiriusTextDsl.g:2349:1: rule__Viewpoint__Group_7_3__1 : rule__Viewpoint__Group_7_3__1__Impl ;
    public final void rule__Viewpoint__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2353:1: ( rule__Viewpoint__Group_7_3__1__Impl )
            // InternalSiriusTextDsl.g:2354:2: rule__Viewpoint__Group_7_3__1__Impl
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
    // InternalSiriusTextDsl.g:2360:1: rule__Viewpoint__Group_7_3__1__Impl : ( ( rule__Viewpoint__Group_7_3_1__0 )* ) ;
    public final void rule__Viewpoint__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2364:1: ( ( ( rule__Viewpoint__Group_7_3_1__0 )* ) )
            // InternalSiriusTextDsl.g:2365:1: ( ( rule__Viewpoint__Group_7_3_1__0 )* )
            {
            // InternalSiriusTextDsl.g:2365:1: ( ( rule__Viewpoint__Group_7_3_1__0 )* )
            // InternalSiriusTextDsl.g:2366:1: ( rule__Viewpoint__Group_7_3_1__0 )*
            {
             before(grammarAccess.getViewpointAccess().getGroup_7_3_1()); 
            // InternalSiriusTextDsl.g:2367:1: ( rule__Viewpoint__Group_7_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2367:2: rule__Viewpoint__Group_7_3_1__0
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
    // InternalSiriusTextDsl.g:2381:1: rule__Viewpoint__Group_7_3_1__0 : rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1 ;
    public final void rule__Viewpoint__Group_7_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2385:1: ( rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1 )
            // InternalSiriusTextDsl.g:2386:2: rule__Viewpoint__Group_7_3_1__0__Impl rule__Viewpoint__Group_7_3_1__1
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
    // InternalSiriusTextDsl.g:2393:1: rule__Viewpoint__Group_7_3_1__0__Impl : ( ',' ) ;
    public final void rule__Viewpoint__Group_7_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2397:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:2398:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:2398:1: ( ',' )
            // InternalSiriusTextDsl.g:2399:1: ','
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
    // InternalSiriusTextDsl.g:2412:1: rule__Viewpoint__Group_7_3_1__1 : rule__Viewpoint__Group_7_3_1__1__Impl ;
    public final void rule__Viewpoint__Group_7_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2416:1: ( rule__Viewpoint__Group_7_3_1__1__Impl )
            // InternalSiriusTextDsl.g:2417:2: rule__Viewpoint__Group_7_3_1__1__Impl
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
    // InternalSiriusTextDsl.g:2423:1: rule__Viewpoint__Group_7_3_1__1__Impl : ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) ) ;
    public final void rule__Viewpoint__Group_7_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2427:1: ( ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) ) )
            // InternalSiriusTextDsl.g:2428:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) )
            {
            // InternalSiriusTextDsl.g:2428:1: ( ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 ) )
            // InternalSiriusTextDsl.g:2429:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsAssignment_7_3_1_1()); 
            // InternalSiriusTextDsl.g:2430:1: ( rule__Viewpoint__RepresentationsAssignment_7_3_1_1 )
            // InternalSiriusTextDsl.g:2430:2: rule__Viewpoint__RepresentationsAssignment_7_3_1_1
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
    // InternalSiriusTextDsl.g:2444:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2448:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // InternalSiriusTextDsl.g:2449:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
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
    // InternalSiriusTextDsl.g:2456:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__DocumentationAssignment_0 )? ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2460:1: ( ( ( rule__Diagram__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:2461:1: ( ( rule__Diagram__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:2461:1: ( ( rule__Diagram__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:2462:1: ( rule__Diagram__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getDiagramAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:2463:1: ( rule__Diagram__DocumentationAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOCUMENTATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:2463:2: rule__Diagram__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:2473:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2477:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // InternalSiriusTextDsl.g:2478:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
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
    // InternalSiriusTextDsl.g:2485:1: rule__Diagram__Group__1__Impl : ( ( rule__Diagram__InitializedAssignment_1 )? ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2489:1: ( ( ( rule__Diagram__InitializedAssignment_1 )? ) )
            // InternalSiriusTextDsl.g:2490:1: ( ( rule__Diagram__InitializedAssignment_1 )? )
            {
            // InternalSiriusTextDsl.g:2490:1: ( ( rule__Diagram__InitializedAssignment_1 )? )
            // InternalSiriusTextDsl.g:2491:1: ( rule__Diagram__InitializedAssignment_1 )?
            {
             before(grammarAccess.getDiagramAccess().getInitializedAssignment_1()); 
            // InternalSiriusTextDsl.g:2492:1: ( rule__Diagram__InitializedAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==63) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:2492:2: rule__Diagram__InitializedAssignment_1
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
    // InternalSiriusTextDsl.g:2502:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2506:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // InternalSiriusTextDsl.g:2507:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
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
    // InternalSiriusTextDsl.g:2514:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__ShowOnStartupAssignment_2 )? ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2518:1: ( ( ( rule__Diagram__ShowOnStartupAssignment_2 )? ) )
            // InternalSiriusTextDsl.g:2519:1: ( ( rule__Diagram__ShowOnStartupAssignment_2 )? )
            {
            // InternalSiriusTextDsl.g:2519:1: ( ( rule__Diagram__ShowOnStartupAssignment_2 )? )
            // InternalSiriusTextDsl.g:2520:1: ( rule__Diagram__ShowOnStartupAssignment_2 )?
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupAssignment_2()); 
            // InternalSiriusTextDsl.g:2521:1: ( rule__Diagram__ShowOnStartupAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==64) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSiriusTextDsl.g:2521:2: rule__Diagram__ShowOnStartupAssignment_2
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
    // InternalSiriusTextDsl.g:2531:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2535:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // InternalSiriusTextDsl.g:2536:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
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
    // InternalSiriusTextDsl.g:2543:1: rule__Diagram__Group__3__Impl : ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2547:1: ( ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? ) )
            // InternalSiriusTextDsl.g:2548:1: ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? )
            {
            // InternalSiriusTextDsl.g:2548:1: ( ( rule__Diagram__EnablePopupBarsAssignment_3 )? )
            // InternalSiriusTextDsl.g:2549:1: ( rule__Diagram__EnablePopupBarsAssignment_3 )?
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsAssignment_3()); 
            // InternalSiriusTextDsl.g:2550:1: ( rule__Diagram__EnablePopupBarsAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==65) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSiriusTextDsl.g:2550:2: rule__Diagram__EnablePopupBarsAssignment_3
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
    // InternalSiriusTextDsl.g:2560:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2564:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // InternalSiriusTextDsl.g:2565:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
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
    // InternalSiriusTextDsl.g:2572:1: rule__Diagram__Group__4__Impl : ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2576:1: ( ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) ) )
            // InternalSiriusTextDsl.g:2577:1: ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) )
            {
            // InternalSiriusTextDsl.g:2577:1: ( ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* ) )
            // InternalSiriusTextDsl.g:2578:1: ( ( '@MetamodelUris' ) ) ( ( '@MetamodelUris' )* )
            {
            // InternalSiriusTextDsl.g:2578:1: ( ( '@MetamodelUris' ) )
            // InternalSiriusTextDsl.g:2579:1: ( '@MetamodelUris' )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 
            // InternalSiriusTextDsl.g:2580:1: ( '@MetamodelUris' )
            // InternalSiriusTextDsl.g:2581:2: '@MetamodelUris'
            {
            match(input,32,FOLLOW_25); 

            }

             after(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 

            }

            // InternalSiriusTextDsl.g:2585:1: ( ( '@MetamodelUris' )* )
            // InternalSiriusTextDsl.g:2586:1: ( '@MetamodelUris' )*
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4()); 
            // InternalSiriusTextDsl.g:2587:1: ( '@MetamodelUris' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2588:2: '@MetamodelUris'
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
    // InternalSiriusTextDsl.g:2600:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl rule__Diagram__Group__6 ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2604:1: ( rule__Diagram__Group__5__Impl rule__Diagram__Group__6 )
            // InternalSiriusTextDsl.g:2605:2: rule__Diagram__Group__5__Impl rule__Diagram__Group__6
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
    // InternalSiriusTextDsl.g:2612:1: rule__Diagram__Group__5__Impl : ( '({' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2616:1: ( ( '({' ) )
            // InternalSiriusTextDsl.g:2617:1: ( '({' )
            {
            // InternalSiriusTextDsl.g:2617:1: ( '({' )
            // InternalSiriusTextDsl.g:2618:1: '({'
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
    // InternalSiriusTextDsl.g:2631:1: rule__Diagram__Group__6 : rule__Diagram__Group__6__Impl rule__Diagram__Group__7 ;
    public final void rule__Diagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2635:1: ( rule__Diagram__Group__6__Impl rule__Diagram__Group__7 )
            // InternalSiriusTextDsl.g:2636:2: rule__Diagram__Group__6__Impl rule__Diagram__Group__7
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
    // InternalSiriusTextDsl.g:2643:1: rule__Diagram__Group__6__Impl : ( ( rule__Diagram__MetamodelUrisAssignment_6 ) ) ;
    public final void rule__Diagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2647:1: ( ( ( rule__Diagram__MetamodelUrisAssignment_6 ) ) )
            // InternalSiriusTextDsl.g:2648:1: ( ( rule__Diagram__MetamodelUrisAssignment_6 ) )
            {
            // InternalSiriusTextDsl.g:2648:1: ( ( rule__Diagram__MetamodelUrisAssignment_6 ) )
            // InternalSiriusTextDsl.g:2649:1: ( rule__Diagram__MetamodelUrisAssignment_6 )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_6()); 
            // InternalSiriusTextDsl.g:2650:1: ( rule__Diagram__MetamodelUrisAssignment_6 )
            // InternalSiriusTextDsl.g:2650:2: rule__Diagram__MetamodelUrisAssignment_6
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
    // InternalSiriusTextDsl.g:2660:1: rule__Diagram__Group__7 : rule__Diagram__Group__7__Impl rule__Diagram__Group__8 ;
    public final void rule__Diagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2664:1: ( rule__Diagram__Group__7__Impl rule__Diagram__Group__8 )
            // InternalSiriusTextDsl.g:2665:2: rule__Diagram__Group__7__Impl rule__Diagram__Group__8
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
    // InternalSiriusTextDsl.g:2672:1: rule__Diagram__Group__7__Impl : ( ( rule__Diagram__Group_7__0 )* ) ;
    public final void rule__Diagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2676:1: ( ( ( rule__Diagram__Group_7__0 )* ) )
            // InternalSiriusTextDsl.g:2677:1: ( ( rule__Diagram__Group_7__0 )* )
            {
            // InternalSiriusTextDsl.g:2677:1: ( ( rule__Diagram__Group_7__0 )* )
            // InternalSiriusTextDsl.g:2678:1: ( rule__Diagram__Group_7__0 )*
            {
             before(grammarAccess.getDiagramAccess().getGroup_7()); 
            // InternalSiriusTextDsl.g:2679:1: ( rule__Diagram__Group_7__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2679:2: rule__Diagram__Group_7__0
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
    // InternalSiriusTextDsl.g:2689:1: rule__Diagram__Group__8 : rule__Diagram__Group__8__Impl rule__Diagram__Group__9 ;
    public final void rule__Diagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2693:1: ( rule__Diagram__Group__8__Impl rule__Diagram__Group__9 )
            // InternalSiriusTextDsl.g:2694:2: rule__Diagram__Group__8__Impl rule__Diagram__Group__9
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
    // InternalSiriusTextDsl.g:2701:1: rule__Diagram__Group__8__Impl : ( '})' ) ;
    public final void rule__Diagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2705:1: ( ( '})' ) )
            // InternalSiriusTextDsl.g:2706:1: ( '})' )
            {
            // InternalSiriusTextDsl.g:2706:1: ( '})' )
            // InternalSiriusTextDsl.g:2707:1: '})'
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
    // InternalSiriusTextDsl.g:2720:1: rule__Diagram__Group__9 : rule__Diagram__Group__9__Impl rule__Diagram__Group__10 ;
    public final void rule__Diagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2724:1: ( rule__Diagram__Group__9__Impl rule__Diagram__Group__10 )
            // InternalSiriusTextDsl.g:2725:2: rule__Diagram__Group__9__Impl rule__Diagram__Group__10
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
    // InternalSiriusTextDsl.g:2732:1: rule__Diagram__Group__9__Impl : ( 'diagram' ) ;
    public final void rule__Diagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2736:1: ( ( 'diagram' ) )
            // InternalSiriusTextDsl.g:2737:1: ( 'diagram' )
            {
            // InternalSiriusTextDsl.g:2737:1: ( 'diagram' )
            // InternalSiriusTextDsl.g:2738:1: 'diagram'
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
    // InternalSiriusTextDsl.g:2751:1: rule__Diagram__Group__10 : rule__Diagram__Group__10__Impl rule__Diagram__Group__11 ;
    public final void rule__Diagram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2755:1: ( rule__Diagram__Group__10__Impl rule__Diagram__Group__11 )
            // InternalSiriusTextDsl.g:2756:2: rule__Diagram__Group__10__Impl rule__Diagram__Group__11
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
    // InternalSiriusTextDsl.g:2763:1: rule__Diagram__Group__10__Impl : ( ( rule__Diagram__NameAssignment_10 ) ) ;
    public final void rule__Diagram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2767:1: ( ( ( rule__Diagram__NameAssignment_10 ) ) )
            // InternalSiriusTextDsl.g:2768:1: ( ( rule__Diagram__NameAssignment_10 ) )
            {
            // InternalSiriusTextDsl.g:2768:1: ( ( rule__Diagram__NameAssignment_10 ) )
            // InternalSiriusTextDsl.g:2769:1: ( rule__Diagram__NameAssignment_10 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_10()); 
            // InternalSiriusTextDsl.g:2770:1: ( rule__Diagram__NameAssignment_10 )
            // InternalSiriusTextDsl.g:2770:2: rule__Diagram__NameAssignment_10
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
    // InternalSiriusTextDsl.g:2780:1: rule__Diagram__Group__11 : rule__Diagram__Group__11__Impl rule__Diagram__Group__12 ;
    public final void rule__Diagram__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2784:1: ( rule__Diagram__Group__11__Impl rule__Diagram__Group__12 )
            // InternalSiriusTextDsl.g:2785:2: rule__Diagram__Group__11__Impl rule__Diagram__Group__12
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
    // InternalSiriusTextDsl.g:2792:1: rule__Diagram__Group__11__Impl : ( ( rule__Diagram__Group_11__0 )? ) ;
    public final void rule__Diagram__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2796:1: ( ( ( rule__Diagram__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:2797:1: ( ( rule__Diagram__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:2797:1: ( ( rule__Diagram__Group_11__0 )? )
            // InternalSiriusTextDsl.g:2798:1: ( rule__Diagram__Group_11__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:2799:1: ( rule__Diagram__Group_11__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSiriusTextDsl.g:2799:2: rule__Diagram__Group_11__0
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
    // InternalSiriusTextDsl.g:2809:1: rule__Diagram__Group__12 : rule__Diagram__Group__12__Impl rule__Diagram__Group__13 ;
    public final void rule__Diagram__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2813:1: ( rule__Diagram__Group__12__Impl rule__Diagram__Group__13 )
            // InternalSiriusTextDsl.g:2814:2: rule__Diagram__Group__12__Impl rule__Diagram__Group__13
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
    // InternalSiriusTextDsl.g:2821:1: rule__Diagram__Group__12__Impl : ( 'for' ) ;
    public final void rule__Diagram__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2825:1: ( ( 'for' ) )
            // InternalSiriusTextDsl.g:2826:1: ( 'for' )
            {
            // InternalSiriusTextDsl.g:2826:1: ( 'for' )
            // InternalSiriusTextDsl.g:2827:1: 'for'
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
    // InternalSiriusTextDsl.g:2840:1: rule__Diagram__Group__13 : rule__Diagram__Group__13__Impl rule__Diagram__Group__14 ;
    public final void rule__Diagram__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2844:1: ( rule__Diagram__Group__13__Impl rule__Diagram__Group__14 )
            // InternalSiriusTextDsl.g:2845:2: rule__Diagram__Group__13__Impl rule__Diagram__Group__14
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
    // InternalSiriusTextDsl.g:2852:1: rule__Diagram__Group__13__Impl : ( ( rule__Diagram__DomainClassAssignment_13 ) ) ;
    public final void rule__Diagram__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2856:1: ( ( ( rule__Diagram__DomainClassAssignment_13 ) ) )
            // InternalSiriusTextDsl.g:2857:1: ( ( rule__Diagram__DomainClassAssignment_13 ) )
            {
            // InternalSiriusTextDsl.g:2857:1: ( ( rule__Diagram__DomainClassAssignment_13 ) )
            // InternalSiriusTextDsl.g:2858:1: ( rule__Diagram__DomainClassAssignment_13 )
            {
             before(grammarAccess.getDiagramAccess().getDomainClassAssignment_13()); 
            // InternalSiriusTextDsl.g:2859:1: ( rule__Diagram__DomainClassAssignment_13 )
            // InternalSiriusTextDsl.g:2859:2: rule__Diagram__DomainClassAssignment_13
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
    // InternalSiriusTextDsl.g:2869:1: rule__Diagram__Group__14 : rule__Diagram__Group__14__Impl rule__Diagram__Group__15 ;
    public final void rule__Diagram__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2873:1: ( rule__Diagram__Group__14__Impl rule__Diagram__Group__15 )
            // InternalSiriusTextDsl.g:2874:2: rule__Diagram__Group__14__Impl rule__Diagram__Group__15
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
    // InternalSiriusTextDsl.g:2881:1: rule__Diagram__Group__14__Impl : ( ( rule__Diagram__Group_14__0 )? ) ;
    public final void rule__Diagram__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2885:1: ( ( ( rule__Diagram__Group_14__0 )? ) )
            // InternalSiriusTextDsl.g:2886:1: ( ( rule__Diagram__Group_14__0 )? )
            {
            // InternalSiriusTextDsl.g:2886:1: ( ( rule__Diagram__Group_14__0 )? )
            // InternalSiriusTextDsl.g:2887:1: ( rule__Diagram__Group_14__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_14()); 
            // InternalSiriusTextDsl.g:2888:1: ( rule__Diagram__Group_14__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:2888:2: rule__Diagram__Group_14__0
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
    // InternalSiriusTextDsl.g:2898:1: rule__Diagram__Group__15 : rule__Diagram__Group__15__Impl rule__Diagram__Group__16 ;
    public final void rule__Diagram__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2902:1: ( rule__Diagram__Group__15__Impl rule__Diagram__Group__16 )
            // InternalSiriusTextDsl.g:2903:2: rule__Diagram__Group__15__Impl rule__Diagram__Group__16
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
    // InternalSiriusTextDsl.g:2910:1: rule__Diagram__Group__15__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2914:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:2915:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:2915:1: ( '{' )
            // InternalSiriusTextDsl.g:2916:1: '{'
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
    // InternalSiriusTextDsl.g:2929:1: rule__Diagram__Group__16 : rule__Diagram__Group__16__Impl rule__Diagram__Group__17 ;
    public final void rule__Diagram__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2933:1: ( rule__Diagram__Group__16__Impl rule__Diagram__Group__17 )
            // InternalSiriusTextDsl.g:2934:2: rule__Diagram__Group__16__Impl rule__Diagram__Group__17
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
    // InternalSiriusTextDsl.g:2941:1: rule__Diagram__Group__16__Impl : ( ( rule__Diagram__Group_16__0 )? ) ;
    public final void rule__Diagram__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2945:1: ( ( ( rule__Diagram__Group_16__0 )? ) )
            // InternalSiriusTextDsl.g:2946:1: ( ( rule__Diagram__Group_16__0 )? )
            {
            // InternalSiriusTextDsl.g:2946:1: ( ( rule__Diagram__Group_16__0 )? )
            // InternalSiriusTextDsl.g:2947:1: ( rule__Diagram__Group_16__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_16()); 
            // InternalSiriusTextDsl.g:2948:1: ( rule__Diagram__Group_16__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:2948:2: rule__Diagram__Group_16__0
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
    // InternalSiriusTextDsl.g:2958:1: rule__Diagram__Group__17 : rule__Diagram__Group__17__Impl rule__Diagram__Group__18 ;
    public final void rule__Diagram__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2962:1: ( rule__Diagram__Group__17__Impl rule__Diagram__Group__18 )
            // InternalSiriusTextDsl.g:2963:2: rule__Diagram__Group__17__Impl rule__Diagram__Group__18
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
    // InternalSiriusTextDsl.g:2970:1: rule__Diagram__Group__17__Impl : ( ( rule__Diagram__Group_17__0 )? ) ;
    public final void rule__Diagram__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2974:1: ( ( ( rule__Diagram__Group_17__0 )? ) )
            // InternalSiriusTextDsl.g:2975:1: ( ( rule__Diagram__Group_17__0 )? )
            {
            // InternalSiriusTextDsl.g:2975:1: ( ( rule__Diagram__Group_17__0 )? )
            // InternalSiriusTextDsl.g:2976:1: ( rule__Diagram__Group_17__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_17()); 
            // InternalSiriusTextDsl.g:2977:1: ( rule__Diagram__Group_17__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:2977:2: rule__Diagram__Group_17__0
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
    // InternalSiriusTextDsl.g:2987:1: rule__Diagram__Group__18 : rule__Diagram__Group__18__Impl rule__Diagram__Group__19 ;
    public final void rule__Diagram__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:2991:1: ( rule__Diagram__Group__18__Impl rule__Diagram__Group__19 )
            // InternalSiriusTextDsl.g:2992:2: rule__Diagram__Group__18__Impl rule__Diagram__Group__19
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
    // InternalSiriusTextDsl.g:2999:1: rule__Diagram__Group__18__Impl : ( ( rule__Diagram__Group_18__0 )? ) ;
    public final void rule__Diagram__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3003:1: ( ( ( rule__Diagram__Group_18__0 )? ) )
            // InternalSiriusTextDsl.g:3004:1: ( ( rule__Diagram__Group_18__0 )? )
            {
            // InternalSiriusTextDsl.g:3004:1: ( ( rule__Diagram__Group_18__0 )? )
            // InternalSiriusTextDsl.g:3005:1: ( rule__Diagram__Group_18__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_18()); 
            // InternalSiriusTextDsl.g:3006:1: ( rule__Diagram__Group_18__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSiriusTextDsl.g:3006:2: rule__Diagram__Group_18__0
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
    // InternalSiriusTextDsl.g:3016:1: rule__Diagram__Group__19 : rule__Diagram__Group__19__Impl rule__Diagram__Group__20 ;
    public final void rule__Diagram__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3020:1: ( rule__Diagram__Group__19__Impl rule__Diagram__Group__20 )
            // InternalSiriusTextDsl.g:3021:2: rule__Diagram__Group__19__Impl rule__Diagram__Group__20
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
    // InternalSiriusTextDsl.g:3028:1: rule__Diagram__Group__19__Impl : ( ( rule__Diagram__Group_19__0 )? ) ;
    public final void rule__Diagram__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3032:1: ( ( ( rule__Diagram__Group_19__0 )? ) )
            // InternalSiriusTextDsl.g:3033:1: ( ( rule__Diagram__Group_19__0 )? )
            {
            // InternalSiriusTextDsl.g:3033:1: ( ( rule__Diagram__Group_19__0 )? )
            // InternalSiriusTextDsl.g:3034:1: ( rule__Diagram__Group_19__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_19()); 
            // InternalSiriusTextDsl.g:3035:1: ( rule__Diagram__Group_19__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSiriusTextDsl.g:3035:2: rule__Diagram__Group_19__0
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
    // InternalSiriusTextDsl.g:3045:1: rule__Diagram__Group__20 : rule__Diagram__Group__20__Impl rule__Diagram__Group__21 ;
    public final void rule__Diagram__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3049:1: ( rule__Diagram__Group__20__Impl rule__Diagram__Group__21 )
            // InternalSiriusTextDsl.g:3050:2: rule__Diagram__Group__20__Impl rule__Diagram__Group__21
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
    // InternalSiriusTextDsl.g:3057:1: rule__Diagram__Group__20__Impl : ( ( rule__Diagram__Group_20__0 )? ) ;
    public final void rule__Diagram__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3061:1: ( ( ( rule__Diagram__Group_20__0 )? ) )
            // InternalSiriusTextDsl.g:3062:1: ( ( rule__Diagram__Group_20__0 )? )
            {
            // InternalSiriusTextDsl.g:3062:1: ( ( rule__Diagram__Group_20__0 )? )
            // InternalSiriusTextDsl.g:3063:1: ( rule__Diagram__Group_20__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_20()); 
            // InternalSiriusTextDsl.g:3064:1: ( rule__Diagram__Group_20__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:3064:2: rule__Diagram__Group_20__0
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
    // InternalSiriusTextDsl.g:3074:1: rule__Diagram__Group__21 : rule__Diagram__Group__21__Impl ;
    public final void rule__Diagram__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3078:1: ( rule__Diagram__Group__21__Impl )
            // InternalSiriusTextDsl.g:3079:2: rule__Diagram__Group__21__Impl
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
    // InternalSiriusTextDsl.g:3085:1: rule__Diagram__Group__21__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3089:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:3090:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:3090:1: ( '}' )
            // InternalSiriusTextDsl.g:3091:1: '}'
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
    // InternalSiriusTextDsl.g:3148:1: rule__Diagram__Group_7__0 : rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1 ;
    public final void rule__Diagram__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3152:1: ( rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1 )
            // InternalSiriusTextDsl.g:3153:2: rule__Diagram__Group_7__0__Impl rule__Diagram__Group_7__1
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
    // InternalSiriusTextDsl.g:3160:1: rule__Diagram__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Diagram__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3164:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:3165:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:3165:1: ( ',' )
            // InternalSiriusTextDsl.g:3166:1: ','
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
    // InternalSiriusTextDsl.g:3179:1: rule__Diagram__Group_7__1 : rule__Diagram__Group_7__1__Impl ;
    public final void rule__Diagram__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3183:1: ( rule__Diagram__Group_7__1__Impl )
            // InternalSiriusTextDsl.g:3184:2: rule__Diagram__Group_7__1__Impl
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
    // InternalSiriusTextDsl.g:3190:1: rule__Diagram__Group_7__1__Impl : ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) ) ;
    public final void rule__Diagram__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3194:1: ( ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) ) )
            // InternalSiriusTextDsl.g:3195:1: ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) )
            {
            // InternalSiriusTextDsl.g:3195:1: ( ( rule__Diagram__MetamodelUrisAssignment_7_1 ) )
            // InternalSiriusTextDsl.g:3196:1: ( rule__Diagram__MetamodelUrisAssignment_7_1 )
            {
             before(grammarAccess.getDiagramAccess().getMetamodelUrisAssignment_7_1()); 
            // InternalSiriusTextDsl.g:3197:1: ( rule__Diagram__MetamodelUrisAssignment_7_1 )
            // InternalSiriusTextDsl.g:3197:2: rule__Diagram__MetamodelUrisAssignment_7_1
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
    // InternalSiriusTextDsl.g:3211:1: rule__Diagram__Group_11__0 : rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1 ;
    public final void rule__Diagram__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3215:1: ( rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1 )
            // InternalSiriusTextDsl.g:3216:2: rule__Diagram__Group_11__0__Impl rule__Diagram__Group_11__1
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
    // InternalSiriusTextDsl.g:3223:1: rule__Diagram__Group_11__0__Impl : ( 'as' ) ;
    public final void rule__Diagram__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3227:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:3228:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:3228:1: ( 'as' )
            // InternalSiriusTextDsl.g:3229:1: 'as'
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
    // InternalSiriusTextDsl.g:3242:1: rule__Diagram__Group_11__1 : rule__Diagram__Group_11__1__Impl ;
    public final void rule__Diagram__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3246:1: ( rule__Diagram__Group_11__1__Impl )
            // InternalSiriusTextDsl.g:3247:2: rule__Diagram__Group_11__1__Impl
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
    // InternalSiriusTextDsl.g:3253:1: rule__Diagram__Group_11__1__Impl : ( ( rule__Diagram__LabelAssignment_11_1 ) ) ;
    public final void rule__Diagram__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3257:1: ( ( ( rule__Diagram__LabelAssignment_11_1 ) ) )
            // InternalSiriusTextDsl.g:3258:1: ( ( rule__Diagram__LabelAssignment_11_1 ) )
            {
            // InternalSiriusTextDsl.g:3258:1: ( ( rule__Diagram__LabelAssignment_11_1 ) )
            // InternalSiriusTextDsl.g:3259:1: ( rule__Diagram__LabelAssignment_11_1 )
            {
             before(grammarAccess.getDiagramAccess().getLabelAssignment_11_1()); 
            // InternalSiriusTextDsl.g:3260:1: ( rule__Diagram__LabelAssignment_11_1 )
            // InternalSiriusTextDsl.g:3260:2: rule__Diagram__LabelAssignment_11_1
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
    // InternalSiriusTextDsl.g:3274:1: rule__Diagram__Group_14__0 : rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1 ;
    public final void rule__Diagram__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3278:1: ( rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1 )
            // InternalSiriusTextDsl.g:3279:2: rule__Diagram__Group_14__0__Impl rule__Diagram__Group_14__1
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
    // InternalSiriusTextDsl.g:3286:1: rule__Diagram__Group_14__0__Impl : ( '?' ) ;
    public final void rule__Diagram__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3290:1: ( ( '?' ) )
            // InternalSiriusTextDsl.g:3291:1: ( '?' )
            {
            // InternalSiriusTextDsl.g:3291:1: ( '?' )
            // InternalSiriusTextDsl.g:3292:1: '?'
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
    // InternalSiriusTextDsl.g:3305:1: rule__Diagram__Group_14__1 : rule__Diagram__Group_14__1__Impl ;
    public final void rule__Diagram__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3309:1: ( rule__Diagram__Group_14__1__Impl )
            // InternalSiriusTextDsl.g:3310:2: rule__Diagram__Group_14__1__Impl
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
    // InternalSiriusTextDsl.g:3316:1: rule__Diagram__Group_14__1__Impl : ( ( rule__Diagram__PreconditionAssignment_14_1 ) ) ;
    public final void rule__Diagram__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3320:1: ( ( ( rule__Diagram__PreconditionAssignment_14_1 ) ) )
            // InternalSiriusTextDsl.g:3321:1: ( ( rule__Diagram__PreconditionAssignment_14_1 ) )
            {
            // InternalSiriusTextDsl.g:3321:1: ( ( rule__Diagram__PreconditionAssignment_14_1 ) )
            // InternalSiriusTextDsl.g:3322:1: ( rule__Diagram__PreconditionAssignment_14_1 )
            {
             before(grammarAccess.getDiagramAccess().getPreconditionAssignment_14_1()); 
            // InternalSiriusTextDsl.g:3323:1: ( rule__Diagram__PreconditionAssignment_14_1 )
            // InternalSiriusTextDsl.g:3323:2: rule__Diagram__PreconditionAssignment_14_1
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
    // InternalSiriusTextDsl.g:3337:1: rule__Diagram__Group_16__0 : rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1 ;
    public final void rule__Diagram__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3341:1: ( rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1 )
            // InternalSiriusTextDsl.g:3342:2: rule__Diagram__Group_16__0__Impl rule__Diagram__Group_16__1
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
    // InternalSiriusTextDsl.g:3349:1: rule__Diagram__Group_16__0__Impl : ( 'documentation' ) ;
    public final void rule__Diagram__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3353:1: ( ( 'documentation' ) )
            // InternalSiriusTextDsl.g:3354:1: ( 'documentation' )
            {
            // InternalSiriusTextDsl.g:3354:1: ( 'documentation' )
            // InternalSiriusTextDsl.g:3355:1: 'documentation'
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
    // InternalSiriusTextDsl.g:3368:1: rule__Diagram__Group_16__1 : rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2 ;
    public final void rule__Diagram__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3372:1: ( rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2 )
            // InternalSiriusTextDsl.g:3373:2: rule__Diagram__Group_16__1__Impl rule__Diagram__Group_16__2
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
    // InternalSiriusTextDsl.g:3380:1: rule__Diagram__Group_16__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3384:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3385:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3385:1: ( '=' )
            // InternalSiriusTextDsl.g:3386:1: '='
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
    // InternalSiriusTextDsl.g:3399:1: rule__Diagram__Group_16__2 : rule__Diagram__Group_16__2__Impl ;
    public final void rule__Diagram__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3403:1: ( rule__Diagram__Group_16__2__Impl )
            // InternalSiriusTextDsl.g:3404:2: rule__Diagram__Group_16__2__Impl
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
    // InternalSiriusTextDsl.g:3410:1: rule__Diagram__Group_16__2__Impl : ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) ) ;
    public final void rule__Diagram__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3414:1: ( ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) ) )
            // InternalSiriusTextDsl.g:3415:1: ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) )
            {
            // InternalSiriusTextDsl.g:3415:1: ( ( rule__Diagram__EndUserDocumentationAssignment_16_2 ) )
            // InternalSiriusTextDsl.g:3416:1: ( rule__Diagram__EndUserDocumentationAssignment_16_2 )
            {
             before(grammarAccess.getDiagramAccess().getEndUserDocumentationAssignment_16_2()); 
            // InternalSiriusTextDsl.g:3417:1: ( rule__Diagram__EndUserDocumentationAssignment_16_2 )
            // InternalSiriusTextDsl.g:3417:2: rule__Diagram__EndUserDocumentationAssignment_16_2
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
    // InternalSiriusTextDsl.g:3433:1: rule__Diagram__Group_17__0 : rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1 ;
    public final void rule__Diagram__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3437:1: ( rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1 )
            // InternalSiriusTextDsl.g:3438:2: rule__Diagram__Group_17__0__Impl rule__Diagram__Group_17__1
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
    // InternalSiriusTextDsl.g:3445:1: rule__Diagram__Group_17__0__Impl : ( 'titleExpression' ) ;
    public final void rule__Diagram__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3449:1: ( ( 'titleExpression' ) )
            // InternalSiriusTextDsl.g:3450:1: ( 'titleExpression' )
            {
            // InternalSiriusTextDsl.g:3450:1: ( 'titleExpression' )
            // InternalSiriusTextDsl.g:3451:1: 'titleExpression'
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
    // InternalSiriusTextDsl.g:3464:1: rule__Diagram__Group_17__1 : rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2 ;
    public final void rule__Diagram__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3468:1: ( rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2 )
            // InternalSiriusTextDsl.g:3469:2: rule__Diagram__Group_17__1__Impl rule__Diagram__Group_17__2
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
    // InternalSiriusTextDsl.g:3476:1: rule__Diagram__Group_17__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3480:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3481:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3481:1: ( '=' )
            // InternalSiriusTextDsl.g:3482:1: '='
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
    // InternalSiriusTextDsl.g:3495:1: rule__Diagram__Group_17__2 : rule__Diagram__Group_17__2__Impl ;
    public final void rule__Diagram__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3499:1: ( rule__Diagram__Group_17__2__Impl )
            // InternalSiriusTextDsl.g:3500:2: rule__Diagram__Group_17__2__Impl
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
    // InternalSiriusTextDsl.g:3506:1: rule__Diagram__Group_17__2__Impl : ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) ) ;
    public final void rule__Diagram__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3510:1: ( ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) ) )
            // InternalSiriusTextDsl.g:3511:1: ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) )
            {
            // InternalSiriusTextDsl.g:3511:1: ( ( rule__Diagram__TitleExpressionAssignment_17_2 ) )
            // InternalSiriusTextDsl.g:3512:1: ( rule__Diagram__TitleExpressionAssignment_17_2 )
            {
             before(grammarAccess.getDiagramAccess().getTitleExpressionAssignment_17_2()); 
            // InternalSiriusTextDsl.g:3513:1: ( rule__Diagram__TitleExpressionAssignment_17_2 )
            // InternalSiriusTextDsl.g:3513:2: rule__Diagram__TitleExpressionAssignment_17_2
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
    // InternalSiriusTextDsl.g:3529:1: rule__Diagram__Group_18__0 : rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1 ;
    public final void rule__Diagram__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3533:1: ( rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1 )
            // InternalSiriusTextDsl.g:3534:2: rule__Diagram__Group_18__0__Impl rule__Diagram__Group_18__1
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
    // InternalSiriusTextDsl.g:3541:1: rule__Diagram__Group_18__0__Impl : ( 'rootExpression' ) ;
    public final void rule__Diagram__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3545:1: ( ( 'rootExpression' ) )
            // InternalSiriusTextDsl.g:3546:1: ( 'rootExpression' )
            {
            // InternalSiriusTextDsl.g:3546:1: ( 'rootExpression' )
            // InternalSiriusTextDsl.g:3547:1: 'rootExpression'
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
    // InternalSiriusTextDsl.g:3560:1: rule__Diagram__Group_18__1 : rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2 ;
    public final void rule__Diagram__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3564:1: ( rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2 )
            // InternalSiriusTextDsl.g:3565:2: rule__Diagram__Group_18__1__Impl rule__Diagram__Group_18__2
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
    // InternalSiriusTextDsl.g:3572:1: rule__Diagram__Group_18__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3576:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3577:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3577:1: ( '=' )
            // InternalSiriusTextDsl.g:3578:1: '='
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
    // InternalSiriusTextDsl.g:3591:1: rule__Diagram__Group_18__2 : rule__Diagram__Group_18__2__Impl ;
    public final void rule__Diagram__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3595:1: ( rule__Diagram__Group_18__2__Impl )
            // InternalSiriusTextDsl.g:3596:2: rule__Diagram__Group_18__2__Impl
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
    // InternalSiriusTextDsl.g:3602:1: rule__Diagram__Group_18__2__Impl : ( ( rule__Diagram__RootExpressionAssignment_18_2 ) ) ;
    public final void rule__Diagram__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3606:1: ( ( ( rule__Diagram__RootExpressionAssignment_18_2 ) ) )
            // InternalSiriusTextDsl.g:3607:1: ( ( rule__Diagram__RootExpressionAssignment_18_2 ) )
            {
            // InternalSiriusTextDsl.g:3607:1: ( ( rule__Diagram__RootExpressionAssignment_18_2 ) )
            // InternalSiriusTextDsl.g:3608:1: ( rule__Diagram__RootExpressionAssignment_18_2 )
            {
             before(grammarAccess.getDiagramAccess().getRootExpressionAssignment_18_2()); 
            // InternalSiriusTextDsl.g:3609:1: ( rule__Diagram__RootExpressionAssignment_18_2 )
            // InternalSiriusTextDsl.g:3609:2: rule__Diagram__RootExpressionAssignment_18_2
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
    // InternalSiriusTextDsl.g:3625:1: rule__Diagram__Group_19__0 : rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1 ;
    public final void rule__Diagram__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3629:1: ( rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1 )
            // InternalSiriusTextDsl.g:3630:2: rule__Diagram__Group_19__0__Impl rule__Diagram__Group_19__1
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
    // InternalSiriusTextDsl.g:3637:1: rule__Diagram__Group_19__0__Impl : ( 'defaultLayer' ) ;
    public final void rule__Diagram__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3641:1: ( ( 'defaultLayer' ) )
            // InternalSiriusTextDsl.g:3642:1: ( 'defaultLayer' )
            {
            // InternalSiriusTextDsl.g:3642:1: ( 'defaultLayer' )
            // InternalSiriusTextDsl.g:3643:1: 'defaultLayer'
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
    // InternalSiriusTextDsl.g:3656:1: rule__Diagram__Group_19__1 : rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2 ;
    public final void rule__Diagram__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3660:1: ( rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2 )
            // InternalSiriusTextDsl.g:3661:2: rule__Diagram__Group_19__1__Impl rule__Diagram__Group_19__2
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
    // InternalSiriusTextDsl.g:3668:1: rule__Diagram__Group_19__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3672:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3673:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3673:1: ( '=' )
            // InternalSiriusTextDsl.g:3674:1: '='
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
    // InternalSiriusTextDsl.g:3687:1: rule__Diagram__Group_19__2 : rule__Diagram__Group_19__2__Impl ;
    public final void rule__Diagram__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3691:1: ( rule__Diagram__Group_19__2__Impl )
            // InternalSiriusTextDsl.g:3692:2: rule__Diagram__Group_19__2__Impl
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
    // InternalSiriusTextDsl.g:3698:1: rule__Diagram__Group_19__2__Impl : ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) ) ;
    public final void rule__Diagram__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3702:1: ( ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) ) )
            // InternalSiriusTextDsl.g:3703:1: ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) )
            {
            // InternalSiriusTextDsl.g:3703:1: ( ( rule__Diagram__DefaultLayerAssignment_19_2 ) )
            // InternalSiriusTextDsl.g:3704:1: ( rule__Diagram__DefaultLayerAssignment_19_2 )
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerAssignment_19_2()); 
            // InternalSiriusTextDsl.g:3705:1: ( rule__Diagram__DefaultLayerAssignment_19_2 )
            // InternalSiriusTextDsl.g:3705:2: rule__Diagram__DefaultLayerAssignment_19_2
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
    // InternalSiriusTextDsl.g:3721:1: rule__Diagram__Group_20__0 : rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1 ;
    public final void rule__Diagram__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3725:1: ( rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1 )
            // InternalSiriusTextDsl.g:3726:2: rule__Diagram__Group_20__0__Impl rule__Diagram__Group_20__1
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
    // InternalSiriusTextDsl.g:3733:1: rule__Diagram__Group_20__0__Impl : ( 'additionalLayers' ) ;
    public final void rule__Diagram__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3737:1: ( ( 'additionalLayers' ) )
            // InternalSiriusTextDsl.g:3738:1: ( 'additionalLayers' )
            {
            // InternalSiriusTextDsl.g:3738:1: ( 'additionalLayers' )
            // InternalSiriusTextDsl.g:3739:1: 'additionalLayers'
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
    // InternalSiriusTextDsl.g:3752:1: rule__Diagram__Group_20__1 : rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2 ;
    public final void rule__Diagram__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3756:1: ( rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2 )
            // InternalSiriusTextDsl.g:3757:2: rule__Diagram__Group_20__1__Impl rule__Diagram__Group_20__2
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
    // InternalSiriusTextDsl.g:3764:1: rule__Diagram__Group_20__1__Impl : ( '=' ) ;
    public final void rule__Diagram__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3768:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:3769:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:3769:1: ( '=' )
            // InternalSiriusTextDsl.g:3770:1: '='
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
    // InternalSiriusTextDsl.g:3783:1: rule__Diagram__Group_20__2 : rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3 ;
    public final void rule__Diagram__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3787:1: ( rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3 )
            // InternalSiriusTextDsl.g:3788:2: rule__Diagram__Group_20__2__Impl rule__Diagram__Group_20__3
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
    // InternalSiriusTextDsl.g:3795:1: rule__Diagram__Group_20__2__Impl : ( '[' ) ;
    public final void rule__Diagram__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3799:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:3800:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:3800:1: ( '[' )
            // InternalSiriusTextDsl.g:3801:1: '['
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
    // InternalSiriusTextDsl.g:3814:1: rule__Diagram__Group_20__3 : rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4 ;
    public final void rule__Diagram__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3818:1: ( rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4 )
            // InternalSiriusTextDsl.g:3819:2: rule__Diagram__Group_20__3__Impl rule__Diagram__Group_20__4
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
    // InternalSiriusTextDsl.g:3826:1: rule__Diagram__Group_20__3__Impl : ( ( rule__Diagram__Group_20_3__0 )? ) ;
    public final void rule__Diagram__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3830:1: ( ( ( rule__Diagram__Group_20_3__0 )? ) )
            // InternalSiriusTextDsl.g:3831:1: ( ( rule__Diagram__Group_20_3__0 )? )
            {
            // InternalSiriusTextDsl.g:3831:1: ( ( rule__Diagram__Group_20_3__0 )? )
            // InternalSiriusTextDsl.g:3832:1: ( rule__Diagram__Group_20_3__0 )?
            {
             before(grammarAccess.getDiagramAccess().getGroup_20_3()); 
            // InternalSiriusTextDsl.g:3833:1: ( rule__Diagram__Group_20_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:3833:2: rule__Diagram__Group_20_3__0
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
    // InternalSiriusTextDsl.g:3843:1: rule__Diagram__Group_20__4 : rule__Diagram__Group_20__4__Impl ;
    public final void rule__Diagram__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3847:1: ( rule__Diagram__Group_20__4__Impl )
            // InternalSiriusTextDsl.g:3848:2: rule__Diagram__Group_20__4__Impl
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
    // InternalSiriusTextDsl.g:3854:1: rule__Diagram__Group_20__4__Impl : ( ']' ) ;
    public final void rule__Diagram__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3858:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:3859:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:3859:1: ( ']' )
            // InternalSiriusTextDsl.g:3860:1: ']'
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
    // InternalSiriusTextDsl.g:3883:1: rule__Diagram__Group_20_3__0 : rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1 ;
    public final void rule__Diagram__Group_20_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3887:1: ( rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1 )
            // InternalSiriusTextDsl.g:3888:2: rule__Diagram__Group_20_3__0__Impl rule__Diagram__Group_20_3__1
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
    // InternalSiriusTextDsl.g:3895:1: rule__Diagram__Group_20_3__0__Impl : ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) ) ;
    public final void rule__Diagram__Group_20_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3899:1: ( ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) ) )
            // InternalSiriusTextDsl.g:3900:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) )
            {
            // InternalSiriusTextDsl.g:3900:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_0 ) )
            // InternalSiriusTextDsl.g:3901:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_0 )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_0()); 
            // InternalSiriusTextDsl.g:3902:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_0 )
            // InternalSiriusTextDsl.g:3902:2: rule__Diagram__AdditionalLayersAssignment_20_3_0
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
    // InternalSiriusTextDsl.g:3912:1: rule__Diagram__Group_20_3__1 : rule__Diagram__Group_20_3__1__Impl ;
    public final void rule__Diagram__Group_20_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3916:1: ( rule__Diagram__Group_20_3__1__Impl )
            // InternalSiriusTextDsl.g:3917:2: rule__Diagram__Group_20_3__1__Impl
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
    // InternalSiriusTextDsl.g:3923:1: rule__Diagram__Group_20_3__1__Impl : ( ( rule__Diagram__Group_20_3_1__0 )* ) ;
    public final void rule__Diagram__Group_20_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3927:1: ( ( ( rule__Diagram__Group_20_3_1__0 )* ) )
            // InternalSiriusTextDsl.g:3928:1: ( ( rule__Diagram__Group_20_3_1__0 )* )
            {
            // InternalSiriusTextDsl.g:3928:1: ( ( rule__Diagram__Group_20_3_1__0 )* )
            // InternalSiriusTextDsl.g:3929:1: ( rule__Diagram__Group_20_3_1__0 )*
            {
             before(grammarAccess.getDiagramAccess().getGroup_20_3_1()); 
            // InternalSiriusTextDsl.g:3930:1: ( rule__Diagram__Group_20_3_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3930:2: rule__Diagram__Group_20_3_1__0
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
    // InternalSiriusTextDsl.g:3944:1: rule__Diagram__Group_20_3_1__0 : rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1 ;
    public final void rule__Diagram__Group_20_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3948:1: ( rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1 )
            // InternalSiriusTextDsl.g:3949:2: rule__Diagram__Group_20_3_1__0__Impl rule__Diagram__Group_20_3_1__1
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
    // InternalSiriusTextDsl.g:3956:1: rule__Diagram__Group_20_3_1__0__Impl : ( ',' ) ;
    public final void rule__Diagram__Group_20_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3960:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:3961:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:3961:1: ( ',' )
            // InternalSiriusTextDsl.g:3962:1: ','
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
    // InternalSiriusTextDsl.g:3975:1: rule__Diagram__Group_20_3_1__1 : rule__Diagram__Group_20_3_1__1__Impl ;
    public final void rule__Diagram__Group_20_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3979:1: ( rule__Diagram__Group_20_3_1__1__Impl )
            // InternalSiriusTextDsl.g:3980:2: rule__Diagram__Group_20_3_1__1__Impl
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
    // InternalSiriusTextDsl.g:3986:1: rule__Diagram__Group_20_3_1__1__Impl : ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) ) ;
    public final void rule__Diagram__Group_20_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:3990:1: ( ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) ) )
            // InternalSiriusTextDsl.g:3991:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) )
            {
            // InternalSiriusTextDsl.g:3991:1: ( ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 ) )
            // InternalSiriusTextDsl.g:3992:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersAssignment_20_3_1_1()); 
            // InternalSiriusTextDsl.g:3993:1: ( rule__Diagram__AdditionalLayersAssignment_20_3_1_1 )
            // InternalSiriusTextDsl.g:3993:2: rule__Diagram__AdditionalLayersAssignment_20_3_1_1
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
    // InternalSiriusTextDsl.g:4007:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4011:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalSiriusTextDsl.g:4012:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalSiriusTextDsl.g:4019:1: rule__Layer__Group__0__Impl : ( ( rule__Layer__DocumentationAssignment_0 )? ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4023:1: ( ( ( rule__Layer__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:4024:1: ( ( rule__Layer__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:4024:1: ( ( rule__Layer__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:4025:1: ( rule__Layer__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getLayerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:4026:1: ( rule__Layer__DocumentationAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DOCUMENTATION) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSiriusTextDsl.g:4026:2: rule__Layer__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:4036:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4040:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalSiriusTextDsl.g:4041:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalSiriusTextDsl.g:4048:1: rule__Layer__Group__1__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4052:1: ( ( 'layer' ) )
            // InternalSiriusTextDsl.g:4053:1: ( 'layer' )
            {
            // InternalSiriusTextDsl.g:4053:1: ( 'layer' )
            // InternalSiriusTextDsl.g:4054:1: 'layer'
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
    // InternalSiriusTextDsl.g:4067:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4071:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalSiriusTextDsl.g:4072:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
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
    // InternalSiriusTextDsl.g:4079:1: rule__Layer__Group__2__Impl : ( ( rule__Layer__NameAssignment_2 ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4083:1: ( ( ( rule__Layer__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:4084:1: ( ( rule__Layer__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:4084:1: ( ( rule__Layer__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:4085:1: ( rule__Layer__NameAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:4086:1: ( rule__Layer__NameAssignment_2 )
            // InternalSiriusTextDsl.g:4086:2: rule__Layer__NameAssignment_2
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
    // InternalSiriusTextDsl.g:4096:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4100:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalSiriusTextDsl.g:4101:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
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
    // InternalSiriusTextDsl.g:4108:1: rule__Layer__Group__3__Impl : ( '{' ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4112:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:4113:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:4113:1: ( '{' )
            // InternalSiriusTextDsl.g:4114:1: '{'
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
    // InternalSiriusTextDsl.g:4127:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4131:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // InternalSiriusTextDsl.g:4132:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
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
    // InternalSiriusTextDsl.g:4139:1: rule__Layer__Group__4__Impl : ( ( rule__Layer__Group_4__0 )? ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4143:1: ( ( ( rule__Layer__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:4144:1: ( ( rule__Layer__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:4144:1: ( ( rule__Layer__Group_4__0 )? )
            // InternalSiriusTextDsl.g:4145:1: ( rule__Layer__Group_4__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:4146:1: ( rule__Layer__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:4146:2: rule__Layer__Group_4__0
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
    // InternalSiriusTextDsl.g:4156:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl rule__Layer__Group__6 ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4160:1: ( rule__Layer__Group__5__Impl rule__Layer__Group__6 )
            // InternalSiriusTextDsl.g:4161:2: rule__Layer__Group__5__Impl rule__Layer__Group__6
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
    // InternalSiriusTextDsl.g:4168:1: rule__Layer__Group__5__Impl : ( 'mappings' ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4172:1: ( ( 'mappings' ) )
            // InternalSiriusTextDsl.g:4173:1: ( 'mappings' )
            {
            // InternalSiriusTextDsl.g:4173:1: ( 'mappings' )
            // InternalSiriusTextDsl.g:4174:1: 'mappings'
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
    // InternalSiriusTextDsl.g:4187:1: rule__Layer__Group__6 : rule__Layer__Group__6__Impl rule__Layer__Group__7 ;
    public final void rule__Layer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4191:1: ( rule__Layer__Group__6__Impl rule__Layer__Group__7 )
            // InternalSiriusTextDsl.g:4192:2: rule__Layer__Group__6__Impl rule__Layer__Group__7
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
    // InternalSiriusTextDsl.g:4199:1: rule__Layer__Group__6__Impl : ( '=' ) ;
    public final void rule__Layer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4203:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4204:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4204:1: ( '=' )
            // InternalSiriusTextDsl.g:4205:1: '='
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
    // InternalSiriusTextDsl.g:4218:1: rule__Layer__Group__7 : rule__Layer__Group__7__Impl rule__Layer__Group__8 ;
    public final void rule__Layer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4222:1: ( rule__Layer__Group__7__Impl rule__Layer__Group__8 )
            // InternalSiriusTextDsl.g:4223:2: rule__Layer__Group__7__Impl rule__Layer__Group__8
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
    // InternalSiriusTextDsl.g:4230:1: rule__Layer__Group__7__Impl : ( '[' ) ;
    public final void rule__Layer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4234:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4235:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4235:1: ( '[' )
            // InternalSiriusTextDsl.g:4236:1: '['
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
    // InternalSiriusTextDsl.g:4249:1: rule__Layer__Group__8 : rule__Layer__Group__8__Impl rule__Layer__Group__9 ;
    public final void rule__Layer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4253:1: ( rule__Layer__Group__8__Impl rule__Layer__Group__9 )
            // InternalSiriusTextDsl.g:4254:2: rule__Layer__Group__8__Impl rule__Layer__Group__9
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
    // InternalSiriusTextDsl.g:4261:1: rule__Layer__Group__8__Impl : ( ( rule__Layer__Group_8__0 )? ) ;
    public final void rule__Layer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4265:1: ( ( ( rule__Layer__Group_8__0 )? ) )
            // InternalSiriusTextDsl.g:4266:1: ( ( rule__Layer__Group_8__0 )? )
            {
            // InternalSiriusTextDsl.g:4266:1: ( ( rule__Layer__Group_8__0 )? )
            // InternalSiriusTextDsl.g:4267:1: ( rule__Layer__Group_8__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_8()); 
            // InternalSiriusTextDsl.g:4268:1: ( rule__Layer__Group_8__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:4268:2: rule__Layer__Group_8__0
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
    // InternalSiriusTextDsl.g:4278:1: rule__Layer__Group__9 : rule__Layer__Group__9__Impl rule__Layer__Group__10 ;
    public final void rule__Layer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4282:1: ( rule__Layer__Group__9__Impl rule__Layer__Group__10 )
            // InternalSiriusTextDsl.g:4283:2: rule__Layer__Group__9__Impl rule__Layer__Group__10
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
    // InternalSiriusTextDsl.g:4290:1: rule__Layer__Group__9__Impl : ( ']' ) ;
    public final void rule__Layer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4294:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4295:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4295:1: ( ']' )
            // InternalSiriusTextDsl.g:4296:1: ']'
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
    // InternalSiriusTextDsl.g:4309:1: rule__Layer__Group__10 : rule__Layer__Group__10__Impl rule__Layer__Group__11 ;
    public final void rule__Layer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4313:1: ( rule__Layer__Group__10__Impl rule__Layer__Group__11 )
            // InternalSiriusTextDsl.g:4314:2: rule__Layer__Group__10__Impl rule__Layer__Group__11
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
    // InternalSiriusTextDsl.g:4321:1: rule__Layer__Group__10__Impl : ( 'edges' ) ;
    public final void rule__Layer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4325:1: ( ( 'edges' ) )
            // InternalSiriusTextDsl.g:4326:1: ( 'edges' )
            {
            // InternalSiriusTextDsl.g:4326:1: ( 'edges' )
            // InternalSiriusTextDsl.g:4327:1: 'edges'
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
    // InternalSiriusTextDsl.g:4340:1: rule__Layer__Group__11 : rule__Layer__Group__11__Impl rule__Layer__Group__12 ;
    public final void rule__Layer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4344:1: ( rule__Layer__Group__11__Impl rule__Layer__Group__12 )
            // InternalSiriusTextDsl.g:4345:2: rule__Layer__Group__11__Impl rule__Layer__Group__12
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
    // InternalSiriusTextDsl.g:4352:1: rule__Layer__Group__11__Impl : ( '=' ) ;
    public final void rule__Layer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4356:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4357:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4357:1: ( '=' )
            // InternalSiriusTextDsl.g:4358:1: '='
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
    // InternalSiriusTextDsl.g:4371:1: rule__Layer__Group__12 : rule__Layer__Group__12__Impl rule__Layer__Group__13 ;
    public final void rule__Layer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4375:1: ( rule__Layer__Group__12__Impl rule__Layer__Group__13 )
            // InternalSiriusTextDsl.g:4376:2: rule__Layer__Group__12__Impl rule__Layer__Group__13
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
    // InternalSiriusTextDsl.g:4383:1: rule__Layer__Group__12__Impl : ( '[' ) ;
    public final void rule__Layer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4387:1: ( ( '[' ) )
            // InternalSiriusTextDsl.g:4388:1: ( '[' )
            {
            // InternalSiriusTextDsl.g:4388:1: ( '[' )
            // InternalSiriusTextDsl.g:4389:1: '['
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
    // InternalSiriusTextDsl.g:4402:1: rule__Layer__Group__13 : rule__Layer__Group__13__Impl rule__Layer__Group__14 ;
    public final void rule__Layer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4406:1: ( rule__Layer__Group__13__Impl rule__Layer__Group__14 )
            // InternalSiriusTextDsl.g:4407:2: rule__Layer__Group__13__Impl rule__Layer__Group__14
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
    // InternalSiriusTextDsl.g:4414:1: rule__Layer__Group__13__Impl : ( ']' ) ;
    public final void rule__Layer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4418:1: ( ( ']' ) )
            // InternalSiriusTextDsl.g:4419:1: ( ']' )
            {
            // InternalSiriusTextDsl.g:4419:1: ( ']' )
            // InternalSiriusTextDsl.g:4420:1: ']'
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
    // InternalSiriusTextDsl.g:4433:1: rule__Layer__Group__14 : rule__Layer__Group__14__Impl ;
    public final void rule__Layer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4437:1: ( rule__Layer__Group__14__Impl )
            // InternalSiriusTextDsl.g:4438:2: rule__Layer__Group__14__Impl
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
    // InternalSiriusTextDsl.g:4444:1: rule__Layer__Group__14__Impl : ( '}' ) ;
    public final void rule__Layer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4448:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:4449:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:4449:1: ( '}' )
            // InternalSiriusTextDsl.g:4450:1: '}'
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
    // InternalSiriusTextDsl.g:4493:1: rule__Layer__Group_4__0 : rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1 ;
    public final void rule__Layer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4497:1: ( rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1 )
            // InternalSiriusTextDsl.g:4498:2: rule__Layer__Group_4__0__Impl rule__Layer__Group_4__1
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
    // InternalSiriusTextDsl.g:4505:1: rule__Layer__Group_4__0__Impl : ( 'icon' ) ;
    public final void rule__Layer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4509:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:4510:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:4510:1: ( 'icon' )
            // InternalSiriusTextDsl.g:4511:1: 'icon'
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
    // InternalSiriusTextDsl.g:4524:1: rule__Layer__Group_4__1 : rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2 ;
    public final void rule__Layer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4528:1: ( rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2 )
            // InternalSiriusTextDsl.g:4529:2: rule__Layer__Group_4__1__Impl rule__Layer__Group_4__2
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
    // InternalSiriusTextDsl.g:4536:1: rule__Layer__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Layer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4540:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:4541:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:4541:1: ( '=' )
            // InternalSiriusTextDsl.g:4542:1: '='
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
    // InternalSiriusTextDsl.g:4555:1: rule__Layer__Group_4__2 : rule__Layer__Group_4__2__Impl ;
    public final void rule__Layer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4559:1: ( rule__Layer__Group_4__2__Impl )
            // InternalSiriusTextDsl.g:4560:2: rule__Layer__Group_4__2__Impl
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
    // InternalSiriusTextDsl.g:4566:1: rule__Layer__Group_4__2__Impl : ( ( rule__Layer__IconAssignment_4_2 ) ) ;
    public final void rule__Layer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4570:1: ( ( ( rule__Layer__IconAssignment_4_2 ) ) )
            // InternalSiriusTextDsl.g:4571:1: ( ( rule__Layer__IconAssignment_4_2 ) )
            {
            // InternalSiriusTextDsl.g:4571:1: ( ( rule__Layer__IconAssignment_4_2 ) )
            // InternalSiriusTextDsl.g:4572:1: ( rule__Layer__IconAssignment_4_2 )
            {
             before(grammarAccess.getLayerAccess().getIconAssignment_4_2()); 
            // InternalSiriusTextDsl.g:4573:1: ( rule__Layer__IconAssignment_4_2 )
            // InternalSiriusTextDsl.g:4573:2: rule__Layer__IconAssignment_4_2
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
    // InternalSiriusTextDsl.g:4589:1: rule__Layer__Group_8__0 : rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1 ;
    public final void rule__Layer__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4593:1: ( rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1 )
            // InternalSiriusTextDsl.g:4594:2: rule__Layer__Group_8__0__Impl rule__Layer__Group_8__1
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
    // InternalSiriusTextDsl.g:4601:1: rule__Layer__Group_8__0__Impl : ( ( rule__Layer__MappingsAssignment_8_0 ) ) ;
    public final void rule__Layer__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4605:1: ( ( ( rule__Layer__MappingsAssignment_8_0 ) ) )
            // InternalSiriusTextDsl.g:4606:1: ( ( rule__Layer__MappingsAssignment_8_0 ) )
            {
            // InternalSiriusTextDsl.g:4606:1: ( ( rule__Layer__MappingsAssignment_8_0 ) )
            // InternalSiriusTextDsl.g:4607:1: ( rule__Layer__MappingsAssignment_8_0 )
            {
             before(grammarAccess.getLayerAccess().getMappingsAssignment_8_0()); 
            // InternalSiriusTextDsl.g:4608:1: ( rule__Layer__MappingsAssignment_8_0 )
            // InternalSiriusTextDsl.g:4608:2: rule__Layer__MappingsAssignment_8_0
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
    // InternalSiriusTextDsl.g:4618:1: rule__Layer__Group_8__1 : rule__Layer__Group_8__1__Impl ;
    public final void rule__Layer__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4622:1: ( rule__Layer__Group_8__1__Impl )
            // InternalSiriusTextDsl.g:4623:2: rule__Layer__Group_8__1__Impl
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
    // InternalSiriusTextDsl.g:4629:1: rule__Layer__Group_8__1__Impl : ( ( rule__Layer__Group_8_1__0 )* ) ;
    public final void rule__Layer__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4633:1: ( ( ( rule__Layer__Group_8_1__0 )* ) )
            // InternalSiriusTextDsl.g:4634:1: ( ( rule__Layer__Group_8_1__0 )* )
            {
            // InternalSiriusTextDsl.g:4634:1: ( ( rule__Layer__Group_8_1__0 )* )
            // InternalSiriusTextDsl.g:4635:1: ( rule__Layer__Group_8_1__0 )*
            {
             before(grammarAccess.getLayerAccess().getGroup_8_1()); 
            // InternalSiriusTextDsl.g:4636:1: ( rule__Layer__Group_8_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:4636:2: rule__Layer__Group_8_1__0
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
    // InternalSiriusTextDsl.g:4650:1: rule__Layer__Group_8_1__0 : rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1 ;
    public final void rule__Layer__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4654:1: ( rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1 )
            // InternalSiriusTextDsl.g:4655:2: rule__Layer__Group_8_1__0__Impl rule__Layer__Group_8_1__1
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
    // InternalSiriusTextDsl.g:4662:1: rule__Layer__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__Layer__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4666:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:4667:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:4667:1: ( ',' )
            // InternalSiriusTextDsl.g:4668:1: ','
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
    // InternalSiriusTextDsl.g:4681:1: rule__Layer__Group_8_1__1 : rule__Layer__Group_8_1__1__Impl ;
    public final void rule__Layer__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4685:1: ( rule__Layer__Group_8_1__1__Impl )
            // InternalSiriusTextDsl.g:4686:2: rule__Layer__Group_8_1__1__Impl
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
    // InternalSiriusTextDsl.g:4692:1: rule__Layer__Group_8_1__1__Impl : ( ( rule__Layer__MappingsAssignment_8_1_1 ) ) ;
    public final void rule__Layer__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4696:1: ( ( ( rule__Layer__MappingsAssignment_8_1_1 ) ) )
            // InternalSiriusTextDsl.g:4697:1: ( ( rule__Layer__MappingsAssignment_8_1_1 ) )
            {
            // InternalSiriusTextDsl.g:4697:1: ( ( rule__Layer__MappingsAssignment_8_1_1 ) )
            // InternalSiriusTextDsl.g:4698:1: ( rule__Layer__MappingsAssignment_8_1_1 )
            {
             before(grammarAccess.getLayerAccess().getMappingsAssignment_8_1_1()); 
            // InternalSiriusTextDsl.g:4699:1: ( rule__Layer__MappingsAssignment_8_1_1 )
            // InternalSiriusTextDsl.g:4699:2: rule__Layer__MappingsAssignment_8_1_1
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
    // InternalSiriusTextDsl.g:4713:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4717:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalSiriusTextDsl.g:4718:2: rule__Container__Group__0__Impl rule__Container__Group__1
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
    // InternalSiriusTextDsl.g:4725:1: rule__Container__Group__0__Impl : ( ( rule__Container__DocumentationAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4729:1: ( ( ( rule__Container__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:4730:1: ( ( rule__Container__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:4730:1: ( ( rule__Container__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:4731:1: ( rule__Container__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:4732:1: ( rule__Container__DocumentationAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DOCUMENTATION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSiriusTextDsl.g:4732:2: rule__Container__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:4742:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4746:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalSiriusTextDsl.g:4747:2: rule__Container__Group__1__Impl rule__Container__Group__2
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
    // InternalSiriusTextDsl.g:4754:1: rule__Container__Group__1__Impl : ( ( rule__Container__ListAssignment_1 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4758:1: ( ( ( rule__Container__ListAssignment_1 )? ) )
            // InternalSiriusTextDsl.g:4759:1: ( ( rule__Container__ListAssignment_1 )? )
            {
            // InternalSiriusTextDsl.g:4759:1: ( ( rule__Container__ListAssignment_1 )? )
            // InternalSiriusTextDsl.g:4760:1: ( rule__Container__ListAssignment_1 )?
            {
             before(grammarAccess.getContainerAccess().getListAssignment_1()); 
            // InternalSiriusTextDsl.g:4761:1: ( rule__Container__ListAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSiriusTextDsl.g:4761:2: rule__Container__ListAssignment_1
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
    // InternalSiriusTextDsl.g:4771:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4775:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalSiriusTextDsl.g:4776:2: rule__Container__Group__2__Impl rule__Container__Group__3
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
    // InternalSiriusTextDsl.g:4783:1: rule__Container__Group__2__Impl : ( 'container' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4787:1: ( ( 'container' ) )
            // InternalSiriusTextDsl.g:4788:1: ( 'container' )
            {
            // InternalSiriusTextDsl.g:4788:1: ( 'container' )
            // InternalSiriusTextDsl.g:4789:1: 'container'
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
    // InternalSiriusTextDsl.g:4802:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4806:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalSiriusTextDsl.g:4807:2: rule__Container__Group__3__Impl rule__Container__Group__4
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
    // InternalSiriusTextDsl.g:4814:1: rule__Container__Group__3__Impl : ( ( rule__Container__NameAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4818:1: ( ( ( rule__Container__NameAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:4819:1: ( ( rule__Container__NameAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:4819:1: ( ( rule__Container__NameAssignment_3 ) )
            // InternalSiriusTextDsl.g:4820:1: ( rule__Container__NameAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_3()); 
            // InternalSiriusTextDsl.g:4821:1: ( rule__Container__NameAssignment_3 )
            // InternalSiriusTextDsl.g:4821:2: rule__Container__NameAssignment_3
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
    // InternalSiriusTextDsl.g:4831:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4835:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalSiriusTextDsl.g:4836:2: rule__Container__Group__4__Impl rule__Container__Group__5
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
    // InternalSiriusTextDsl.g:4843:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )? ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4847:1: ( ( ( rule__Container__Group_4__0 )? ) )
            // InternalSiriusTextDsl.g:4848:1: ( ( rule__Container__Group_4__0 )? )
            {
            // InternalSiriusTextDsl.g:4848:1: ( ( rule__Container__Group_4__0 )? )
            // InternalSiriusTextDsl.g:4849:1: ( rule__Container__Group_4__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // InternalSiriusTextDsl.g:4850:1: ( rule__Container__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSiriusTextDsl.g:4850:2: rule__Container__Group_4__0
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
    // InternalSiriusTextDsl.g:4860:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4864:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalSiriusTextDsl.g:4865:2: rule__Container__Group__5__Impl rule__Container__Group__6
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
    // InternalSiriusTextDsl.g:4872:1: rule__Container__Group__5__Impl : ( 'for' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4876:1: ( ( 'for' ) )
            // InternalSiriusTextDsl.g:4877:1: ( 'for' )
            {
            // InternalSiriusTextDsl.g:4877:1: ( 'for' )
            // InternalSiriusTextDsl.g:4878:1: 'for'
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
    // InternalSiriusTextDsl.g:4891:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4895:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalSiriusTextDsl.g:4896:2: rule__Container__Group__6__Impl rule__Container__Group__7
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
    // InternalSiriusTextDsl.g:4903:1: rule__Container__Group__6__Impl : ( ( rule__Container__DomainClassAssignment_6 ) ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4907:1: ( ( ( rule__Container__DomainClassAssignment_6 ) ) )
            // InternalSiriusTextDsl.g:4908:1: ( ( rule__Container__DomainClassAssignment_6 ) )
            {
            // InternalSiriusTextDsl.g:4908:1: ( ( rule__Container__DomainClassAssignment_6 ) )
            // InternalSiriusTextDsl.g:4909:1: ( rule__Container__DomainClassAssignment_6 )
            {
             before(grammarAccess.getContainerAccess().getDomainClassAssignment_6()); 
            // InternalSiriusTextDsl.g:4910:1: ( rule__Container__DomainClassAssignment_6 )
            // InternalSiriusTextDsl.g:4910:2: rule__Container__DomainClassAssignment_6
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
    // InternalSiriusTextDsl.g:4920:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4924:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalSiriusTextDsl.g:4925:2: rule__Container__Group__7__Impl rule__Container__Group__8
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
    // InternalSiriusTextDsl.g:4932:1: rule__Container__Group__7__Impl : ( 'style' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4936:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:4937:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:4937:1: ( 'style' )
            // InternalSiriusTextDsl.g:4938:1: 'style'
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
    // InternalSiriusTextDsl.g:4951:1: rule__Container__Group__8 : rule__Container__Group__8__Impl rule__Container__Group__9 ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4955:1: ( rule__Container__Group__8__Impl rule__Container__Group__9 )
            // InternalSiriusTextDsl.g:4956:2: rule__Container__Group__8__Impl rule__Container__Group__9
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
    // InternalSiriusTextDsl.g:4963:1: rule__Container__Group__8__Impl : ( ( rule__Container__StyleAssignment_8 ) ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4967:1: ( ( ( rule__Container__StyleAssignment_8 ) ) )
            // InternalSiriusTextDsl.g:4968:1: ( ( rule__Container__StyleAssignment_8 ) )
            {
            // InternalSiriusTextDsl.g:4968:1: ( ( rule__Container__StyleAssignment_8 ) )
            // InternalSiriusTextDsl.g:4969:1: ( rule__Container__StyleAssignment_8 )
            {
             before(grammarAccess.getContainerAccess().getStyleAssignment_8()); 
            // InternalSiriusTextDsl.g:4970:1: ( rule__Container__StyleAssignment_8 )
            // InternalSiriusTextDsl.g:4970:2: rule__Container__StyleAssignment_8
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
    // InternalSiriusTextDsl.g:4980:1: rule__Container__Group__9 : rule__Container__Group__9__Impl rule__Container__Group__10 ;
    public final void rule__Container__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4984:1: ( rule__Container__Group__9__Impl rule__Container__Group__10 )
            // InternalSiriusTextDsl.g:4985:2: rule__Container__Group__9__Impl rule__Container__Group__10
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
    // InternalSiriusTextDsl.g:4992:1: rule__Container__Group__9__Impl : ( ( rule__Container__Group_9__0 )? ) ;
    public final void rule__Container__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:4996:1: ( ( ( rule__Container__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:4997:1: ( ( rule__Container__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:4997:1: ( ( rule__Container__Group_9__0 )? )
            // InternalSiriusTextDsl.g:4998:1: ( rule__Container__Group_9__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:4999:1: ( rule__Container__Group_9__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSiriusTextDsl.g:4999:2: rule__Container__Group_9__0
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
    // InternalSiriusTextDsl.g:5009:1: rule__Container__Group__10 : rule__Container__Group__10__Impl rule__Container__Group__11 ;
    public final void rule__Container__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5013:1: ( rule__Container__Group__10__Impl rule__Container__Group__11 )
            // InternalSiriusTextDsl.g:5014:2: rule__Container__Group__10__Impl rule__Container__Group__11
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
    // InternalSiriusTextDsl.g:5021:1: rule__Container__Group__10__Impl : ( '{' ) ;
    public final void rule__Container__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5025:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:5026:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:5026:1: ( '{' )
            // InternalSiriusTextDsl.g:5027:1: '{'
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
    // InternalSiriusTextDsl.g:5040:1: rule__Container__Group__11 : rule__Container__Group__11__Impl rule__Container__Group__12 ;
    public final void rule__Container__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5044:1: ( rule__Container__Group__11__Impl rule__Container__Group__12 )
            // InternalSiriusTextDsl.g:5045:2: rule__Container__Group__11__Impl rule__Container__Group__12
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
    // InternalSiriusTextDsl.g:5052:1: rule__Container__Group__11__Impl : ( ( rule__Container__Group_11__0 )? ) ;
    public final void rule__Container__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5056:1: ( ( ( rule__Container__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:5057:1: ( ( rule__Container__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:5057:1: ( ( rule__Container__Group_11__0 )? )
            // InternalSiriusTextDsl.g:5058:1: ( rule__Container__Group_11__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:5059:1: ( rule__Container__Group_11__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:5059:2: rule__Container__Group_11__0
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
    // InternalSiriusTextDsl.g:5069:1: rule__Container__Group__12 : rule__Container__Group__12__Impl rule__Container__Group__13 ;
    public final void rule__Container__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5073:1: ( rule__Container__Group__12__Impl rule__Container__Group__13 )
            // InternalSiriusTextDsl.g:5074:2: rule__Container__Group__12__Impl rule__Container__Group__13
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
    // InternalSiriusTextDsl.g:5081:1: rule__Container__Group__12__Impl : ( ( rule__Container__ConditionalStylesAssignment_12 )* ) ;
    public final void rule__Container__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5085:1: ( ( ( rule__Container__ConditionalStylesAssignment_12 )* ) )
            // InternalSiriusTextDsl.g:5086:1: ( ( rule__Container__ConditionalStylesAssignment_12 )* )
            {
            // InternalSiriusTextDsl.g:5086:1: ( ( rule__Container__ConditionalStylesAssignment_12 )* )
            // InternalSiriusTextDsl.g:5087:1: ( rule__Container__ConditionalStylesAssignment_12 )*
            {
             before(grammarAccess.getContainerAccess().getConditionalStylesAssignment_12()); 
            // InternalSiriusTextDsl.g:5088:1: ( rule__Container__ConditionalStylesAssignment_12 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==47) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5088:2: rule__Container__ConditionalStylesAssignment_12
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
    // InternalSiriusTextDsl.g:5098:1: rule__Container__Group__13 : rule__Container__Group__13__Impl ;
    public final void rule__Container__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5102:1: ( rule__Container__Group__13__Impl )
            // InternalSiriusTextDsl.g:5103:2: rule__Container__Group__13__Impl
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
    // InternalSiriusTextDsl.g:5109:1: rule__Container__Group__13__Impl : ( '}' ) ;
    public final void rule__Container__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5113:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:5114:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:5114:1: ( '}' )
            // InternalSiriusTextDsl.g:5115:1: '}'
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
    // InternalSiriusTextDsl.g:5156:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5160:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // InternalSiriusTextDsl.g:5161:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
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
    // InternalSiriusTextDsl.g:5168:1: rule__Container__Group_4__0__Impl : ( 'as' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5172:1: ( ( 'as' ) )
            // InternalSiriusTextDsl.g:5173:1: ( 'as' )
            {
            // InternalSiriusTextDsl.g:5173:1: ( 'as' )
            // InternalSiriusTextDsl.g:5174:1: 'as'
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
    // InternalSiriusTextDsl.g:5187:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5191:1: ( rule__Container__Group_4__1__Impl )
            // InternalSiriusTextDsl.g:5192:2: rule__Container__Group_4__1__Impl
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
    // InternalSiriusTextDsl.g:5198:1: rule__Container__Group_4__1__Impl : ( ( rule__Container__LabelAssignment_4_1 ) ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5202:1: ( ( ( rule__Container__LabelAssignment_4_1 ) ) )
            // InternalSiriusTextDsl.g:5203:1: ( ( rule__Container__LabelAssignment_4_1 ) )
            {
            // InternalSiriusTextDsl.g:5203:1: ( ( rule__Container__LabelAssignment_4_1 ) )
            // InternalSiriusTextDsl.g:5204:1: ( rule__Container__LabelAssignment_4_1 )
            {
             before(grammarAccess.getContainerAccess().getLabelAssignment_4_1()); 
            // InternalSiriusTextDsl.g:5205:1: ( rule__Container__LabelAssignment_4_1 )
            // InternalSiriusTextDsl.g:5205:2: rule__Container__LabelAssignment_4_1
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
    // InternalSiriusTextDsl.g:5219:1: rule__Container__Group_9__0 : rule__Container__Group_9__0__Impl rule__Container__Group_9__1 ;
    public final void rule__Container__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5223:1: ( rule__Container__Group_9__0__Impl rule__Container__Group_9__1 )
            // InternalSiriusTextDsl.g:5224:2: rule__Container__Group_9__0__Impl rule__Container__Group_9__1
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
    // InternalSiriusTextDsl.g:5231:1: rule__Container__Group_9__0__Impl : ( '?' ) ;
    public final void rule__Container__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5235:1: ( ( '?' ) )
            // InternalSiriusTextDsl.g:5236:1: ( '?' )
            {
            // InternalSiriusTextDsl.g:5236:1: ( '?' )
            // InternalSiriusTextDsl.g:5237:1: '?'
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
    // InternalSiriusTextDsl.g:5250:1: rule__Container__Group_9__1 : rule__Container__Group_9__1__Impl ;
    public final void rule__Container__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5254:1: ( rule__Container__Group_9__1__Impl )
            // InternalSiriusTextDsl.g:5255:2: rule__Container__Group_9__1__Impl
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
    // InternalSiriusTextDsl.g:5261:1: rule__Container__Group_9__1__Impl : ( ( rule__Container__PreconditionAssignment_9_1 ) ) ;
    public final void rule__Container__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5265:1: ( ( ( rule__Container__PreconditionAssignment_9_1 ) ) )
            // InternalSiriusTextDsl.g:5266:1: ( ( rule__Container__PreconditionAssignment_9_1 ) )
            {
            // InternalSiriusTextDsl.g:5266:1: ( ( rule__Container__PreconditionAssignment_9_1 ) )
            // InternalSiriusTextDsl.g:5267:1: ( rule__Container__PreconditionAssignment_9_1 )
            {
             before(grammarAccess.getContainerAccess().getPreconditionAssignment_9_1()); 
            // InternalSiriusTextDsl.g:5268:1: ( rule__Container__PreconditionAssignment_9_1 )
            // InternalSiriusTextDsl.g:5268:2: rule__Container__PreconditionAssignment_9_1
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
    // InternalSiriusTextDsl.g:5282:1: rule__Container__Group_11__0 : rule__Container__Group_11__0__Impl rule__Container__Group_11__1 ;
    public final void rule__Container__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5286:1: ( rule__Container__Group_11__0__Impl rule__Container__Group_11__1 )
            // InternalSiriusTextDsl.g:5287:2: rule__Container__Group_11__0__Impl rule__Container__Group_11__1
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
    // InternalSiriusTextDsl.g:5294:1: rule__Container__Group_11__0__Impl : ( 'semanticCandidatesExpression' ) ;
    public final void rule__Container__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5298:1: ( ( 'semanticCandidatesExpression' ) )
            // InternalSiriusTextDsl.g:5299:1: ( 'semanticCandidatesExpression' )
            {
            // InternalSiriusTextDsl.g:5299:1: ( 'semanticCandidatesExpression' )
            // InternalSiriusTextDsl.g:5300:1: 'semanticCandidatesExpression'
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
    // InternalSiriusTextDsl.g:5313:1: rule__Container__Group_11__1 : rule__Container__Group_11__1__Impl rule__Container__Group_11__2 ;
    public final void rule__Container__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5317:1: ( rule__Container__Group_11__1__Impl rule__Container__Group_11__2 )
            // InternalSiriusTextDsl.g:5318:2: rule__Container__Group_11__1__Impl rule__Container__Group_11__2
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
    // InternalSiriusTextDsl.g:5325:1: rule__Container__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5329:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:5330:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:5330:1: ( '=' )
            // InternalSiriusTextDsl.g:5331:1: '='
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
    // InternalSiriusTextDsl.g:5344:1: rule__Container__Group_11__2 : rule__Container__Group_11__2__Impl ;
    public final void rule__Container__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5348:1: ( rule__Container__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:5349:2: rule__Container__Group_11__2__Impl
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
    // InternalSiriusTextDsl.g:5355:1: rule__Container__Group_11__2__Impl : ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) ) ;
    public final void rule__Container__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5359:1: ( ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:5360:1: ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:5360:1: ( ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:5361:1: ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 )
            {
             before(grammarAccess.getContainerAccess().getSemanticCanditatesExpressionAssignment_11_2()); 
            // InternalSiriusTextDsl.g:5362:1: ( rule__Container__SemanticCanditatesExpressionAssignment_11_2 )
            // InternalSiriusTextDsl.g:5362:2: rule__Container__SemanticCanditatesExpressionAssignment_11_2
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
    // InternalSiriusTextDsl.g:5378:1: rule__ConditionalContainerStyleDeclaration__Group__0 : rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5382:1: ( rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1 )
            // InternalSiriusTextDsl.g:5383:2: rule__ConditionalContainerStyleDeclaration__Group__0__Impl rule__ConditionalContainerStyleDeclaration__Group__1
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
    // InternalSiriusTextDsl.g:5390:1: rule__ConditionalContainerStyleDeclaration__Group__0__Impl : ( 'style' ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5394:1: ( ( 'style' ) )
            // InternalSiriusTextDsl.g:5395:1: ( 'style' )
            {
            // InternalSiriusTextDsl.g:5395:1: ( 'style' )
            // InternalSiriusTextDsl.g:5396:1: 'style'
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
    // InternalSiriusTextDsl.g:5409:1: rule__ConditionalContainerStyleDeclaration__Group__1 : rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5413:1: ( rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2 )
            // InternalSiriusTextDsl.g:5414:2: rule__ConditionalContainerStyleDeclaration__Group__1__Impl rule__ConditionalContainerStyleDeclaration__Group__2
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
    // InternalSiriusTextDsl.g:5421:1: rule__ConditionalContainerStyleDeclaration__Group__1__Impl : ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5425:1: ( ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:5426:1: ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:5426:1: ( ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 ) )
            // InternalSiriusTextDsl.g:5427:1: ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleAssignment_1()); 
            // InternalSiriusTextDsl.g:5428:1: ( rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 )
            // InternalSiriusTextDsl.g:5428:2: rule__ConditionalContainerStyleDeclaration__StyleAssignment_1
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
    // InternalSiriusTextDsl.g:5438:1: rule__ConditionalContainerStyleDeclaration__Group__2 : rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3 ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5442:1: ( rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3 )
            // InternalSiriusTextDsl.g:5443:2: rule__ConditionalContainerStyleDeclaration__Group__2__Impl rule__ConditionalContainerStyleDeclaration__Group__3
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
    // InternalSiriusTextDsl.g:5450:1: rule__ConditionalContainerStyleDeclaration__Group__2__Impl : ( 'if' ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5454:1: ( ( 'if' ) )
            // InternalSiriusTextDsl.g:5455:1: ( 'if' )
            {
            // InternalSiriusTextDsl.g:5455:1: ( 'if' )
            // InternalSiriusTextDsl.g:5456:1: 'if'
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
    // InternalSiriusTextDsl.g:5469:1: rule__ConditionalContainerStyleDeclaration__Group__3 : rule__ConditionalContainerStyleDeclaration__Group__3__Impl ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5473:1: ( rule__ConditionalContainerStyleDeclaration__Group__3__Impl )
            // InternalSiriusTextDsl.g:5474:2: rule__ConditionalContainerStyleDeclaration__Group__3__Impl
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
    // InternalSiriusTextDsl.g:5480:1: rule__ConditionalContainerStyleDeclaration__Group__3__Impl : ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5484:1: ( ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:5485:1: ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:5485:1: ( ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 ) )
            // InternalSiriusTextDsl.g:5486:1: ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionAssignment_3()); 
            // InternalSiriusTextDsl.g:5487:1: ( rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 )
            // InternalSiriusTextDsl.g:5487:2: rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3
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
    // InternalSiriusTextDsl.g:5505:1: rule__Gradient__Group__0 : rule__Gradient__Group__0__Impl rule__Gradient__Group__1 ;
    public final void rule__Gradient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5509:1: ( rule__Gradient__Group__0__Impl rule__Gradient__Group__1 )
            // InternalSiriusTextDsl.g:5510:2: rule__Gradient__Group__0__Impl rule__Gradient__Group__1
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
    // InternalSiriusTextDsl.g:5517:1: rule__Gradient__Group__0__Impl : ( ( rule__Gradient__DocumentationAssignment_0 )? ) ;
    public final void rule__Gradient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5521:1: ( ( ( rule__Gradient__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:5522:1: ( ( rule__Gradient__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:5522:1: ( ( rule__Gradient__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:5523:1: ( rule__Gradient__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getGradientAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:5524:1: ( rule__Gradient__DocumentationAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DOCUMENTATION) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSiriusTextDsl.g:5524:2: rule__Gradient__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:5534:1: rule__Gradient__Group__1 : rule__Gradient__Group__1__Impl rule__Gradient__Group__2 ;
    public final void rule__Gradient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5538:1: ( rule__Gradient__Group__1__Impl rule__Gradient__Group__2 )
            // InternalSiriusTextDsl.g:5539:2: rule__Gradient__Group__1__Impl rule__Gradient__Group__2
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
    // InternalSiriusTextDsl.g:5546:1: rule__Gradient__Group__1__Impl : ( 'gradient' ) ;
    public final void rule__Gradient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5550:1: ( ( 'gradient' ) )
            // InternalSiriusTextDsl.g:5551:1: ( 'gradient' )
            {
            // InternalSiriusTextDsl.g:5551:1: ( 'gradient' )
            // InternalSiriusTextDsl.g:5552:1: 'gradient'
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
    // InternalSiriusTextDsl.g:5565:1: rule__Gradient__Group__2 : rule__Gradient__Group__2__Impl rule__Gradient__Group__3 ;
    public final void rule__Gradient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5569:1: ( rule__Gradient__Group__2__Impl rule__Gradient__Group__3 )
            // InternalSiriusTextDsl.g:5570:2: rule__Gradient__Group__2__Impl rule__Gradient__Group__3
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
    // InternalSiriusTextDsl.g:5577:1: rule__Gradient__Group__2__Impl : ( ( rule__Gradient__DirectionAssignment_2 ) ) ;
    public final void rule__Gradient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5581:1: ( ( ( rule__Gradient__DirectionAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:5582:1: ( ( rule__Gradient__DirectionAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:5582:1: ( ( rule__Gradient__DirectionAssignment_2 ) )
            // InternalSiriusTextDsl.g:5583:1: ( rule__Gradient__DirectionAssignment_2 )
            {
             before(grammarAccess.getGradientAccess().getDirectionAssignment_2()); 
            // InternalSiriusTextDsl.g:5584:1: ( rule__Gradient__DirectionAssignment_2 )
            // InternalSiriusTextDsl.g:5584:2: rule__Gradient__DirectionAssignment_2
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
    // InternalSiriusTextDsl.g:5594:1: rule__Gradient__Group__3 : rule__Gradient__Group__3__Impl rule__Gradient__Group__4 ;
    public final void rule__Gradient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5598:1: ( rule__Gradient__Group__3__Impl rule__Gradient__Group__4 )
            // InternalSiriusTextDsl.g:5599:2: rule__Gradient__Group__3__Impl rule__Gradient__Group__4
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
    // InternalSiriusTextDsl.g:5606:1: rule__Gradient__Group__3__Impl : ( ( rule__Gradient__NameAssignment_3 ) ) ;
    public final void rule__Gradient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5610:1: ( ( ( rule__Gradient__NameAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:5611:1: ( ( rule__Gradient__NameAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:5611:1: ( ( rule__Gradient__NameAssignment_3 ) )
            // InternalSiriusTextDsl.g:5612:1: ( rule__Gradient__NameAssignment_3 )
            {
             before(grammarAccess.getGradientAccess().getNameAssignment_3()); 
            // InternalSiriusTextDsl.g:5613:1: ( rule__Gradient__NameAssignment_3 )
            // InternalSiriusTextDsl.g:5613:2: rule__Gradient__NameAssignment_3
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
    // InternalSiriusTextDsl.g:5623:1: rule__Gradient__Group__4 : rule__Gradient__Group__4__Impl rule__Gradient__Group__5 ;
    public final void rule__Gradient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5627:1: ( rule__Gradient__Group__4__Impl rule__Gradient__Group__5 )
            // InternalSiriusTextDsl.g:5628:2: rule__Gradient__Group__4__Impl rule__Gradient__Group__5
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
    // InternalSiriusTextDsl.g:5635:1: rule__Gradient__Group__4__Impl : ( 'from' ) ;
    public final void rule__Gradient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5639:1: ( ( 'from' ) )
            // InternalSiriusTextDsl.g:5640:1: ( 'from' )
            {
            // InternalSiriusTextDsl.g:5640:1: ( 'from' )
            // InternalSiriusTextDsl.g:5641:1: 'from'
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
    // InternalSiriusTextDsl.g:5654:1: rule__Gradient__Group__5 : rule__Gradient__Group__5__Impl rule__Gradient__Group__6 ;
    public final void rule__Gradient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5658:1: ( rule__Gradient__Group__5__Impl rule__Gradient__Group__6 )
            // InternalSiriusTextDsl.g:5659:2: rule__Gradient__Group__5__Impl rule__Gradient__Group__6
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
    // InternalSiriusTextDsl.g:5666:1: rule__Gradient__Group__5__Impl : ( ( rule__Gradient__BackgroundColorAssignment_5 ) ) ;
    public final void rule__Gradient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5670:1: ( ( ( rule__Gradient__BackgroundColorAssignment_5 ) ) )
            // InternalSiriusTextDsl.g:5671:1: ( ( rule__Gradient__BackgroundColorAssignment_5 ) )
            {
            // InternalSiriusTextDsl.g:5671:1: ( ( rule__Gradient__BackgroundColorAssignment_5 ) )
            // InternalSiriusTextDsl.g:5672:1: ( rule__Gradient__BackgroundColorAssignment_5 )
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorAssignment_5()); 
            // InternalSiriusTextDsl.g:5673:1: ( rule__Gradient__BackgroundColorAssignment_5 )
            // InternalSiriusTextDsl.g:5673:2: rule__Gradient__BackgroundColorAssignment_5
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
    // InternalSiriusTextDsl.g:5683:1: rule__Gradient__Group__6 : rule__Gradient__Group__6__Impl rule__Gradient__Group__7 ;
    public final void rule__Gradient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5687:1: ( rule__Gradient__Group__6__Impl rule__Gradient__Group__7 )
            // InternalSiriusTextDsl.g:5688:2: rule__Gradient__Group__6__Impl rule__Gradient__Group__7
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
    // InternalSiriusTextDsl.g:5695:1: rule__Gradient__Group__6__Impl : ( 'to' ) ;
    public final void rule__Gradient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5699:1: ( ( 'to' ) )
            // InternalSiriusTextDsl.g:5700:1: ( 'to' )
            {
            // InternalSiriusTextDsl.g:5700:1: ( 'to' )
            // InternalSiriusTextDsl.g:5701:1: 'to'
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
    // InternalSiriusTextDsl.g:5714:1: rule__Gradient__Group__7 : rule__Gradient__Group__7__Impl rule__Gradient__Group__8 ;
    public final void rule__Gradient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5718:1: ( rule__Gradient__Group__7__Impl rule__Gradient__Group__8 )
            // InternalSiriusTextDsl.g:5719:2: rule__Gradient__Group__7__Impl rule__Gradient__Group__8
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
    // InternalSiriusTextDsl.g:5726:1: rule__Gradient__Group__7__Impl : ( ( rule__Gradient__ForegroundColorAssignment_7 ) ) ;
    public final void rule__Gradient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5730:1: ( ( ( rule__Gradient__ForegroundColorAssignment_7 ) ) )
            // InternalSiriusTextDsl.g:5731:1: ( ( rule__Gradient__ForegroundColorAssignment_7 ) )
            {
            // InternalSiriusTextDsl.g:5731:1: ( ( rule__Gradient__ForegroundColorAssignment_7 ) )
            // InternalSiriusTextDsl.g:5732:1: ( rule__Gradient__ForegroundColorAssignment_7 )
            {
             before(grammarAccess.getGradientAccess().getForegroundColorAssignment_7()); 
            // InternalSiriusTextDsl.g:5733:1: ( rule__Gradient__ForegroundColorAssignment_7 )
            // InternalSiriusTextDsl.g:5733:2: rule__Gradient__ForegroundColorAssignment_7
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
    // InternalSiriusTextDsl.g:5743:1: rule__Gradient__Group__8 : rule__Gradient__Group__8__Impl rule__Gradient__Group__9 ;
    public final void rule__Gradient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5747:1: ( rule__Gradient__Group__8__Impl rule__Gradient__Group__9 )
            // InternalSiriusTextDsl.g:5748:2: rule__Gradient__Group__8__Impl rule__Gradient__Group__9
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
    // InternalSiriusTextDsl.g:5755:1: rule__Gradient__Group__8__Impl : ( '{' ) ;
    public final void rule__Gradient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5759:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:5760:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:5760:1: ( '{' )
            // InternalSiriusTextDsl.g:5761:1: '{'
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
    // InternalSiriusTextDsl.g:5774:1: rule__Gradient__Group__9 : rule__Gradient__Group__9__Impl rule__Gradient__Group__10 ;
    public final void rule__Gradient__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5778:1: ( rule__Gradient__Group__9__Impl rule__Gradient__Group__10 )
            // InternalSiriusTextDsl.g:5779:2: rule__Gradient__Group__9__Impl rule__Gradient__Group__10
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
    // InternalSiriusTextDsl.g:5786:1: rule__Gradient__Group__9__Impl : ( ( rule__Gradient__Group_9__0 )? ) ;
    public final void rule__Gradient__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5790:1: ( ( ( rule__Gradient__Group_9__0 )? ) )
            // InternalSiriusTextDsl.g:5791:1: ( ( rule__Gradient__Group_9__0 )? )
            {
            // InternalSiriusTextDsl.g:5791:1: ( ( rule__Gradient__Group_9__0 )? )
            // InternalSiriusTextDsl.g:5792:1: ( rule__Gradient__Group_9__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_9()); 
            // InternalSiriusTextDsl.g:5793:1: ( rule__Gradient__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSiriusTextDsl.g:5793:2: rule__Gradient__Group_9__0
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
    // InternalSiriusTextDsl.g:5803:1: rule__Gradient__Group__10 : rule__Gradient__Group__10__Impl rule__Gradient__Group__11 ;
    public final void rule__Gradient__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5807:1: ( rule__Gradient__Group__10__Impl rule__Gradient__Group__11 )
            // InternalSiriusTextDsl.g:5808:2: rule__Gradient__Group__10__Impl rule__Gradient__Group__11
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
    // InternalSiriusTextDsl.g:5815:1: rule__Gradient__Group__10__Impl : ( ( rule__Gradient__Group_10__0 )? ) ;
    public final void rule__Gradient__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5819:1: ( ( ( rule__Gradient__Group_10__0 )? ) )
            // InternalSiriusTextDsl.g:5820:1: ( ( rule__Gradient__Group_10__0 )? )
            {
            // InternalSiriusTextDsl.g:5820:1: ( ( rule__Gradient__Group_10__0 )? )
            // InternalSiriusTextDsl.g:5821:1: ( rule__Gradient__Group_10__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_10()); 
            // InternalSiriusTextDsl.g:5822:1: ( rule__Gradient__Group_10__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:5822:2: rule__Gradient__Group_10__0
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
    // InternalSiriusTextDsl.g:5832:1: rule__Gradient__Group__11 : rule__Gradient__Group__11__Impl rule__Gradient__Group__12 ;
    public final void rule__Gradient__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5836:1: ( rule__Gradient__Group__11__Impl rule__Gradient__Group__12 )
            // InternalSiriusTextDsl.g:5837:2: rule__Gradient__Group__11__Impl rule__Gradient__Group__12
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
    // InternalSiriusTextDsl.g:5844:1: rule__Gradient__Group__11__Impl : ( ( rule__Gradient__Group_11__0 )? ) ;
    public final void rule__Gradient__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5848:1: ( ( ( rule__Gradient__Group_11__0 )? ) )
            // InternalSiriusTextDsl.g:5849:1: ( ( rule__Gradient__Group_11__0 )? )
            {
            // InternalSiriusTextDsl.g:5849:1: ( ( rule__Gradient__Group_11__0 )? )
            // InternalSiriusTextDsl.g:5850:1: ( rule__Gradient__Group_11__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_11()); 
            // InternalSiriusTextDsl.g:5851:1: ( rule__Gradient__Group_11__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:5851:2: rule__Gradient__Group_11__0
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
    // InternalSiriusTextDsl.g:5861:1: rule__Gradient__Group__12 : rule__Gradient__Group__12__Impl rule__Gradient__Group__13 ;
    public final void rule__Gradient__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5865:1: ( rule__Gradient__Group__12__Impl rule__Gradient__Group__13 )
            // InternalSiriusTextDsl.g:5866:2: rule__Gradient__Group__12__Impl rule__Gradient__Group__13
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
    // InternalSiriusTextDsl.g:5873:1: rule__Gradient__Group__12__Impl : ( ( rule__Gradient__Group_12__0 )? ) ;
    public final void rule__Gradient__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5877:1: ( ( ( rule__Gradient__Group_12__0 )? ) )
            // InternalSiriusTextDsl.g:5878:1: ( ( rule__Gradient__Group_12__0 )? )
            {
            // InternalSiriusTextDsl.g:5878:1: ( ( rule__Gradient__Group_12__0 )? )
            // InternalSiriusTextDsl.g:5879:1: ( rule__Gradient__Group_12__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_12()); 
            // InternalSiriusTextDsl.g:5880:1: ( rule__Gradient__Group_12__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:5880:2: rule__Gradient__Group_12__0
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
    // InternalSiriusTextDsl.g:5890:1: rule__Gradient__Group__13 : rule__Gradient__Group__13__Impl rule__Gradient__Group__14 ;
    public final void rule__Gradient__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5894:1: ( rule__Gradient__Group__13__Impl rule__Gradient__Group__14 )
            // InternalSiriusTextDsl.g:5895:2: rule__Gradient__Group__13__Impl rule__Gradient__Group__14
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
    // InternalSiriusTextDsl.g:5902:1: rule__Gradient__Group__13__Impl : ( ( rule__Gradient__Group_13__0 )? ) ;
    public final void rule__Gradient__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5906:1: ( ( ( rule__Gradient__Group_13__0 )? ) )
            // InternalSiriusTextDsl.g:5907:1: ( ( rule__Gradient__Group_13__0 )? )
            {
            // InternalSiriusTextDsl.g:5907:1: ( ( rule__Gradient__Group_13__0 )? )
            // InternalSiriusTextDsl.g:5908:1: ( rule__Gradient__Group_13__0 )?
            {
             before(grammarAccess.getGradientAccess().getGroup_13()); 
            // InternalSiriusTextDsl.g:5909:1: ( rule__Gradient__Group_13__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSiriusTextDsl.g:5909:2: rule__Gradient__Group_13__0
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
    // InternalSiriusTextDsl.g:5919:1: rule__Gradient__Group__14 : rule__Gradient__Group__14__Impl ;
    public final void rule__Gradient__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5923:1: ( rule__Gradient__Group__14__Impl )
            // InternalSiriusTextDsl.g:5924:2: rule__Gradient__Group__14__Impl
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
    // InternalSiriusTextDsl.g:5930:1: rule__Gradient__Group__14__Impl : ( '}' ) ;
    public final void rule__Gradient__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5934:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:5935:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:5935:1: ( '}' )
            // InternalSiriusTextDsl.g:5936:1: '}'
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
    // InternalSiriusTextDsl.g:5979:1: rule__Gradient__Group_9__0 : rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1 ;
    public final void rule__Gradient__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5983:1: ( rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1 )
            // InternalSiriusTextDsl.g:5984:2: rule__Gradient__Group_9__0__Impl rule__Gradient__Group_9__1
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
    // InternalSiriusTextDsl.g:5991:1: rule__Gradient__Group_9__0__Impl : ( 'label' ) ;
    public final void rule__Gradient__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:5995:1: ( ( 'label' ) )
            // InternalSiriusTextDsl.g:5996:1: ( 'label' )
            {
            // InternalSiriusTextDsl.g:5996:1: ( 'label' )
            // InternalSiriusTextDsl.g:5997:1: 'label'
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
    // InternalSiriusTextDsl.g:6010:1: rule__Gradient__Group_9__1 : rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2 ;
    public final void rule__Gradient__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6014:1: ( rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2 )
            // InternalSiriusTextDsl.g:6015:2: rule__Gradient__Group_9__1__Impl rule__Gradient__Group_9__2
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
    // InternalSiriusTextDsl.g:6022:1: rule__Gradient__Group_9__1__Impl : ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) ) ;
    public final void rule__Gradient__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6026:1: ( ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) ) )
            // InternalSiriusTextDsl.g:6027:1: ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) )
            {
            // InternalSiriusTextDsl.g:6027:1: ( ( rule__Gradient__LabelAlignmentAssignment_9_1 ) )
            // InternalSiriusTextDsl.g:6028:1: ( rule__Gradient__LabelAlignmentAssignment_9_1 )
            {
             before(grammarAccess.getGradientAccess().getLabelAlignmentAssignment_9_1()); 
            // InternalSiriusTextDsl.g:6029:1: ( rule__Gradient__LabelAlignmentAssignment_9_1 )
            // InternalSiriusTextDsl.g:6029:2: rule__Gradient__LabelAlignmentAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__LabelAlignmentAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getLabelAlignmentAssignment_9_1()); 

            }


            }

        }
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
    // InternalSiriusTextDsl.g:6039:1: rule__Gradient__Group_9__2 : rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3 ;
    public final void rule__Gradient__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6043:1: ( rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3 )
            // InternalSiriusTextDsl.g:6044:2: rule__Gradient__Group_9__2__Impl rule__Gradient__Group_9__3
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
    // InternalSiriusTextDsl.g:6051:1: rule__Gradient__Group_9__2__Impl : ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) ) ;
    public final void rule__Gradient__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6055:1: ( ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) ) )
            // InternalSiriusTextDsl.g:6056:1: ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) )
            {
            // InternalSiriusTextDsl.g:6056:1: ( ( rule__Gradient__LabelExpressionAssignment_9_2 ) )
            // InternalSiriusTextDsl.g:6057:1: ( rule__Gradient__LabelExpressionAssignment_9_2 )
            {
             before(grammarAccess.getGradientAccess().getLabelExpressionAssignment_9_2()); 
            // InternalSiriusTextDsl.g:6058:1: ( rule__Gradient__LabelExpressionAssignment_9_2 )
            // InternalSiriusTextDsl.g:6058:2: rule__Gradient__LabelExpressionAssignment_9_2
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
    // InternalSiriusTextDsl.g:6068:1: rule__Gradient__Group_9__3 : rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4 ;
    public final void rule__Gradient__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6072:1: ( rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4 )
            // InternalSiriusTextDsl.g:6073:2: rule__Gradient__Group_9__3__Impl rule__Gradient__Group_9__4
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
    // InternalSiriusTextDsl.g:6080:1: rule__Gradient__Group_9__3__Impl : ( 'in' ) ;
    public final void rule__Gradient__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6084:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:6085:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:6085:1: ( 'in' )
            // InternalSiriusTextDsl.g:6086:1: 'in'
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
    // InternalSiriusTextDsl.g:6099:1: rule__Gradient__Group_9__4 : rule__Gradient__Group_9__4__Impl ;
    public final void rule__Gradient__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6103:1: ( rule__Gradient__Group_9__4__Impl )
            // InternalSiriusTextDsl.g:6104:2: rule__Gradient__Group_9__4__Impl
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
    // InternalSiriusTextDsl.g:6110:1: rule__Gradient__Group_9__4__Impl : ( ( rule__Gradient__LabelColorAssignment_9_4 ) ) ;
    public final void rule__Gradient__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6114:1: ( ( ( rule__Gradient__LabelColorAssignment_9_4 ) ) )
            // InternalSiriusTextDsl.g:6115:1: ( ( rule__Gradient__LabelColorAssignment_9_4 ) )
            {
            // InternalSiriusTextDsl.g:6115:1: ( ( rule__Gradient__LabelColorAssignment_9_4 ) )
            // InternalSiriusTextDsl.g:6116:1: ( rule__Gradient__LabelColorAssignment_9_4 )
            {
             before(grammarAccess.getGradientAccess().getLabelColorAssignment_9_4()); 
            // InternalSiriusTextDsl.g:6117:1: ( rule__Gradient__LabelColorAssignment_9_4 )
            // InternalSiriusTextDsl.g:6117:2: rule__Gradient__LabelColorAssignment_9_4
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
    // InternalSiriusTextDsl.g:6137:1: rule__Gradient__Group_10__0 : rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1 ;
    public final void rule__Gradient__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6141:1: ( rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1 )
            // InternalSiriusTextDsl.g:6142:2: rule__Gradient__Group_10__0__Impl rule__Gradient__Group_10__1
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
    // InternalSiriusTextDsl.g:6149:1: rule__Gradient__Group_10__0__Impl : ( 'border' ) ;
    public final void rule__Gradient__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6153:1: ( ( 'border' ) )
            // InternalSiriusTextDsl.g:6154:1: ( 'border' )
            {
            // InternalSiriusTextDsl.g:6154:1: ( 'border' )
            // InternalSiriusTextDsl.g:6155:1: 'border'
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
    // InternalSiriusTextDsl.g:6168:1: rule__Gradient__Group_10__1 : rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2 ;
    public final void rule__Gradient__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6172:1: ( rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2 )
            // InternalSiriusTextDsl.g:6173:2: rule__Gradient__Group_10__1__Impl rule__Gradient__Group_10__2
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
    // InternalSiriusTextDsl.g:6180:1: rule__Gradient__Group_10__1__Impl : ( 'size' ) ;
    public final void rule__Gradient__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6184:1: ( ( 'size' ) )
            // InternalSiriusTextDsl.g:6185:1: ( 'size' )
            {
            // InternalSiriusTextDsl.g:6185:1: ( 'size' )
            // InternalSiriusTextDsl.g:6186:1: 'size'
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
    // InternalSiriusTextDsl.g:6199:1: rule__Gradient__Group_10__2 : rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3 ;
    public final void rule__Gradient__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6203:1: ( rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3 )
            // InternalSiriusTextDsl.g:6204:2: rule__Gradient__Group_10__2__Impl rule__Gradient__Group_10__3
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
    // InternalSiriusTextDsl.g:6211:1: rule__Gradient__Group_10__2__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6215:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6216:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6216:1: ( '=' )
            // InternalSiriusTextDsl.g:6217:1: '='
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
    // InternalSiriusTextDsl.g:6230:1: rule__Gradient__Group_10__3 : rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4 ;
    public final void rule__Gradient__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6234:1: ( rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4 )
            // InternalSiriusTextDsl.g:6235:2: rule__Gradient__Group_10__3__Impl rule__Gradient__Group_10__4
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
    // InternalSiriusTextDsl.g:6242:1: rule__Gradient__Group_10__3__Impl : ( ( rule__Gradient__BorderSizeAssignment_10_3 ) ) ;
    public final void rule__Gradient__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6246:1: ( ( ( rule__Gradient__BorderSizeAssignment_10_3 ) ) )
            // InternalSiriusTextDsl.g:6247:1: ( ( rule__Gradient__BorderSizeAssignment_10_3 ) )
            {
            // InternalSiriusTextDsl.g:6247:1: ( ( rule__Gradient__BorderSizeAssignment_10_3 ) )
            // InternalSiriusTextDsl.g:6248:1: ( rule__Gradient__BorderSizeAssignment_10_3 )
            {
             before(grammarAccess.getGradientAccess().getBorderSizeAssignment_10_3()); 
            // InternalSiriusTextDsl.g:6249:1: ( rule__Gradient__BorderSizeAssignment_10_3 )
            // InternalSiriusTextDsl.g:6249:2: rule__Gradient__BorderSizeAssignment_10_3
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
    // InternalSiriusTextDsl.g:6259:1: rule__Gradient__Group_10__4 : rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5 ;
    public final void rule__Gradient__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6263:1: ( rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5 )
            // InternalSiriusTextDsl.g:6264:2: rule__Gradient__Group_10__4__Impl rule__Gradient__Group_10__5
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
    // InternalSiriusTextDsl.g:6271:1: rule__Gradient__Group_10__4__Impl : ( 'in' ) ;
    public final void rule__Gradient__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6275:1: ( ( 'in' ) )
            // InternalSiriusTextDsl.g:6276:1: ( 'in' )
            {
            // InternalSiriusTextDsl.g:6276:1: ( 'in' )
            // InternalSiriusTextDsl.g:6277:1: 'in'
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
    // InternalSiriusTextDsl.g:6290:1: rule__Gradient__Group_10__5 : rule__Gradient__Group_10__5__Impl ;
    public final void rule__Gradient__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6294:1: ( rule__Gradient__Group_10__5__Impl )
            // InternalSiriusTextDsl.g:6295:2: rule__Gradient__Group_10__5__Impl
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
    // InternalSiriusTextDsl.g:6301:1: rule__Gradient__Group_10__5__Impl : ( ( rule__Gradient__BorderColorAssignment_10_5 ) ) ;
    public final void rule__Gradient__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6305:1: ( ( ( rule__Gradient__BorderColorAssignment_10_5 ) ) )
            // InternalSiriusTextDsl.g:6306:1: ( ( rule__Gradient__BorderColorAssignment_10_5 ) )
            {
            // InternalSiriusTextDsl.g:6306:1: ( ( rule__Gradient__BorderColorAssignment_10_5 ) )
            // InternalSiriusTextDsl.g:6307:1: ( rule__Gradient__BorderColorAssignment_10_5 )
            {
             before(grammarAccess.getGradientAccess().getBorderColorAssignment_10_5()); 
            // InternalSiriusTextDsl.g:6308:1: ( rule__Gradient__BorderColorAssignment_10_5 )
            // InternalSiriusTextDsl.g:6308:2: rule__Gradient__BorderColorAssignment_10_5
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
    // InternalSiriusTextDsl.g:6330:1: rule__Gradient__Group_11__0 : rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1 ;
    public final void rule__Gradient__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6334:1: ( rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1 )
            // InternalSiriusTextDsl.g:6335:2: rule__Gradient__Group_11__0__Impl rule__Gradient__Group_11__1
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
    // InternalSiriusTextDsl.g:6342:1: rule__Gradient__Group_11__0__Impl : ( 'icon' ) ;
    public final void rule__Gradient__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6346:1: ( ( 'icon' ) )
            // InternalSiriusTextDsl.g:6347:1: ( 'icon' )
            {
            // InternalSiriusTextDsl.g:6347:1: ( 'icon' )
            // InternalSiriusTextDsl.g:6348:1: 'icon'
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
    // InternalSiriusTextDsl.g:6361:1: rule__Gradient__Group_11__1 : rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2 ;
    public final void rule__Gradient__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6365:1: ( rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2 )
            // InternalSiriusTextDsl.g:6366:2: rule__Gradient__Group_11__1__Impl rule__Gradient__Group_11__2
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
    // InternalSiriusTextDsl.g:6373:1: rule__Gradient__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6377:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6378:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6378:1: ( '=' )
            // InternalSiriusTextDsl.g:6379:1: '='
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
    // InternalSiriusTextDsl.g:6392:1: rule__Gradient__Group_11__2 : rule__Gradient__Group_11__2__Impl ;
    public final void rule__Gradient__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6396:1: ( rule__Gradient__Group_11__2__Impl )
            // InternalSiriusTextDsl.g:6397:2: rule__Gradient__Group_11__2__Impl
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
    // InternalSiriusTextDsl.g:6403:1: rule__Gradient__Group_11__2__Impl : ( ( rule__Gradient__IconAssignment_11_2 ) ) ;
    public final void rule__Gradient__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6407:1: ( ( ( rule__Gradient__IconAssignment_11_2 ) ) )
            // InternalSiriusTextDsl.g:6408:1: ( ( rule__Gradient__IconAssignment_11_2 ) )
            {
            // InternalSiriusTextDsl.g:6408:1: ( ( rule__Gradient__IconAssignment_11_2 ) )
            // InternalSiriusTextDsl.g:6409:1: ( rule__Gradient__IconAssignment_11_2 )
            {
             before(grammarAccess.getGradientAccess().getIconAssignment_11_2()); 
            // InternalSiriusTextDsl.g:6410:1: ( rule__Gradient__IconAssignment_11_2 )
            // InternalSiriusTextDsl.g:6410:2: rule__Gradient__IconAssignment_11_2
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
    // InternalSiriusTextDsl.g:6426:1: rule__Gradient__Group_12__0 : rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1 ;
    public final void rule__Gradient__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6430:1: ( rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1 )
            // InternalSiriusTextDsl.g:6431:2: rule__Gradient__Group_12__0__Impl rule__Gradient__Group_12__1
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
    // InternalSiriusTextDsl.g:6438:1: rule__Gradient__Group_12__0__Impl : ( 'heightComputationExpression' ) ;
    public final void rule__Gradient__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6442:1: ( ( 'heightComputationExpression' ) )
            // InternalSiriusTextDsl.g:6443:1: ( 'heightComputationExpression' )
            {
            // InternalSiriusTextDsl.g:6443:1: ( 'heightComputationExpression' )
            // InternalSiriusTextDsl.g:6444:1: 'heightComputationExpression'
            {
             before(grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0()); 

            }


            }

        }
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
    // InternalSiriusTextDsl.g:6457:1: rule__Gradient__Group_12__1 : rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2 ;
    public final void rule__Gradient__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6461:1: ( rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2 )
            // InternalSiriusTextDsl.g:6462:2: rule__Gradient__Group_12__1__Impl rule__Gradient__Group_12__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSiriusTextDsl.g:6469:1: rule__Gradient__Group_12__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6473:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6474:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6474:1: ( '=' )
            // InternalSiriusTextDsl.g:6475:1: '='
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
    // InternalSiriusTextDsl.g:6488:1: rule__Gradient__Group_12__2 : rule__Gradient__Group_12__2__Impl ;
    public final void rule__Gradient__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6492:1: ( rule__Gradient__Group_12__2__Impl )
            // InternalSiriusTextDsl.g:6493:2: rule__Gradient__Group_12__2__Impl
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
    // InternalSiriusTextDsl.g:6499:1: rule__Gradient__Group_12__2__Impl : ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) ) ;
    public final void rule__Gradient__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6503:1: ( ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) ) )
            // InternalSiriusTextDsl.g:6504:1: ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) )
            {
            // InternalSiriusTextDsl.g:6504:1: ( ( rule__Gradient__HeightComputationExpressionAssignment_12_2 ) )
            // InternalSiriusTextDsl.g:6505:1: ( rule__Gradient__HeightComputationExpressionAssignment_12_2 )
            {
             before(grammarAccess.getGradientAccess().getHeightComputationExpressionAssignment_12_2()); 
            // InternalSiriusTextDsl.g:6506:1: ( rule__Gradient__HeightComputationExpressionAssignment_12_2 )
            // InternalSiriusTextDsl.g:6506:2: rule__Gradient__HeightComputationExpressionAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__HeightComputationExpressionAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getHeightComputationExpressionAssignment_12_2()); 

            }


            }

        }
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
    // InternalSiriusTextDsl.g:6522:1: rule__Gradient__Group_13__0 : rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1 ;
    public final void rule__Gradient__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6526:1: ( rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1 )
            // InternalSiriusTextDsl.g:6527:2: rule__Gradient__Group_13__0__Impl rule__Gradient__Group_13__1
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
    // InternalSiriusTextDsl.g:6534:1: rule__Gradient__Group_13__0__Impl : ( 'widthComputationExpression' ) ;
    public final void rule__Gradient__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6538:1: ( ( 'widthComputationExpression' ) )
            // InternalSiriusTextDsl.g:6539:1: ( 'widthComputationExpression' )
            {
            // InternalSiriusTextDsl.g:6539:1: ( 'widthComputationExpression' )
            // InternalSiriusTextDsl.g:6540:1: 'widthComputationExpression'
            {
             before(grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0()); 

            }


            }

        }
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
    // InternalSiriusTextDsl.g:6553:1: rule__Gradient__Group_13__1 : rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2 ;
    public final void rule__Gradient__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6557:1: ( rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2 )
            // InternalSiriusTextDsl.g:6558:2: rule__Gradient__Group_13__1__Impl rule__Gradient__Group_13__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSiriusTextDsl.g:6565:1: rule__Gradient__Group_13__1__Impl : ( '=' ) ;
    public final void rule__Gradient__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6569:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6570:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6570:1: ( '=' )
            // InternalSiriusTextDsl.g:6571:1: '='
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
    // InternalSiriusTextDsl.g:6584:1: rule__Gradient__Group_13__2 : rule__Gradient__Group_13__2__Impl ;
    public final void rule__Gradient__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6588:1: ( rule__Gradient__Group_13__2__Impl )
            // InternalSiriusTextDsl.g:6589:2: rule__Gradient__Group_13__2__Impl
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
    // InternalSiriusTextDsl.g:6595:1: rule__Gradient__Group_13__2__Impl : ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) ) ;
    public final void rule__Gradient__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6599:1: ( ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) ) )
            // InternalSiriusTextDsl.g:6600:1: ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) )
            {
            // InternalSiriusTextDsl.g:6600:1: ( ( rule__Gradient__WidthComputationExpressionAssignment_13_2 ) )
            // InternalSiriusTextDsl.g:6601:1: ( rule__Gradient__WidthComputationExpressionAssignment_13_2 )
            {
             before(grammarAccess.getGradientAccess().getWidthComputationExpressionAssignment_13_2()); 
            // InternalSiriusTextDsl.g:6602:1: ( rule__Gradient__WidthComputationExpressionAssignment_13_2 )
            // InternalSiriusTextDsl.g:6602:2: rule__Gradient__WidthComputationExpressionAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Gradient__WidthComputationExpressionAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getGradientAccess().getWidthComputationExpressionAssignment_13_2()); 

            }


            }

        }
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
    // InternalSiriusTextDsl.g:6618:1: rule__Palette__Group__0 : rule__Palette__Group__0__Impl rule__Palette__Group__1 ;
    public final void rule__Palette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6622:1: ( rule__Palette__Group__0__Impl rule__Palette__Group__1 )
            // InternalSiriusTextDsl.g:6623:2: rule__Palette__Group__0__Impl rule__Palette__Group__1
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
    // InternalSiriusTextDsl.g:6630:1: rule__Palette__Group__0__Impl : ( ( rule__Palette__DocumentationAssignment_0 )? ) ;
    public final void rule__Palette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6634:1: ( ( ( rule__Palette__DocumentationAssignment_0 )? ) )
            // InternalSiriusTextDsl.g:6635:1: ( ( rule__Palette__DocumentationAssignment_0 )? )
            {
            // InternalSiriusTextDsl.g:6635:1: ( ( rule__Palette__DocumentationAssignment_0 )? )
            // InternalSiriusTextDsl.g:6636:1: ( rule__Palette__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getPaletteAccess().getDocumentationAssignment_0()); 
            // InternalSiriusTextDsl.g:6637:1: ( rule__Palette__DocumentationAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DOCUMENTATION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSiriusTextDsl.g:6637:2: rule__Palette__DocumentationAssignment_0
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
    // InternalSiriusTextDsl.g:6647:1: rule__Palette__Group__1 : rule__Palette__Group__1__Impl rule__Palette__Group__2 ;
    public final void rule__Palette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6651:1: ( rule__Palette__Group__1__Impl rule__Palette__Group__2 )
            // InternalSiriusTextDsl.g:6652:2: rule__Palette__Group__1__Impl rule__Palette__Group__2
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
    // InternalSiriusTextDsl.g:6659:1: rule__Palette__Group__1__Impl : ( 'palette' ) ;
    public final void rule__Palette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6663:1: ( ( 'palette' ) )
            // InternalSiriusTextDsl.g:6664:1: ( 'palette' )
            {
            // InternalSiriusTextDsl.g:6664:1: ( 'palette' )
            // InternalSiriusTextDsl.g:6665:1: 'palette'
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
    // InternalSiriusTextDsl.g:6678:1: rule__Palette__Group__2 : rule__Palette__Group__2__Impl rule__Palette__Group__3 ;
    public final void rule__Palette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6682:1: ( rule__Palette__Group__2__Impl rule__Palette__Group__3 )
            // InternalSiriusTextDsl.g:6683:2: rule__Palette__Group__2__Impl rule__Palette__Group__3
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
    // InternalSiriusTextDsl.g:6690:1: rule__Palette__Group__2__Impl : ( ( rule__Palette__NameAssignment_2 ) ) ;
    public final void rule__Palette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6694:1: ( ( ( rule__Palette__NameAssignment_2 ) ) )
            // InternalSiriusTextDsl.g:6695:1: ( ( rule__Palette__NameAssignment_2 ) )
            {
            // InternalSiriusTextDsl.g:6695:1: ( ( rule__Palette__NameAssignment_2 ) )
            // InternalSiriusTextDsl.g:6696:1: ( rule__Palette__NameAssignment_2 )
            {
             before(grammarAccess.getPaletteAccess().getNameAssignment_2()); 
            // InternalSiriusTextDsl.g:6697:1: ( rule__Palette__NameAssignment_2 )
            // InternalSiriusTextDsl.g:6697:2: rule__Palette__NameAssignment_2
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
    // InternalSiriusTextDsl.g:6707:1: rule__Palette__Group__3 : rule__Palette__Group__3__Impl rule__Palette__Group__4 ;
    public final void rule__Palette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6711:1: ( rule__Palette__Group__3__Impl rule__Palette__Group__4 )
            // InternalSiriusTextDsl.g:6712:2: rule__Palette__Group__3__Impl rule__Palette__Group__4
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
    // InternalSiriusTextDsl.g:6719:1: rule__Palette__Group__3__Impl : ( '{' ) ;
    public final void rule__Palette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6723:1: ( ( '{' ) )
            // InternalSiriusTextDsl.g:6724:1: ( '{' )
            {
            // InternalSiriusTextDsl.g:6724:1: ( '{' )
            // InternalSiriusTextDsl.g:6725:1: '{'
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
    // InternalSiriusTextDsl.g:6738:1: rule__Palette__Group__4 : rule__Palette__Group__4__Impl rule__Palette__Group__5 ;
    public final void rule__Palette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6742:1: ( rule__Palette__Group__4__Impl rule__Palette__Group__5 )
            // InternalSiriusTextDsl.g:6743:2: rule__Palette__Group__4__Impl rule__Palette__Group__5
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
    // InternalSiriusTextDsl.g:6750:1: rule__Palette__Group__4__Impl : ( ( rule__Palette__ColorsAssignment_4 )* ) ;
    public final void rule__Palette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6754:1: ( ( ( rule__Palette__ColorsAssignment_4 )* ) )
            // InternalSiriusTextDsl.g:6755:1: ( ( rule__Palette__ColorsAssignment_4 )* )
            {
            // InternalSiriusTextDsl.g:6755:1: ( ( rule__Palette__ColorsAssignment_4 )* )
            // InternalSiriusTextDsl.g:6756:1: ( rule__Palette__ColorsAssignment_4 )*
            {
             before(grammarAccess.getPaletteAccess().getColorsAssignment_4()); 
            // InternalSiriusTextDsl.g:6757:1: ( rule__Palette__ColorsAssignment_4 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==60) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:6757:2: rule__Palette__ColorsAssignment_4
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
    // InternalSiriusTextDsl.g:6767:1: rule__Palette__Group__5 : rule__Palette__Group__5__Impl ;
    public final void rule__Palette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6771:1: ( rule__Palette__Group__5__Impl )
            // InternalSiriusTextDsl.g:6772:2: rule__Palette__Group__5__Impl
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
    // InternalSiriusTextDsl.g:6778:1: rule__Palette__Group__5__Impl : ( '}' ) ;
    public final void rule__Palette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6782:1: ( ( '}' ) )
            // InternalSiriusTextDsl.g:6783:1: ( '}' )
            {
            // InternalSiriusTextDsl.g:6783:1: ( '}' )
            // InternalSiriusTextDsl.g:6784:1: '}'
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
    // InternalSiriusTextDsl.g:6809:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6813:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalSiriusTextDsl.g:6814:2: rule__Color__Group__0__Impl rule__Color__Group__1
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
    // InternalSiriusTextDsl.g:6821:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6825:1: ( ( 'color' ) )
            // InternalSiriusTextDsl.g:6826:1: ( 'color' )
            {
            // InternalSiriusTextDsl.g:6826:1: ( 'color' )
            // InternalSiriusTextDsl.g:6827:1: 'color'
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
    // InternalSiriusTextDsl.g:6840:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6844:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalSiriusTextDsl.g:6845:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalSiriusTextDsl.g:6852:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6856:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:6857:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:6857:1: ( ( rule__Color__NameAssignment_1 ) )
            // InternalSiriusTextDsl.g:6858:1: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalSiriusTextDsl.g:6859:1: ( rule__Color__NameAssignment_1 )
            // InternalSiriusTextDsl.g:6859:2: rule__Color__NameAssignment_1
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
    // InternalSiriusTextDsl.g:6869:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6873:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalSiriusTextDsl.g:6874:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalSiriusTextDsl.g:6881:1: rule__Color__Group__2__Impl : ( '=' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6885:1: ( ( '=' ) )
            // InternalSiriusTextDsl.g:6886:1: ( '=' )
            {
            // InternalSiriusTextDsl.g:6886:1: ( '=' )
            // InternalSiriusTextDsl.g:6887:1: '='
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
    // InternalSiriusTextDsl.g:6900:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6904:1: ( rule__Color__Group__3__Impl )
            // InternalSiriusTextDsl.g:6905:2: rule__Color__Group__3__Impl
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
    // InternalSiriusTextDsl.g:6911:1: rule__Color__Group__3__Impl : ( ( rule__Color__ValueAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6915:1: ( ( ( rule__Color__ValueAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:6916:1: ( ( rule__Color__ValueAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:6916:1: ( ( rule__Color__ValueAssignment_3 ) )
            // InternalSiriusTextDsl.g:6917:1: ( rule__Color__ValueAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getValueAssignment_3()); 
            // InternalSiriusTextDsl.g:6918:1: ( rule__Color__ValueAssignment_3 )
            // InternalSiriusTextDsl.g:6918:2: rule__Color__ValueAssignment_3
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


    // $ANTLR start "rule__RGB__Group__0"
    // InternalSiriusTextDsl.g:6936:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6940:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // InternalSiriusTextDsl.g:6941:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__RGB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__1();

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
    // $ANTLR end "rule__RGB__Group__0"


    // $ANTLR start "rule__RGB__Group__0__Impl"
    // InternalSiriusTextDsl.g:6948:1: rule__RGB__Group__0__Impl : ( 'rgb(' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6952:1: ( ( 'rgb(' ) )
            // InternalSiriusTextDsl.g:6953:1: ( 'rgb(' )
            {
            // InternalSiriusTextDsl.g:6953:1: ( 'rgb(' )
            // InternalSiriusTextDsl.g:6954:1: 'rgb('
            {
             before(grammarAccess.getRGBAccess().getRgbKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRgbKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__0__Impl"


    // $ANTLR start "rule__RGB__Group__1"
    // InternalSiriusTextDsl.g:6967:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6971:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // InternalSiriusTextDsl.g:6972:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RGB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__2();

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
    // $ANTLR end "rule__RGB__Group__1"


    // $ANTLR start "rule__RGB__Group__1__Impl"
    // InternalSiriusTextDsl.g:6979:1: rule__RGB__Group__1__Impl : ( ( rule__RGB__RedAssignment_1 ) ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:6983:1: ( ( ( rule__RGB__RedAssignment_1 ) ) )
            // InternalSiriusTextDsl.g:6984:1: ( ( rule__RGB__RedAssignment_1 ) )
            {
            // InternalSiriusTextDsl.g:6984:1: ( ( rule__RGB__RedAssignment_1 ) )
            // InternalSiriusTextDsl.g:6985:1: ( rule__RGB__RedAssignment_1 )
            {
             before(grammarAccess.getRGBAccess().getRedAssignment_1()); 
            // InternalSiriusTextDsl.g:6986:1: ( rule__RGB__RedAssignment_1 )
            // InternalSiriusTextDsl.g:6986:2: rule__RGB__RedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RGB__RedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getRedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__1__Impl"


    // $ANTLR start "rule__RGB__Group__2"
    // InternalSiriusTextDsl.g:6996:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7000:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // InternalSiriusTextDsl.g:7001:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__RGB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__3();

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
    // $ANTLR end "rule__RGB__Group__2"


    // $ANTLR start "rule__RGB__Group__2__Impl"
    // InternalSiriusTextDsl.g:7008:1: rule__RGB__Group__2__Impl : ( ',' ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7012:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:7013:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:7013:1: ( ',' )
            // InternalSiriusTextDsl.g:7014:1: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__2__Impl"


    // $ANTLR start "rule__RGB__Group__3"
    // InternalSiriusTextDsl.g:7027:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7031:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // InternalSiriusTextDsl.g:7032:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RGB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__4();

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
    // $ANTLR end "rule__RGB__Group__3"


    // $ANTLR start "rule__RGB__Group__3__Impl"
    // InternalSiriusTextDsl.g:7039:1: rule__RGB__Group__3__Impl : ( ( rule__RGB__GreenAssignment_3 ) ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7043:1: ( ( ( rule__RGB__GreenAssignment_3 ) ) )
            // InternalSiriusTextDsl.g:7044:1: ( ( rule__RGB__GreenAssignment_3 ) )
            {
            // InternalSiriusTextDsl.g:7044:1: ( ( rule__RGB__GreenAssignment_3 ) )
            // InternalSiriusTextDsl.g:7045:1: ( rule__RGB__GreenAssignment_3 )
            {
             before(grammarAccess.getRGBAccess().getGreenAssignment_3()); 
            // InternalSiriusTextDsl.g:7046:1: ( rule__RGB__GreenAssignment_3 )
            // InternalSiriusTextDsl.g:7046:2: rule__RGB__GreenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RGB__GreenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getGreenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__3__Impl"


    // $ANTLR start "rule__RGB__Group__4"
    // InternalSiriusTextDsl.g:7056:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7060:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // InternalSiriusTextDsl.g:7061:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__RGB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__5();

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
    // $ANTLR end "rule__RGB__Group__4"


    // $ANTLR start "rule__RGB__Group__4__Impl"
    // InternalSiriusTextDsl.g:7068:1: rule__RGB__Group__4__Impl : ( ',' ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7072:1: ( ( ',' ) )
            // InternalSiriusTextDsl.g:7073:1: ( ',' )
            {
            // InternalSiriusTextDsl.g:7073:1: ( ',' )
            // InternalSiriusTextDsl.g:7074:1: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__4__Impl"


    // $ANTLR start "rule__RGB__Group__5"
    // InternalSiriusTextDsl.g:7087:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7091:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // InternalSiriusTextDsl.g:7092:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_55);
            rule__RGB__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__6();

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
    // $ANTLR end "rule__RGB__Group__5"


    // $ANTLR start "rule__RGB__Group__5__Impl"
    // InternalSiriusTextDsl.g:7099:1: rule__RGB__Group__5__Impl : ( ( rule__RGB__BlueAssignment_5 ) ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7103:1: ( ( ( rule__RGB__BlueAssignment_5 ) ) )
            // InternalSiriusTextDsl.g:7104:1: ( ( rule__RGB__BlueAssignment_5 ) )
            {
            // InternalSiriusTextDsl.g:7104:1: ( ( rule__RGB__BlueAssignment_5 ) )
            // InternalSiriusTextDsl.g:7105:1: ( rule__RGB__BlueAssignment_5 )
            {
             before(grammarAccess.getRGBAccess().getBlueAssignment_5()); 
            // InternalSiriusTextDsl.g:7106:1: ( rule__RGB__BlueAssignment_5 )
            // InternalSiriusTextDsl.g:7106:2: rule__RGB__BlueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RGB__BlueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getBlueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__5__Impl"


    // $ANTLR start "rule__RGB__Group__6"
    // InternalSiriusTextDsl.g:7116:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7120:1: ( rule__RGB__Group__6__Impl )
            // InternalSiriusTextDsl.g:7121:2: rule__RGB__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RGB__Group__6__Impl();

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
    // $ANTLR end "rule__RGB__Group__6"


    // $ANTLR start "rule__RGB__Group__6__Impl"
    // InternalSiriusTextDsl.g:7127:1: rule__RGB__Group__6__Impl : ( ')' ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7131:1: ( ( ')' ) )
            // InternalSiriusTextDsl.g:7132:1: ( ')' )
            {
            // InternalSiriusTextDsl.g:7132:1: ( ')' )
            // InternalSiriusTextDsl.g:7133:1: ')'
            {
             before(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__Group__6__Impl"


    // $ANTLR start "rule__SiriusFile__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:7161:1: rule__SiriusFile__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__SiriusFile__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7165:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7166:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7166:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7167:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7176:1: rule__SiriusFile__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__SiriusFile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7180:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7181:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:7181:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7182:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7191:1: rule__SiriusFile__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__SiriusFile__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7195:1: ( ( ruleImport ) )
            // InternalSiriusTextDsl.g:7196:1: ( ruleImport )
            {
            // InternalSiriusTextDsl.g:7196:1: ( ruleImport )
            // InternalSiriusTextDsl.g:7197:1: ruleImport
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
    // InternalSiriusTextDsl.g:7206:1: rule__SiriusFile__BodyAssignment_4 : ( ruleSiriusFileBody ) ;
    public final void rule__SiriusFile__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7210:1: ( ( ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:7211:1: ( ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:7211:1: ( ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:7212:1: ruleSiriusFileBody
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
    // InternalSiriusTextDsl.g:7221:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7225:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:7226:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:7226:1: ( ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:7227:1: ruleQualifiedNameWithWildcard
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
    // InternalSiriusTextDsl.g:7236:1: rule__Designer__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Designer__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7240:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7241:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7241:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7242:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7251:1: rule__Designer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Designer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7255:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7256:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7256:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7257:1: RULE_ID
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
    // InternalSiriusTextDsl.g:7266:1: rule__Designer__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Designer__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7270:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7271:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7271:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7272:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7281:1: rule__Designer__ViewpointsAssignment_5 : ( ruleViewpoint ) ;
    public final void rule__Designer__ViewpointsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7285:1: ( ( ruleViewpoint ) )
            // InternalSiriusTextDsl.g:7286:1: ( ruleViewpoint )
            {
            // InternalSiriusTextDsl.g:7286:1: ( ruleViewpoint )
            // InternalSiriusTextDsl.g:7287:1: ruleViewpoint
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
    // InternalSiriusTextDsl.g:7296:1: rule__Viewpoint__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Viewpoint__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7300:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7301:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7301:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7302:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7311:1: rule__Viewpoint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Viewpoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7315:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7316:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7316:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7317:1: RULE_ID
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
    // InternalSiriusTextDsl.g:7326:1: rule__Viewpoint__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7330:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7331:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7331:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7332:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7341:1: rule__Viewpoint__ModelFileExtensionsAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__ModelFileExtensionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7345:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7346:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7346:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7347:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7356:1: rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__ModelFileExtensionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7360:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7361:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7361:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7362:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7371:1: rule__Viewpoint__IconAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Viewpoint__IconAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7375:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7376:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7376:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7377:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7386:1: rule__Viewpoint__RepresentationsAssignment_7_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Viewpoint__RepresentationsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7390:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7391:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7391:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7392:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
            // InternalSiriusTextDsl.g:7393:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7394:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7405:1: rule__Viewpoint__RepresentationsAssignment_7_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Viewpoint__RepresentationsAssignment_7_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7409:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7410:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7410:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7411:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
            // InternalSiriusTextDsl.g:7412:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7413:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7424:1: rule__Diagram__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Diagram__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7428:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7429:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7429:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7430:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7439:1: rule__Diagram__InitializedAssignment_1 : ( ( '@Initialized' ) ) ;
    public final void rule__Diagram__InitializedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7443:1: ( ( ( '@Initialized' ) ) )
            // InternalSiriusTextDsl.g:7444:1: ( ( '@Initialized' ) )
            {
            // InternalSiriusTextDsl.g:7444:1: ( ( '@Initialized' ) )
            // InternalSiriusTextDsl.g:7445:1: ( '@Initialized' )
            {
             before(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 
            // InternalSiriusTextDsl.g:7446:1: ( '@Initialized' )
            // InternalSiriusTextDsl.g:7447:1: '@Initialized'
            {
             before(grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSiriusTextDsl.g:7462:1: rule__Diagram__ShowOnStartupAssignment_2 : ( ( '@ShowOnStartup' ) ) ;
    public final void rule__Diagram__ShowOnStartupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7466:1: ( ( ( '@ShowOnStartup' ) ) )
            // InternalSiriusTextDsl.g:7467:1: ( ( '@ShowOnStartup' ) )
            {
            // InternalSiriusTextDsl.g:7467:1: ( ( '@ShowOnStartup' ) )
            // InternalSiriusTextDsl.g:7468:1: ( '@ShowOnStartup' )
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 
            // InternalSiriusTextDsl.g:7469:1: ( '@ShowOnStartup' )
            // InternalSiriusTextDsl.g:7470:1: '@ShowOnStartup'
            {
             before(grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSiriusTextDsl.g:7485:1: rule__Diagram__EnablePopupBarsAssignment_3 : ( ( '@EnablePopupBars' ) ) ;
    public final void rule__Diagram__EnablePopupBarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7489:1: ( ( ( '@EnablePopupBars' ) ) )
            // InternalSiriusTextDsl.g:7490:1: ( ( '@EnablePopupBars' ) )
            {
            // InternalSiriusTextDsl.g:7490:1: ( ( '@EnablePopupBars' ) )
            // InternalSiriusTextDsl.g:7491:1: ( '@EnablePopupBars' )
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 
            // InternalSiriusTextDsl.g:7492:1: ( '@EnablePopupBars' )
            // InternalSiriusTextDsl.g:7493:1: '@EnablePopupBars'
            {
             before(grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSiriusTextDsl.g:7508:1: rule__Diagram__MetamodelUrisAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Diagram__MetamodelUrisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7512:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7513:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7513:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7514:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7523:1: rule__Diagram__MetamodelUrisAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Diagram__MetamodelUrisAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7527:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7528:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7528:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7529:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7538:1: rule__Diagram__NameAssignment_10 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7542:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7543:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7543:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7544:1: RULE_ID
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
    // InternalSiriusTextDsl.g:7553:1: rule__Diagram__LabelAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__Diagram__LabelAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7557:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7558:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7558:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7559:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7568:1: rule__Diagram__DomainClassAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Diagram__DomainClassAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7572:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7573:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7573:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7574:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7583:1: rule__Diagram__PreconditionAssignment_14_1 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__PreconditionAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7587:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7588:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7588:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7589:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:7598:1: rule__Diagram__EndUserDocumentationAssignment_16_2 : ( RULE_STRING ) ;
    public final void rule__Diagram__EndUserDocumentationAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7602:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7603:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7603:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7604:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7613:1: rule__Diagram__TitleExpressionAssignment_17_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__TitleExpressionAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7617:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7618:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7618:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7619:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:7628:1: rule__Diagram__RootExpressionAssignment_18_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Diagram__RootExpressionAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7632:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7633:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7633:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7634:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:7643:1: rule__Diagram__DefaultLayerAssignment_19_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__DefaultLayerAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7647:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7648:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7648:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7649:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
            // InternalSiriusTextDsl.g:7650:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7651:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7662:1: rule__Diagram__AdditionalLayersAssignment_20_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__AdditionalLayersAssignment_20_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7666:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7667:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7667:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7668:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 
            // InternalSiriusTextDsl.g:7669:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7670:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7681:1: rule__Diagram__AdditionalLayersAssignment_20_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Diagram__AdditionalLayersAssignment_20_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7685:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7686:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7686:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7687:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 
            // InternalSiriusTextDsl.g:7688:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7689:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7700:1: rule__Layer__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Layer__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7704:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7705:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7705:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7706:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7715:1: rule__Layer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7719:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7720:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7720:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7721:1: RULE_ID
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
    // InternalSiriusTextDsl.g:7730:1: rule__Layer__IconAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Layer__IconAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7734:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7735:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7735:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7736:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7745:1: rule__Layer__MappingsAssignment_8_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__MappingsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7749:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7750:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7750:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7751:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 
            // InternalSiriusTextDsl.g:7752:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7753:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7764:1: rule__Layer__MappingsAssignment_8_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Layer__MappingsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7768:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7769:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7769:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7770:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 
            // InternalSiriusTextDsl.g:7771:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7772:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7783:1: rule__Container__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Container__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7787:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7788:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7788:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7789:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7798:1: rule__Container__ListAssignment_1 : ( ( 'list' ) ) ;
    public final void rule__Container__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7802:1: ( ( ( 'list' ) ) )
            // InternalSiriusTextDsl.g:7803:1: ( ( 'list' ) )
            {
            // InternalSiriusTextDsl.g:7803:1: ( ( 'list' ) )
            // InternalSiriusTextDsl.g:7804:1: ( 'list' )
            {
             before(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 
            // InternalSiriusTextDsl.g:7805:1: ( 'list' )
            // InternalSiriusTextDsl.g:7806:1: 'list'
            {
             before(grammarAccess.getContainerAccess().getListListKeyword_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSiriusTextDsl.g:7821:1: rule__Container__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7825:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7826:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7826:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:7827:1: RULE_ID
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
    // InternalSiriusTextDsl.g:7836:1: rule__Container__LabelAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Container__LabelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7840:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7841:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7841:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7842:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7851:1: rule__Container__DomainClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Container__DomainClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7855:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:7856:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:7856:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:7857:1: RULE_STRING
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
    // InternalSiriusTextDsl.g:7866:1: rule__Container__StyleAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Container__StyleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7870:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7871:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7871:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7872:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            // InternalSiriusTextDsl.g:7873:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7874:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7885:1: rule__Container__PreconditionAssignment_9_1 : ( RULE_EXPRESSION ) ;
    public final void rule__Container__PreconditionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7889:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7890:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7890:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7891:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:7900:1: rule__Container__SemanticCanditatesExpressionAssignment_11_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Container__SemanticCanditatesExpressionAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7904:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7905:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7905:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7906:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:7915:1: rule__Container__ConditionalStylesAssignment_12 : ( ruleConditionalContainerStyleDeclaration ) ;
    public final void rule__Container__ConditionalStylesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7919:1: ( ( ruleConditionalContainerStyleDeclaration ) )
            // InternalSiriusTextDsl.g:7920:1: ( ruleConditionalContainerStyleDeclaration )
            {
            // InternalSiriusTextDsl.g:7920:1: ( ruleConditionalContainerStyleDeclaration )
            // InternalSiriusTextDsl.g:7921:1: ruleConditionalContainerStyleDeclaration
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
    // InternalSiriusTextDsl.g:7930:1: rule__ConditionalContainerStyleDeclaration__StyleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ConditionalContainerStyleDeclaration__StyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7934:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:7935:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:7935:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:7936:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            // InternalSiriusTextDsl.g:7937:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:7938:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:7949:1: rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3 : ( RULE_EXPRESSION ) ;
    public final void rule__ConditionalContainerStyleDeclaration__ConditionalStyleExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7953:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:7954:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:7954:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:7955:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:7964:1: rule__Gradient__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Gradient__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7968:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:7969:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:7969:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:7970:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:7979:1: rule__Gradient__DirectionAssignment_2 : ( ruleGradientDirection ) ;
    public final void rule__Gradient__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7983:1: ( ( ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:7984:1: ( ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:7984:1: ( ruleGradientDirection )
            // InternalSiriusTextDsl.g:7985:1: ruleGradientDirection
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
    // InternalSiriusTextDsl.g:7994:1: rule__Gradient__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Gradient__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:7998:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:7999:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:7999:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:8000:1: RULE_ID
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
    // InternalSiriusTextDsl.g:8009:1: rule__Gradient__BackgroundColorAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__BackgroundColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8013:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:8014:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:8014:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:8015:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            // InternalSiriusTextDsl.g:8016:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:8017:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:8028:1: rule__Gradient__ForegroundColorAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__ForegroundColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8032:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:8033:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:8033:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:8034:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            // InternalSiriusTextDsl.g:8035:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:8036:1: ruleQualifiedName
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


    // $ANTLR start "rule__Gradient__LabelAlignmentAssignment_9_1"
    // InternalSiriusTextDsl.g:8047:1: rule__Gradient__LabelAlignmentAssignment_9_1 : ( ruleLabelAlignment ) ;
    public final void rule__Gradient__LabelAlignmentAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8051:1: ( ( ruleLabelAlignment ) )
            // InternalSiriusTextDsl.g:8052:1: ( ruleLabelAlignment )
            {
            // InternalSiriusTextDsl.g:8052:1: ( ruleLabelAlignment )
            // InternalSiriusTextDsl.g:8053:1: ruleLabelAlignment
            {
             before(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelAlignment();

            state._fsp--;

             after(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__LabelAlignmentAssignment_9_1"


    // $ANTLR start "rule__Gradient__LabelExpressionAssignment_9_2"
    // InternalSiriusTextDsl.g:8062:1: rule__Gradient__LabelExpressionAssignment_9_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__LabelExpressionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8066:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:8067:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:8067:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:8068:1: RULE_EXPRESSION
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
    // InternalSiriusTextDsl.g:8077:1: rule__Gradient__LabelColorAssignment_9_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__LabelColorAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8081:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:8082:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:8082:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:8083:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
            // InternalSiriusTextDsl.g:8084:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:8085:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:8096:1: rule__Gradient__BorderSizeAssignment_10_3 : ( RULE_INT ) ;
    public final void rule__Gradient__BorderSizeAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8100:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:8101:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:8101:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:8102:1: RULE_INT
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
    // InternalSiriusTextDsl.g:8111:1: rule__Gradient__BorderColorAssignment_10_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Gradient__BorderColorAssignment_10_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8115:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:8116:1: ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:8116:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:8117:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
            // InternalSiriusTextDsl.g:8118:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:8119:1: ruleQualifiedName
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
    // InternalSiriusTextDsl.g:8130:1: rule__Gradient__IconAssignment_11_2 : ( RULE_STRING ) ;
    public final void rule__Gradient__IconAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8134:1: ( ( RULE_STRING ) )
            // InternalSiriusTextDsl.g:8135:1: ( RULE_STRING )
            {
            // InternalSiriusTextDsl.g:8135:1: ( RULE_STRING )
            // InternalSiriusTextDsl.g:8136:1: RULE_STRING
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


    // $ANTLR start "rule__Gradient__HeightComputationExpressionAssignment_12_2"
    // InternalSiriusTextDsl.g:8145:1: rule__Gradient__HeightComputationExpressionAssignment_12_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__HeightComputationExpressionAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8149:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:8150:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:8150:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:8151:1: RULE_EXPRESSION
            {
             before(grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__HeightComputationExpressionAssignment_12_2"


    // $ANTLR start "rule__Gradient__WidthComputationExpressionAssignment_13_2"
    // InternalSiriusTextDsl.g:8160:1: rule__Gradient__WidthComputationExpressionAssignment_13_2 : ( RULE_EXPRESSION ) ;
    public final void rule__Gradient__WidthComputationExpressionAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8164:1: ( ( RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:8165:1: ( RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:8165:1: ( RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:8166:1: RULE_EXPRESSION
            {
             before(grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
            match(input,RULE_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradient__WidthComputationExpressionAssignment_13_2"


    // $ANTLR start "rule__Palette__DocumentationAssignment_0"
    // InternalSiriusTextDsl.g:8175:1: rule__Palette__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Palette__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8179:1: ( ( RULE_DOCUMENTATION ) )
            // InternalSiriusTextDsl.g:8180:1: ( RULE_DOCUMENTATION )
            {
            // InternalSiriusTextDsl.g:8180:1: ( RULE_DOCUMENTATION )
            // InternalSiriusTextDsl.g:8181:1: RULE_DOCUMENTATION
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
    // InternalSiriusTextDsl.g:8190:1: rule__Palette__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Palette__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8194:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:8195:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:8195:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:8196:1: RULE_ID
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
    // InternalSiriusTextDsl.g:8205:1: rule__Palette__ColorsAssignment_4 : ( ruleColor ) ;
    public final void rule__Palette__ColorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8209:1: ( ( ruleColor ) )
            // InternalSiriusTextDsl.g:8210:1: ( ruleColor )
            {
            // InternalSiriusTextDsl.g:8210:1: ( ruleColor )
            // InternalSiriusTextDsl.g:8211:1: ruleColor
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
    // InternalSiriusTextDsl.g:8220:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8224:1: ( ( RULE_ID ) )
            // InternalSiriusTextDsl.g:8225:1: ( RULE_ID )
            {
            // InternalSiriusTextDsl.g:8225:1: ( RULE_ID )
            // InternalSiriusTextDsl.g:8226:1: RULE_ID
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
    // InternalSiriusTextDsl.g:8235:1: rule__Color__ValueAssignment_3 : ( ruleColorValue ) ;
    public final void rule__Color__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8239:1: ( ( ruleColorValue ) )
            // InternalSiriusTextDsl.g:8240:1: ( ruleColorValue )
            {
            // InternalSiriusTextDsl.g:8240:1: ( ruleColorValue )
            // InternalSiriusTextDsl.g:8241:1: ruleColorValue
            {
             before(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RGB__RedAssignment_1"
    // InternalSiriusTextDsl.g:8250:1: rule__RGB__RedAssignment_1 : ( RULE_INT ) ;
    public final void rule__RGB__RedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8254:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:8255:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:8255:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:8256:1: RULE_INT
            {
             before(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__RedAssignment_1"


    // $ANTLR start "rule__RGB__GreenAssignment_3"
    // InternalSiriusTextDsl.g:8265:1: rule__RGB__GreenAssignment_3 : ( RULE_INT ) ;
    public final void rule__RGB__GreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8269:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:8270:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:8270:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:8271:1: RULE_INT
            {
             before(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__GreenAssignment_3"


    // $ANTLR start "rule__RGB__BlueAssignment_5"
    // InternalSiriusTextDsl.g:8280:1: rule__RGB__BlueAssignment_5 : ( RULE_INT ) ;
    public final void rule__RGB__BlueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSiriusTextDsl.g:8284:1: ( ( RULE_INT ) )
            // InternalSiriusTextDsl.g:8285:1: ( RULE_INT )
            {
            // InternalSiriusTextDsl.g:8285:1: ( RULE_INT )
            // InternalSiriusTextDsl.g:8286:1: RULE_INT
            {
             before(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGB__BlueAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8804480100180020L,0x0000000000000007L});
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x8000000100000020L,0x0000000000000003L});
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
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000020L,0x0000000000000004L});
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
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000000L});

}